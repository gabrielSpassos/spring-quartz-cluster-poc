# Spring Quartz Cluster POC

Creating a schedule to run in a cluster. Imagine with you wanna schedule some task, now with have more then one instance of the same service only one of then should execute that task. 

This is what this poc is about.

Check this [link](https://jeroenbellen.com/configuring-a-quartz-scheduler-in-a-clustered-spring-boot-application/)

## Tips

This annotation "@DisallowConcurrentExecution" creates the effect of only one instance execute some task

Once schedule cron trigger created, the value used to run job is the one stored at database 

### Usage

* run docker compose
```
docker-compose up
```

* create tables (look database.sql)

* build the jar
```
./gradlew clean build
``` 

* run service at default port

```
java -jar build/libs/quartz-spring-0.0.1-SNAPSHOT.jar 
```

* run service at custom port

```
java -jar build/libs/quatz-spring-0.0.1-SNAPSHOT.jar --server.port=[PORT]
```