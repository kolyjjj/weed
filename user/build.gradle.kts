buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.springframework.boot:spring-boot-gradle-plugin:1.4.1.RELEASE")
    }
}
apply {
    plugin("spring-boot")
}

dependencies {
    compile("mysql:mysql-connector-java:6.0.5")
}