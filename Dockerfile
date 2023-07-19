FROM openjdk:21
COPY target/DemoKedarDemo-0.0.1-SNAPSHOT.jar DemoKedarDemo-0.0.1-SNAPSHOT.jar
CMD java -jar DemoKedarDemo-0.0.1-SNAPSHOT.jar