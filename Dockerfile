FROM tomcat:9.0.87-jdk17
LABEL maintainer="skazaz@digma.ai"

ADD target/helloworld-webapp.war /usr/local/tomcat/webapps/
ADD hello.war /usr/local/tomcat/webapps/
ADD sdk-core-2.25.48.jar /usr/local/tomcat/lib/
#ADD target/helloworld-webapp-interceptors.jar /usr/local/tomcat/lib/

EXPOSE 8080
CMD ["catalina.sh", "run"]
