# Integrating Kafka with Spring Boot

## Prerequisites:
- Producer must be up and running.
- Consumer must be up and running.

## This repository has two codebases:
- `producer`: The producer will serialize the course object (java object) and place the object on to the Kafka topic.
- `consumer`: The consumer will consume the course object (java object) from the Kafka topic and de-serialize the object.