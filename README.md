# Introduction 

This is sample starter app

# Prerequisites 
 * Docker
 * Docker-compose
 * Java 8
 * Maven 3.3+
 
## Installation
### Docker 

[Download link](https://store.docker.com/editions/community/docker-ce-desktop-mac)

You'll need to login using your docker credentials

### Native Install 
If docker doesnt work you can always try to install postgres locally

#### OSX
```
brew install postgres
```

#### Linux(Deb)
```
sudo apt-get install postgres

```
 
# What needs to be done

 * Implement micro service with a Rest API which would return JSON response provided in example/response.json sample file.
 * Implement ability to search for properties and etc via RESTful API
 * Implement ability to filter result via API 

# How to run dependencies

### To Start dependencies

```
docker-compose -f docker-postgres.yml up
```



### To build and run tests

```
mvn verify

```

### To start WebService

 ```
 mvn spring-boot:run
 
 ```
 
 