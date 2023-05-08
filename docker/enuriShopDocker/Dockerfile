FROM openjdk:11-jdk
RUN mkdir -p jar
WORKDIR /jar
ARG JAR_FILE=..\build\libs\*.jar
#VOLUME /tmp
COPY ${JAR_FILE} /jar/myboot.jar
ENTRYPOINT ["java","-jar","/jar/myboot.jar"]