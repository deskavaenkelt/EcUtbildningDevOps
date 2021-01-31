# Python REST API - CRUD, Flask, MySQL

## Requirements
- MySQL Server running on your computer
    - Credentials to connect
- Flask `pip install Flask`
- flask-mysql `pip install flask-mysql`

## Setup
- Create and configure database by run commands in `diamonds.sql`
- Enter your MySQL credentials in `db_config.py`
- Run `import_csv_to_mysql.py` to populate the database

## Python run project
- `python main.py`

## API endpoints

### GET
#### Show all diamonds
`http://localhost:5000/diamonds`

#### Show diamond with id
`http://localhost:5000/diamonds/4`
