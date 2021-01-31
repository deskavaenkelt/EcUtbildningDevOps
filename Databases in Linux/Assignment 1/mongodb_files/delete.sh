db.bank_accounts.count()
delete_criteria = {first_name: "Lars"}
db.bank_accounts.find(delete_criteria)
db.bank_accounts.deleteOne(delete_criteria)
db.bank_accounts.find(delete_criteria)
db.bank_accounts.count()