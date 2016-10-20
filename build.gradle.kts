// uncomment when you want the auto completion work in kts files in sub projects
//buildscript {
//    repositories {
//        mavenCentral()
//    }
//    dependencies {
//        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.4.1.RELEASE")
//        classpath("org.flywaydb:flyway-gradle-plugin:4.0.3")
//    }
//}

subprojects{
    apply<JavaPlugin>()

    repositories {
        mavenCentral()
    }

    dependencies {
        compile("com.google.guava:guava:20.0-rc1")
        compile("joda-time:joda-time:2.9.4")
        compile("org.springframework.boot:spring-boot-starter-data-jpa:1.4.1.RELEASE")
    }
}