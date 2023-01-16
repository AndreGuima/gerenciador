# docker file for ubuntu with OpenJDK 18 and tomcat 9.
FROM ubuntu:latest
LABEL maintainer="AndreGuima"

ENV TOMCAT_VERSION 9.0.71
ENV CATALINA_HOME /usr/local/tomcat
ENV JAVA_HOME /usr/lib/jvm/java-18-openjdk-amd64
ENV PATH $CATALINA_HOME/bin:$PATH

# upgrade  wget packages.
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-18-jdk wget

# install and configure tomcat
RUN mkdir $CATALINA_HOME
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-${TOMCAT_VERSION}/* $CATALINA_HOME
RUN rm -rf /tmp/apache-tomcat-${TOMCAT_VERSION}
RUN rm -rf /tmp/tomcat.tar.gz

ADD ./gerenciador.war $CATALINA_HOME/webapps/
EXPOSE 8080

# start tomcat9
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]

