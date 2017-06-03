FROM gradle:alpine
MAINTAINER drakontia <mhden@drakontia.com>

User root
COPY . /spring
WORKDIR /spring

RUN apk update && \
    gradle clean && \
    gradle build && \
    mkdir -p /usr/local/spring/libs && \
    cp -R /spring/build/libs/*.jar /usr/local/spring/libs/ && \
    rm -rf /var/cache/apk/* && \
    rm -rf ~/.gradle && \
    rm -rf /spring

ENTRYPOINT java $JAVA_OPTS -jar /usr/local/spring/libs/ChouseiFF14-0.0.1-SNAPSHOT.jar

EXPOSE 8080
