#!/bin/bash

# This file is for VMWare environment

echo ---------------------------------------------
echo Purge other docker versions
echo ---------------------------------------------
sudo apt-get remove docker docker-engine docker.io containerd runc -y
sudo apt-get purge docker-ce docker-ce-cli containerd.io -y
sudo rm -rf /var/lib/docker
sudo rm -rf /var/lib/containerd

echo ---------------------------------------------
echo Update with latest packages
echo ---------------------------------------------
sudo apt update && sudo apt upgrade -y

echo ---------------------------------------------
echo Install docker
echo ---------------------------------------------
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh

echo ---------------------------------------------
echo Clone assignment test repo
echo ---------------------------------------------
git clone https://github.com/AlexisFlach/my-cool-portfolio.git
cd my-cool-portfolio/django

echo ---------------------------------------------
echo Build docker image
echo ---------------------------------------------
sudo docker build -f Dockerfile.dev -t devimage .


echo ---------------------------------------------
echo Run docker image detached
echo ---------------------------------------------
sudo docker run -d -p 8000:8000 devimage

echo ---------------------------------------------
echo Show running containers
echo ---------------------------------------------
sudo docker container ls

echo ---------------------------------------------
echo Get index.html
echo ---------------------------------------------
wget 0.0.0.0:8000

echo ---------------------------------------------
echo Show content of index.html
echo ---------------------------------------------
cat index.html