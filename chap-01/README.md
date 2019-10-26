# Spring Data MongoDB

###Simple Chapter entity

 - The @Data annotation from Lombok generates getters, setters, a toString() method, an equals() method, a hashCode() method, and a constructor for all required (that is, final) fields
 - The @Document annotation flags this class as suitable for storing in a MongoDB data store
 - The id field is marked with Spring Data's @Id annotation, indicating this is the primary key of our Mongo document
 - Spring Data MongoDB will, by default, create a collection named chapters with two fields, id and name

### Check MongoDB

http://localhost:8082/chapters
```
[{"id":"5dabe8355064f9777f299aad","name":"Quick Start with Java"},{"id":"5dabe8355064f9777f299aae","name":"Reactive Web with Spring Boot"},{"id":"5dabe8355064f9777f299aaf","name":"...and more!"}]
```

### Tidy up the database
```
mongo

> db
test

> show collections
chapter

> db.chapter.drop()
true

exit
```

### Actuator

https://dzone.com/articles/maven-git-commit-id-plugin

https://mydeveloperplanet.com/2018/02/22/maven-git-commit-id-plugin/

https://www.baeldung.com/spring-git-information

https://www.baeldung.com/spring-boot-actuators

### Maven Build Jar
```
cd ~/Projects/workspace/learning-spring-boot-2/chap-01

mvn clean install

cd ~/Projects/workspace/learning-spring-boot-2/chap-01/target

# The application's fat jar file (when packaged) with dependencies
chap-01-0.0.1-SNAPSHOT-spring-boot.jar

# The application's jar
chap-01-0.0.1-SNAPSHOT.jar

```

### Examine the Jar
```
jar -jar ~/Projects/workspace/learning-spring-boot-2/chap-01/target/chap-01-0.0.1-SNAPSHOT-spring-boot.jar
```

### Run the Jar
```
java -jar ~/Projects/workspace/learning-spring-boot-2/chap-01/target/chap-01-0.0.1-SNAPSHOT-spring-boot.jar
```

### Check endpoints
http://localhost:8082/actuator/info
```
{"app":{"name":"MyApp","description":"MyApp is a Spring Boot application","version":"1.0.0"},"git":{}}
```

http://localhost:8082/version

```
{ "git.branch" : "master", "git.build.host" : "DaRealPunjabi-MacBook-Pro.local", "git.build.time" : "2019-10-20T04:34:20+0100", "git.build.user.email" : "DaRealPunjabi@gmail.com", "git.build.user.name" : "DaRealPunjabi", "git.build.version" : "0.0.1-SNAPSHOT", "git.closest.tag.commit.count" : "", "git.closest.tag.name" : "", "git.commit.id" : "2915ab6e7b26b01b2f1a18c6fb6ff77ee55e4f05", "git.commit.id.abbrev" : "2915ab6", "git.commit.id.describe" : "2915ab6-dirty", "git.commit.id.describe-short" : "2915ab6-dirty", "git.commit.message.full" : "Initial Commit", "git.commit.message.short" : "Initial Commit", "git.commit.time" : "2019-10-19T13:27:08+0100", "git.commit.user.email" : "DaRealPunjabi@gmail.com", "git.commit.user.name" : "DaRealPunjabi", "git.dirty" : "true", "git.local.branch.ahead" : "0", "git.local.branch.behind" : "0", "git.remote.origin.url" : "https://github.com/DaRealPunjabi/learning-spring-boot-2", "git.tags" : "", "git.total.commit.count" : "2" }
```

http://localhost:8082/actuator/metrics

```
{"names":["jvm.threads.states","http.server.requests","process.files.max","jvm.gc.memory.promoted","jvm.memory.max","jvm.memory.used","system.load.average.1m","jvm.gc.max.data.size","jvm.memory.committed","system.cpu.count","logback.events","jvm.buffer.memory.used","jvm.threads.daemon","system.cpu.usage","jvm.gc.memory.allocated","jvm.threads.live","jvm.threads.peak","process.uptime","process.cpu.usage","jvm.classes.loaded","jvm.classes.unloaded","jvm.gc.live.data.size","jvm.gc.pause","process.files.open","jvm.buffer.count","jvm.buffer.total.capacity","process.start.time"]}
```

http://localhost:8082/actuator/metrics/process.uptime

```
{"name":"process.uptime","description":"The uptime of the Java virtual machine","baseUnit":"seconds","measurements":[{"statistic":"VALUE","value":5843.491}],"availableTags":[]}
```

http://localhost:8082/actuator/health

```
{"status":"UP","components":{"diskSpace":{"status":"UP","details":{"total":121123069952,"free":67453505536,"threshold":10485760}},"mongo":{"status":"UP","details":{"version":"4.2.0"}},"mongoReactive":{"status":"UP","details":{"version":"4.2.0"}},"ping":{"status":"UP"}}}
```
