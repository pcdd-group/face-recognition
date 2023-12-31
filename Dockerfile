FROM openjdk:17.0.2-slim

ADD face-recognition-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT [ \
"java", "-Xms64m", "-Xmx64m", "-Dfile.encoding=UTF-8", \
"-Duser.timezone=GMT+08", \
"-Djava.security.egd=file:/dev/./urandom", \
"-jar", "app.jar"]

EXPOSE 8080