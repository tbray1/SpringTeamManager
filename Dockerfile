FROM openjdk:11

COPY target/teammanager-0.0.1.jar teammanager-0.0.1.jar

ENTRYPOINT ["java", "-jar", "/teammanager-0.0.1.jar"]