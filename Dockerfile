FROM java:8
COPY /target/dockerexercise-0.0.1-SNAPSHOT.jar /data/
EXPOSE 8080
WORKDIR /data/
CMD ["java", "-jar", "dockerexercise-0.0.1-SNAPSHOT.jar"]
