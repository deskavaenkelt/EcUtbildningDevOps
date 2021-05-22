# Automation Frameworks

## Table of content

- [](#)
- [](#)
- [](#)
- [](#)

# Ansible

# Jenkins

# Docker

```dockerfile
version: '3'
services:
  jenkins:
    container_name: jenkins
    image: jenkins/jenkins
    ports: 
      - "8080:8080"
    volumes:
      - $PWD/jenkins_home:/var/jenkins_home
    networks:
      - net
networks:
  net:
```


