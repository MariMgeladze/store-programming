
#FROM gradle:8.3.0-jdk17 as build

#WORKDIR /app
#COPY . .
#RUN gradle bootWar

#FROM openjdk:17-jdk-slim
#WORKDIR /app

#COPY --from=build /app/build/libs/store-programming-0.0.1-SNAPSHOT.war /app/store-programming-0.0.1-SNAPSHOT.war


FROM openjdk:17-jdk
WORKDIR /app
EXPOSE 8080

COPY build/libs/store-programming-0.0.1-SNAPSHOT.war /app/store-programming-0.0.1-SNAPSHOT.war

CMD ["java","-jar","/app/store-programming-0.0.1-SNAPSHOT.war"]