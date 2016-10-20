import org.flywaydb.gradle.*

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.4.1.RELEASE")
        classpath("org.flywaydb:flyway-gradle-plugin:4.0.3")
    }
}

apply<FlywayPlugin>()
configure<FlywayExtension> {
    url = "jdbc:mysql://localhost/test?useSSL=false"
    user = "dbuser2"
    password = "password"
    driver = "com.mysql.cj.jdbc.Driver"
    setLocations("filesystem:${project.projectDir}/dbmigration")
}

dependencies {
    compile("mysql:mysql-connector-java:6.0.5")
}

