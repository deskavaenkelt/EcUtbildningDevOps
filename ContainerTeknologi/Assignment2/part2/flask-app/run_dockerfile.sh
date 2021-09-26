echo ---------------------------------------------
echo run docker container
echo ---------------------------------------------
docker build -t deskavaenkelt/flask-app .
docker run -p 5000:5000 -d --name dsve-flask-app deskavaenkelt/flask-app

echo ---------------------------------------------
echo Give server time to be able to respond
echo ---------------------------------------------
sleep 1

echo ---------------------------------------------
echo print response from server
echo ---------------------------------------------
curl localhost:5000
echo
echo ---------------------------------------------
echo stop docker container
echo ---------------------------------------------
docker stop dsve-flask-app

echo ---------------------------------------------
echo Push to DockerHub
echo ---------------------------------------------
docker push deskavaenkelt/flask-app

echo ---------------------------------------------
echo Cleanup/remove container
echo ---------------------------------------------
docker container rm dsve-flask-app
docker rmi deskavaenkelt/flask-app

echo ---------------------------------------------
echo Done
echo ---------------------------------------------