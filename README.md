# qa-web-online-shop
* This is an automation project based on [Serenity and Cucumber Integration](https://serenity-bdd.github.io/theserenitybook/latest/cucumber.html)
* [Serenity BDD](http://thucydides.info/docs/serenity-staging/) is an open source library that aims to make the idea of living documentation a reality.

## Requirements
* java >=10
* maven
* docker

## Setup
* Clone the repo
* mvn clean

## Contents 

|**Folder** | **Content**  |
|---       | ---         |
| [src/test/resources/features](src/test/resources/features)  |  Cucumber feature files grouped in business areas      |
| [src/test/resources/actors](src/test/resources/actors)|  Json file representation of test users, used on scenarios as actors. Named actors represent real test users in database     |
| [src/test/java/com/amazon/qa/pages](src/test/java/com/amazon/qa/pages) |  Page Objects      |
| [src/test/java/com/amazon/qa/steps](src/test/java/com/amazon/qa/steps) |  Serenity step libraries     |
| [src/test/java/com/amazon/qa/scenario_steps](src/test/java/com/amazon/qa/scenario_steps) |  Scenario step definitions for the Cucumber scenarios inside test stories     |
| [seleniumhub-scripts](seleniumhub-scripts) |  Scripts to run the docker selenium hub on a remote machine     |

## Overview

With this framework I want to promote acceptance testing based on high level scenarios that relate to business features and the behavior of the product with the following benefits:

* Provide reliable feedback on product behavior
* Living documentation on business features from the Serenity reports
* Minimise maintenance work after web changes
* Reuse code, starting with scenario steps and then down


Some guides about the topics covered in this framework:
* [Serenity Manual](http://thucydides.info/docs/serenity-staging/)
* [Gherkin syntax](https://cucumber.io/docs/reference)
* [Cucumber](https://cucumber.io/docs/guides/)


## How to run the test
### execute docker compose script to have the selenium hub  ready:
```
1. go to seleniumScripts folder
2. execute run-selenium-hub.sh : ./run-selenium-hub.sh  
note: in case that script does not work execute execiute "docker-compose -f selenium-hub.yaml up --force-recreate -d" 
3 after execute command you should be able to  execute the test in "http://localhost:8888/wd/hub" 

```
### To run tests on your machine:
```
mvn clean verify -Dcontext=chrome  -Dwebdriver.remote.url=http://localhost:8888/wd/hub"
mvn clean verify -Dcontext=firefox  -Dwebdriver.remote.url=http://localhost:8888/wd/hub"

```
Here we are not calling the maven target "clean" on the second test run. We do that to prevent maven from deleting the Serenity reports generated on the first test run.

## Running scenarios by tag
Sometimes it's useful to execute only a single feature file using tags, especially when you are debugging: https://johnfergusonsmart.com/running-individual-scenarios-jbehave-cucumber-serenity-bdd/
To do so:
```
mvn clean verify -Dcucumber.options="--tags @smoke"
 
 mvn clean verify -Dcontext=chrome  -Dwebdriver.remote.url=http://localhost:8888/wd/hub -Dcucumber.options="--tags @smoke"
 
```

## Go to the Report
The main HTML page of the report can be found in: target/site/serenity/index.html


 


