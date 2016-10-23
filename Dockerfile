FROM maven:latest

WORKDIR /work

ADD lib lib
ADD pom.xml pom.xml 
ADD run.sh run.sh
ADD src src

RUN sh run.sh 

CMD mvn org.mortbay.jetty:jetty-maven-plugin:run
