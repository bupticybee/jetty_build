#!/bin/sh
#mvn org.mortbay.jetty:jetty-maven-plugin:run
#mvn org.mortbay.jetty:jetty-maven-plugin:start
{
	mvn package
} || {
	echo  "package end"
}
exit 0
