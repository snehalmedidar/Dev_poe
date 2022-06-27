FROM openjdk:8
COPY . /src/java
WORKDIR /src/java
RUN ["javac","prime.java"]
ENTRYPOINT ["java","prime"]
