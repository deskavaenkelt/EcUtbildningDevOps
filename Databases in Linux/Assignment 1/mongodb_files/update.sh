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