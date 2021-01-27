# PythonRestApi_Sentences

## Requirements
- Flask `pip install Flask`
- flask_restfull `pip install flask_restful`
- pymongo `pip install pymongo`
- PY-BCRYPT `pip install bcrypt`

## Flask run project
- `export FLASK_APP=app.py`
- `flask run`


## Docker
- `docker-compose build`
- `docker-compose up`

## API endpoints
  
### POST
- `/register`
- `/store`
- `/get`

#### POST format in JSON
#### /register
``` json
{
	"username": "Lars",
	"password": "123456"
}
```

#### /register
``` store
{
	"username": "Lars",
	"password": "123456",
	"sentence": "My sentence"
}
```

#### /get
``` json
{
	"username": "Lars",
	"password": "123456"
}
```