// Part 2 - First attempt
// think tank section start
db.createCollection("relationship")

db.locations.find({ country: "SE" })

db.locations.find({}, { Username: 1 })
db.locations.find({ country: "SE" }, { _id: 1 })

location_id_1 = db.locations.find(
    { $and: [{ country: "SE" }, { address: "Vimmerbygatan 20" }] }, { id: 1, _id: 0 })
location_id_2 = db.locations.find(
    { $and: [{ country: "US", address: "Asteroid road 5" }] }, { id: 1, _id: 0 })
location_id_3 = db.locations.find(
    { $and: [{ country: "US", address: "Comet road 41" }] }, { id: 1, _id: 0 })
location_id_4 = db.locations.find(
    { $and: [{ country: "SE", address: "Brunnsgatan 7" }] }, { id: 1, _id: 0 })

user_id_1 = db.bank_accounts.find(
    { $and: [{ first_name: "Gray", last_name: "Geldard" }] }, { id: 1, _id: 0 })
user_id_2 = db.bank_accounts.find(
    { $and: [{ first_name: "Faith", last_name: "Scoon" }] }, { id: 1, _id: 0 })
user_id_3 = db.bank_accounts.find(
    { $and: [{ first_name: "Jody", last_name: "Merrall" }] }, { id: 1, _id: 0 })
user_id_4 = db.bank_accounts.find(
    { $and: [{ first_name: "Modesta", last_name: "Featherstonhaugh" }] }, { id: 1, _id: 0 })

db.relationship.insertMany([
    { bank_accounts_id: user_id_1, locations_id: location_id_4 },
    { bank_accounts_id: user_id_2, locations_id: location_id_2 },
    { bank_accounts_id: user_id_3, locations_id: location_id_1 },
    { bank_accounts_id: user_id_4, locations_id: location_id_3 },
])
// think tank section end
// Correction
db.relationship.drop()

// Part 2 - Second attempt
db.locations.find()
db.bank_accounts.find()

gray_update_criteria = { $and: [{ first_name: "Gray", last_name: "Geldard" }] }
gray_update_address = {
    $set: {
        address: [
            {
                $ref: "locations",
                $id: ObjectId("602ed661a4601e69cac21163")
            }
        ]
    }
}

faith_update_criteria = { $and: [{ first_name: "Faith", last_name: "Scoon" }] }
faith_update_address = {
    $set: {
        address: [
            {
                $ref: "locations",
                $id: ObjectId("602ed661a4601e69cac21161")
            }
        ]
    }
}

jody_update_criteria = { $and: [{ first_name: "Jody", last_name: "Merrall" }] }
jody_update_address = {
    $set: {
        address: [
            {
                $ref: "locations",
                $id: ObjectId("602ed661a4601e69cac21160")
            }
        ]
    }
}

modesta_update_criteria = { $and: [{ first_name: "Modesta", last_name: "Featherstonhaugh" }] }
modesta_update_address = {
    $set: {
        address: [
            {
                $ref: "locations",
                $id: ObjectId("602ed661a4601e69cac21162")
            }
        ]
    }
}

option = { multi: true }

db.bank_accounts.find(gray_update_criteria)
db.bank_accounts.find(faith_update_criteria)
db.bank_accounts.find(jody_update_criteria)
db.bank_accounts.find(modesta_update_criteria)

db.bank_accounts.updateOne(gray_update_criteria, gray_update_address)
db.bank_accounts.updateOne(faith_update_criteria, faith_update_address)
db.bank_accounts.updateOne(jody_update_criteria, jody_update_address)
db.bank_accounts.updateOne(modesta_update_criteria, modesta_update_address)

db.bank_accounts.find()

db.bank_accounts.aggregate({
    $lookup: {
        from: "locations",
        localField: "address.$id",
        foreignField: "locations._id",
        as: "locations"
    }
})

// Part 2 - Third attempt
db.bank_accounts.drop()
db.bank_accounts.find()

db.bank_accounts.updateOne(
    { $and: [{ first_name: "Gray", last_name: "Geldard" }] },
    { $set: { location: [{ country: "SE" }, { address: "Brunnsgatan 7" }] } }
)

db.bank_accounts.updateOne(
    { $and: [{ first_name: "Faith", last_name: "Scoon" }] },
    { $set: { location: [{ country: "US" }, { address: "Asteroid road 5" }] } }
)

db.bank_accounts.updateOne(
    { $and: [{ first_name: "Jody", last_name: "Merrall" }] },
    { $set: { location: [{ country: "SE" }, { address: "Vimmerbygatan 20" }] } }
)

db.bank_accounts.updateOne(
    { $and: [{ first_name: "Modesta", last_name: "Featherstonhaugh" }] },
    { $set: { location: [{ country: "US" }, { address: "Comet road 41" }] } }
)
