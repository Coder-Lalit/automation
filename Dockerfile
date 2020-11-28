FROM openjdk:8u191-jre-alpine3.8
RUN apk add curl jq
WORKDIR /usr/share/test

ADD target/myDocker.jar myDocker.jar
ADD target/myDocker-tests.jar myDocker-tests.jar 
ADD target/libs libs
ADD testng.xml testng.xml
ADD healthcheck.sh healthcheck.sh
#Entrypoint /bin/sh
Entrypoint sh healthcheck.sh


#docker build -t=lalitdas/mydocker .
#java -cp myDocker.jar:myDocker-tests.jar:libs/* org.testng.TestNG testng.xml 
#http://192.168.0.194:4444/
#java -cp myDocker.jar:myDocker-tests.jar:libs/* -DHUB-HOST="192.168.0.194" org.testng.TestNG testng.xml