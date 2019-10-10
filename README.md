# Kafka
Implementation of Kafka-producer


STEP-01 [START-KAFKA-SERVER]

C:\kafka>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
C:\kafka>.\bin\windows\kafka-server-start.bat .\config\server.properties

	
STEP-02[CREATE_TOPIC]
I created producer in side my spring boot project topic name "Kafka_Example".
After run the project need to create that topic inside the console
.\bin\windows\kafka-topics.bat --create --zookeeper localhost:9081 --replication-factor 1 --partitions 1 --topic Kafka_Example

STEP-03[VIEW ALL TOPICS]
.\bin\windows\kafka-topics.bat --list --zookeeper localhost:9081

STEP-04[OPEN_CONSUMER_CONSOLE]
When send the message to the Kafka_Example topic we need to conssume it. Then need to create consumer by console
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example(THIS IS YOUR TOPIC) --from-beginning

