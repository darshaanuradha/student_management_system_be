# Build the Spring Boot jar with the Gradle wrapper, then run it on a slim JRE.
# Java 26 to match the toolchain in build.gradle.
FROM eclipse-temurin:26-jdk AS build
WORKDIR /app

# Wrapper + build scripts first so the Gradle distribution and dependency
# downloads stay cached when only source changes.
COPY gradlew ./
COPY gradle ./gradle
COPY settings.gradle build.gradle ./
RUN chmod +x gradlew && ./gradlew --no-daemon dependencies > /dev/null 2>&1 || true

COPY src ./src
RUN ./gradlew --no-daemon -x test clean bootJar

FROM eclipse-temurin:26-jre
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
# Render injects $PORT; fall back to 8080 locally. Cap the heap for the free
# 512MB tier (override JAVA_OPTS in the Render dashboard if needed).
ENV JAVA_OPTS="-XX:MaxRAMPercentage=75.0"
EXPOSE 8080
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar app.jar --server.port=${PORT:-8080}"]
