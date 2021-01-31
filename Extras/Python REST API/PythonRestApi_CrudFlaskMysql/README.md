# Python REST API - CRUD, Flask, MySQL

## Requirements
- Flask `pip install Flask`
- flask-mysql `pip install flask-mysql`
- bcrypt `pip install bcrypt`


## Python run project
- `python main.py`


## API endpoints

### GET
#### All users
`http://localhost:5000/users`

#### Single User
`http://localhost:5000/user/4`

### POST
#### Add user

`http://localhost:5000/add`
``` json
{
	"name":"someone",
	"email":"someone@mail.com",
	"pwd":"password"
}
```
### POST
#### Add user

`http://localhost:5000/add`
``` json
{
	"name":"someone",
	"email":"someone@mail.com",
	"pwd":"password"
}
```

### PUT
#### Update user

`http://localhost:5000/update`
``` json
{
	"id":4,
	"name":"someone else",
	"email":"someone_else@mail.com",
	"pwd":"pwd"
}
```

### DELETE
#### Delete user

`http://localhost:5000/delete/4`