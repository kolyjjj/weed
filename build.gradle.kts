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