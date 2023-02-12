#!/bin/bash

rm *.jar
rm Dockerfile*

# copy files from S3
aws s3 cp --region=us-west-2 s3://mcc-code-school-build-artifacts/matt-ryan-latest.jar app-latest.jar 
aws s3 cp --region=us-west-2 s3://mcc-code-school-build-artifacts/matt-ryan-java-Dockerfile-latest Dockerfile 

docker build --build-arg JAR_FILE=app-latest.jar -t matt-ryan-java:latest . 

if [[ $(docker container ls -q --filter name=matt-ryan-java) ]];
then
            echo "found running container, killing thing"
            docker stop matt-ryan-java
    else
            echo "no running container, starting new one"
fi
docker run -p 8083:8080 --rm --name matt-ryan-java --detach matt-ryan-java:latest