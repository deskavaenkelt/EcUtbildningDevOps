show dbs

use bank

show collections

db.createCollection("bank_accounts")
db.bank_accounts.find()
db.bank_accounts.count()
db.bank_accounts.drop()

// Part 1
db.createCollection("locations")

db.locations.insertMany([
    { id: 1, country: "SE", address: "Vimmerbygatan 20" },
    { id: 2, country: "US", address: "Asteroid road 5" },
    { id: 3, country: "US", address: "Comet road 41" },
    { id: 4, country: "SE", address: "Brunnsgatan 7" }
])

db.locations.find()
