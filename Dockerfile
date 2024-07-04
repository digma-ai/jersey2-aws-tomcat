FROM tomcat:9.0.90-jre17-temurin
LABEL maintainer="skazaz@digma.ai"

ADD target/helloworld-webapp.war /usr/local/tomcat/webapps/
ADD hello.war /usr/local/tomcat/webapps/
ADD aws-sdk-java-2.24.13.jar /usr/local/tomcat/lib/
ADD opentelemetry-javaagent-1334.jar /usr/local/tomcat/lib/

EXPOSE 8080
CMD ["catalina.sh", "run"]
