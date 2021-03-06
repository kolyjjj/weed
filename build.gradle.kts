import org.springframework.boot.gradle.plugin.SpringBootPlugin

// you don't need this part for `gradlew clean build` to work, this exists only for the auto completion to
// work inside other build.gradle.kts fiels
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.4.1.RELEASE")
        classpath("org.flywaydb:flyway-gradle-plugin:4.0.3")
    }
}

allprojects {
    apply<JavaPlugin>()

    repositories {
        mavenCentral()
    }

    dependencies {
        compile("org.springframework.boot:spring-boot-starter-data-jpa:1.4.1.RELEASE")
        compile("org.springframework.boot:spring-boot-starter-web:1.4.1.RELEASE")
        compile("mysql:mysql-connector-java:6.0.5")
    }
}

apply<SpringBootPlugin>()
//configure<SpringBootPluginExtension> {
//
//}

subprojects {

    repositories {
        mavenCentral()
    }

    dependencies {
        compile("com.google.guava:guava:20.0-rc1")
        compile("joda-time:joda-time:2.9.4")
    }
}

dependencies {
    compile(project(":user"))
    compile(project(":book"))
}