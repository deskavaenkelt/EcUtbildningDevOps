#!/bin/bash
echo ---------------------------------------------
echo Create React-Application
echo ---------------------------------------------
npx create-react-app multi-stage

echo ---------------------------------------------
echo Copy preped Dockerfile to project folder
echo ---------------------------------------------
cp Dockerfile_for_multi_stage ./multi-stage/Dockerfile

echo ---------------------------------------------
echo Enter project folder
echo ---------------------------------------------
cd multi-stage

echo ---------------------------------------------
echo Build project
echo ---------------------------------------------
docker build -t deskavaenkel/docker-react-app .

echo ---------------------------------------------
echo Run project om port 80
echo ---------------------------------------------
docker run -p 80:80 -d --name docker-react-app deskavaenkel/docker-react-app

echo ---------------------------------------------
echo Show running containers
echo ---------------------------------------------
docker container ls

echo ---------------------------------------------
echo Give server time to be able to respond
echo ---------------------------------------------
sleep 1

echo ---------------------------------------------
echo print response from server
echo http://localhost:80
echo ---------------------------------------------
curl localhost:80
echo
echo ---------------------------------------------
echo stop docker container
echo ---------------------------------------------
docker stop docker-react-app

echo ---------------------------------------------
echo Cleanup/remove container
echo ---------------------------------------------
docker container rm docker-react-app
docker rmi deskavaenkel/docker-react-app

echo ---------------------------------------------
echo Done
echo ---------------------------------------------