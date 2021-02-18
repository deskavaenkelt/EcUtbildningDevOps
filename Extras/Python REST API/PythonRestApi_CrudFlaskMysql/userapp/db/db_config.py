from userapp import app
from flaskext.mysql import MySQL

from cred import USERNAME, PASSWORD

mysql = MySQL()

# MySQL configurations
app.config['MYSQL_DATABASE_USER'] = USERNAME  # Replace USERNAME with your MySQL USERNAME
app.config['MYSQL_DATABASE_PASSWORD'] = PASSWORD  # Replace PASSWORD with your MySQL PASSWORD
app.config['MYSQL_DATABASE_DB'] = 'api_uses'
app.config['MYSQL_DATABASE_HOST'] = 'localhost'
mysql.init_app(app)
