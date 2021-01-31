# Python REST API Similarity VCompare between two texts

## Note
Project are tested on Linux (Pop!_OS)

## Requirements
- [Docker](https://docs.docker.com/get-docker/)
- [Docker-Compose](https://docs.docker.com/compose/install/)
- [MongoDB](https://docs.mongodb.com/manual/installation/)
- [Python](https://www.python.org/)
- [Pip](https://docs.python.org/3/installing/index.html)


## Python requirements
- Flask `pip install Flask`
- flask_restful `pip install flask_restful`
- pymongo` pip install pymongo`
- bcrypt `pip install bcrypt`
- spacy `pip install spacy`
- Language model `pip install https://github.com/explosion/spacy-models/releases/download/en_core_web_sm-2.2.0/en_core_web_sm-2.2.0.tar.gz`


## Flask run project
- `export FLASK_APP=app.py`
- `flask run`


## Docker
- `docker-compose build`
- `docker-compose up`


## API endpoints

### GET
- `/` index.html
  

### POST
#### `localhost/register`
``` json
{
	"username": "Eva",
	"password": "SuperSecretPassword"
}
```

#### `localhost/detect`
``` json
{
	"username": "Eva",
	"password": "SuperSecretPassword",
	"text1": "This is a cute dog",
	"text2": "The dog is cute"
}
```


### PUT
#### `localhost/refill`
``` json
{
	"username": "Eva",
	"admin_pw": "abc123",
	"refill": 4
}
```
