# hello-java

VS Code에서 Spring Boot Maven 프로젝트를 생성하고 실행하는 과정을 정리했습니다.

## 1) VS Code 설치

- Visual Studio Code를 설치합니다.
- 설치 후 실행합니다.

## 2) 확장팩 설치

다음 확장팩을 설치합니다.

- Spring 관련 확장팩 (예: Spring Boot Extension Pack)
- Java 관련 확장팩 (예: Extension Pack for Java)
- Material Icon Theme
- Power Mode

## 3) Maven 프로젝트 생성

1. VS Code에서 Command Palette를 엽니다. (Windows: Ctrl+Shift+P)
2. `Spring Initializr: Create a Maven Project`를 선택합니다.
3. 언어는 `Java`, 패키징은 `Jar`, Java 버전을 선택합니다.
4. Group/Artifact/Package 정보를 입력합니다.

## 4) Dependencies 선택

Spring Initializr에서 아래 의존성을 선택합니다.

- Lombok
- Rest Repositories
- Spring Data JPA
- HyperSQL Database

## 5) application.properties 설정

`src/main/resources/application.properties`를 아래와 같이 설정합니다.

```properties
spring.application.name=example1

# === JPA / Hibernate: SQL 출력 및 포맷 설정 ===
# 콘솔에 실행되는 SQL을 출력합니다.
spring.jpa.show-sql=true
# 출력되는 SQL을 읽기 쉽도록 포맷합니다.
spring.jpa.properties.hibernate.format_sql=true
# Hibernate의 show_sql 속성도 명시적으로 활성화합니다.
spring.jpa.properties.hibernate.show_sql=true

# === DDL 자동 적용 ===
# 개발용: 엔티티 변경 시 스키마를 자동으로 업데이트합니다. (주의: 운영환경에서는 신중히 사용)
spring.jpa.hibernate.ddl-auto=update

# === 로깅 레벨 설정 ===
# 애플리케이션 전체 기본 로그 레벨을 INFO로 설정합니다.
logging.level.root=INFO
# Hibernate가 출력하는 SQL을 INFO 레벨로 기록합니다.
logging.level.org.hibernate.SQL=INFO
# 바인딩(파라미터) 로그를 TRACE로 기록합니다. (자세한 파라미터 값 확인용)
logging.level.org.hibernate.orm.jdbc.bind=TRACE
```

## 6) 스프링부트 프로젝트 실행

프로젝트 루트에서 아래 명령어로 실행합니다.

```powershell
./mvnw spring-boot:run
```

또는 VS Code에서 `Spring Boot Dashboard`를 통해 실행해도 됩니다.
