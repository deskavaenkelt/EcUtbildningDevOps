#!/bin/bash

# This file is for VMWare environment

# Update with latest packages
sudo apt update && sudo apt upgrade -y

# Install docker
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh

# Clone assignment test repo
git clone https://github.com/AlexisFlach/my-cool-portfolio.git
cd my-cool-portfolio/django

# Build docker image
sudo docker build -f Dockerfile.dev -t devimage .

# Run docker image detached
sudo docker run -d -p 8000:8000 devimage

# show running containers
sudo docker container ls

wget 0.0.0.0:8000