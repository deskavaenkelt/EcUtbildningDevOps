from app import app
from flaskext.mysql import MySQL

mysql = MySQL()

# MySQL configurations
# Replace USERNAME with your MySQL USERNAME
app.config['MYSQL_DATABASE_USER'] = 'USERNAME'

# Replace PASSWORD with your MySQL PASSWORD
app.config['MYSQL_DATABASE_PASSWORD'] = 'PASSWORD'
app.config['MYSQL_DATABASE_DB'] = 'diamonds'
app.config['MYSQL_DATABASE_HOST'] = 'localhost'
mysql.init_app(app)
