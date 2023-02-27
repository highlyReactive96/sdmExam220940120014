FROM openjdk:11-jre-slim
ADD Factorial.class /
CMD ["java", "Factorial"]
