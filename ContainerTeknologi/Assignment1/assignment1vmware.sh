#!/bin/bash

# This file is for VMWare environment

# Update with latest packages
sudo apt update && sudo upgrade -y

# Install docker
curl -fsSL https://get.docker.com -o get-docker.sh
sh get-docker.sh

# Clone assignment test repo
git clone https://github.com/AlexisFlach/my-cool-portfolio.git
cd my-cool-portfolio/django

# Build docker image
docker build -f Dockerfile.dev -t devimage .

# Run docker image detached
docker run -d devimage

lars