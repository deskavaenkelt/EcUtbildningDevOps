// Verify import
show dbs
use bank
// db.dropDatabase()
show collections
db.bank_accounts.find()
db.bank_accounts.count()

// CRUD
// Create
db.bank_accounts.count()
db.bank_accounts.insertOne(
    {
        id: 1001,
        first_name: "Larss",
        last_name: "Dsves",
        holding: 667
    }
    )
db.bank_accounts.count()

// Read
db.bank_accounts.find()
db.bank_accounts.find({first_name: "Larss"})
db.bank_accounts.find({"holding": 667})
db.bank_accounts.find({"id": 667})

// Update
update_criteria = {id: 1001}
db.bank_accounts.find(update_criteria)

update_frist_name = {$set: {first_name: "Lars"}}
update_last_name = {$set: {last_name: "Dsve"}}
update_holding = {$set: {holding: 666}}

db.bank_accounts.updateOne(update_criteria, update_frist_name)
db.bank_accounts.updateOne(update_criteria, update_last_name)
db.bank_accounts.updateOne(update_criteria, update_holding)

after_update_criteria = {first_name: "Lars"}
db.bank_accounts.find(after_update_criteria)

// Delete
db.bank_accounts.count()
delete_criteria = {first_name: "Lars"}
db.bank_accounts.find(delete_criteria)
db.bank_accounts.deleteOne(delete_criteria)
db.bank_accounts.find(delete_criteria)
db.bank_accounts.count()
