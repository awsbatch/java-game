FROM tomcat:8.5-jdk8-corretto-al2
COPY game.war $CATALINA_HOME/webapps/
WORKDIR $CATALINA_HOME
EXPOSE 8080
