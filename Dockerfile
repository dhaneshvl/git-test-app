FROM openjdk:17
EXPOSE 8080
ADD target/git-docker-test.jar git-docker-test.jar
ENTRYPOINT [ "java","-jar", "/git-docker-test.jar"]