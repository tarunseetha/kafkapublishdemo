# kafkapublishdemo
To understand how to access Apache Kafka using Spring Boot. In this example we are just publishing some object to one Kafka topic.

# Some key Apache Kafka commands

## Start Zookeeper

bin/zookeeper-server-start.sh config/zookeeper.properties

## Start Kafka Server

bin/kafka-server-start.sh config/server.properties

## Create Kafka Topic

bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example

## Consume from the Kafka Topic via Console

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning

## Publish message via WebService

localhost:8080/kafka/publish/test

**Important Point:**
- In case you run these commands on windows then may be you you need to run batch files available in "/bin/windows" folder instead of "/bin" folder.
- Make sure you imported correct file for JsonSerializer i.e. org.springframework.kafka.support.serializer.JsonSerializer
