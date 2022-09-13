FROM openjdk:18

ADD target/studentData-0.0.1-SNAPSHOT.jar app.jar

#EXPOSE 8081

ENTRYPOINT ["java", "-jar", "/app.jar"]