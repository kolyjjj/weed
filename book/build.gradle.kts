import org.flywaydb.gradle.*

buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath("org.flywaydb:flyway-gradle-plugin:4.0.3")
    }
}

apply<FlywayPlugin>()
configure<FlywayExtension> {
    url = "jdbc:mysql://localhost/bookdb?useSSL=false"
    user = "dbuser2"
    password = "password"
    driver = "com.mysql.cj.jdbc.Driver"
    setLocations("filesystem:${project.projectDir}/dbmigration")
}
