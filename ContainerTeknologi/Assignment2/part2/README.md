# Part 2 Practical

## Table of Contents

- [Setup](#setup)
- [Flask App](#flask-app)
- [Multi-stage Build](#multi-stage-build)
- [](#)
- [](#)

## Setup

On your computer: Create a folder called the `flask-app`.

In this folder you create three files and copy the respective code in the files.

[`app.py`](flask-app/app.py)

```python
from flask import Flask

app = Flask(__name__)


@app.route('/')
def index():
    return '<h1>Hello World</h1>'


if __name__ == '__main__':
    app.run(host='0.0.0.0')
```

[`requirements.txt`](flask-app/requirements.txt)

```text
Flask==2.0.1
```

[`donotinclude.txt`](flask-app/donotinclude.txt)

```text
textthatshouldnotbeincluded
```

## Flask App

## Multi-stage Build

Create a folder named multi-stage.

In this folder you create two files and copy the respective code in the files.

`index.html`

```html
<h1>Hello World</h1>
```

`nginx.conf`

```nginx.conf
server {
  listen 80;

  location / {
    root /usr/share/nginx/html;
    index index.html;
  }
}
```


