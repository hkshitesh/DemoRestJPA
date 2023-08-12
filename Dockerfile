FROM openjdk:21
COPY target/gfg-sample.jar gfg-sample.jar
CMD java -jar gfg-sample.jar
