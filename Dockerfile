FROM openjdk:17
EXPOSE 8080
ADD target/springboot-new-image.jar springboot-new-image.jar
ENTRYPOINT ["java","-jar","/springboot-new-image.jar"]