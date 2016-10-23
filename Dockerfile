FROM maven:latest

WORKDIR /work

ADD lib lib
ADD pom.xml pom.xml 
ADD run.sh run.sh
ADD src src

CMD mvn package

