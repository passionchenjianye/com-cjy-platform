FROM java:8

RUN mkdir /app
WORKDIR /app
COPY ./target/service-consumer-0.0.1-SNAPSHOT.jar /app
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/service-consumer-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=dev"]
EXPOSE 9094