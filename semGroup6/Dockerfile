FROM openjdk:latest
COPY ./target/semGroup6-0.1.0.3-jar-with-dependencies.jar /tmp/
WORKDIR /tmp/
ENTRYPOINT ["java", "-jar", "semGroup6-0.1.0.3-jar-with-dependencies.jar", "db:3306", "0"]
