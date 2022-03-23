# Project

Deploy a web application, with your name in it, using CodePipeline. The code for your web app must be checked in by
CodeCommit.

- Good: Deploya on an EC2 instance
- A little better: Deploya on two load-balanced EC2 instances
- Better: Containerize (Docker) your application and deploy on ECS
- Best: Containerize (Docker) your application and deploy on a load balanced ECS
- A little better than best: Also serve a lolcat image that you uploaded to S3 from your web app.

Describe in words and pictures how to set up your CodePipeline. Also report how you designed the security around the
solution.

Credentials:
Username: newDevUser-at-782752386046 Password: TWjvUsIMramg/JhX6BnTHZLz5W4urMv7fgz/5+ii4ig=

# Guide

I have followed [this AWS guide](https://docs.aws.amazon.
com/codepipeline/latest/userguide/tutorials-simple-codecommit.html) for this project.

## Workflow

### Create CodeCommit repository

![](img/1.png)
![](img/2.png)
![](img/3.png)

### Add role

![](img/4.png)
![](img/5.png)
![](img/6.png)
![](img/7.png)
![](img/8.png)
![](img/9.png)

### Add Git Credentials

![](img/10.png)
![](img/11.png)

### Clone repository

![](img/12.png)

### Add Readme

![](img/13.png)

### Add Simple html and config files 

![](img/14.png)
![](img/15.png)

### Create an EC2 Linux instance and install the CodeDeploy agent

#### Create an instance role

![](img/16.png)
![](img/17.png)
![](img/18.png)
![](img/19.png)
![](img/20.png)
![](img/21.png)

#### Create EC2 Instance

![](img/22.png)
![](img/23.png)
![](img/24.png)
![](img/25.png)
![](img/26.png)
![](img/27.png)
![](img/28.png)
![](img/29.png)
![](img/30.png)
![](img/31.png)
![](img/32.png)
![](img/33.png)
![](img/34.png)

### Create an application in CodeDeploy

#### Create a CodeDeploy service role

![](img/35.png)
![](img/36.png)
![](img/37.png)
![](img/38.png)
![](img/39.png)

#### Create an application in CodeDeploy

![](img/40.png)
![](img/41.png)
![](img/42.png)

#### Create a deployment group in CodeDeploy

![](img/43.png)
![](img/44.png)
![](img/45.png)
![](img/46.png)

### Create pipeline in CodePipeline

![](img/47.png)
![](img/48.png)
![](img/49.png)
![](img/50.png)
![](img/51.png)
![](img/52.png)
![](img/53.png)
![](img/54.png)
![](img/55.png)
![](img/56.png)

### Forget to add a `script`folder to the project, so I fixed it

![](img/57.png)
![](img/58.png)

### Successful pipeline

![](img/59.png)

### Result

![](img/60.png)

Using `http` instead of `https` because I forgot to open port 443.

### Pipeline reruns on changes

![](img/61.png)
![](img/62.png)
![](img/63.png)
![](img/64.png)
![](img/65.png)
