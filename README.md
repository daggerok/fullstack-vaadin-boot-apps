# fullstack-vaadin-boot-app [![CI](https://github.com/daggerok/fullstack-vaadin-boot-apps/workflows/CI/badge.svg)](https://github.com/daggerok/fullstack-vaadin-boot-apps/actions?query=workflow%3ACI)
Full-Stack Spring Boot Vaadin applications!

## table of content

* [Step 0: Hello World Vaadin getting started](#step-0)
* [Versioning and releasing automation with maven](#versioning-and-releases)
* [Helpful resources and links](#resources)

## step: 0

hello, vaadin!
generate new project by using: [vaadin starter](https://vaadin.com/start/v14)

### dev

```bash
./mvnw -f step-0-getting-started package spring-boot:run
```

### prod

```bash
./mvnw -f step-0-getting-started package spring-boot:build-image docler-compose:up
```

### docker

```bash
# dev
docker run --rm -it --name maven -v /tmp/fullstack-vaadin-boot-apps.m2:/root/.m2 -v `pwd`:/root/app -w /root/app maven:3.8.1-openjdk-11-slim ./mvnw -f step-0-getting-started package spring-boot:run
# prod
docker run --rm -it --name maven -v /tmp/fullstack-vaadin-boot-apps.m2:/root/.m2 -v `pwd`:/root/app -w /root/app maven:3.8.1-openjdk-11-slim ./mvnw -f step-0-getting-started package
./mvnw -f step-0-getting-started spring-boot:build-image docler-compose:up
```

## versioning and releases

see [.mvn/release.sh](.mvn/release.sh) script for details.

```bash
bash .mvn/release.sh
```

## resources

* https://vaadin.com/start/v14
* https://www.youtube.com/playlist?list=PLcRrh9hGNallPtT2VbUAsrWqvkQ-XE22h
* https://vaadin.com/learn/tutorials/modern-web-apps-with-spring-boot-and-vaadin
