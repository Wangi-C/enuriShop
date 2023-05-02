FROM openjdk:11
WORKDIR /home/user
ARG JAR_FILE=C:/Users/USER/IdeaProjects/enuriShop/build/libs/enuriShop-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} myboot.jar
ENTRYPOINT ["java","-jar","/myboot.jar"]
