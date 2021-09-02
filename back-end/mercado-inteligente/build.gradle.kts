plugins {
    kotlin("jvm") version "1.5.21"
    kotlin("plugin.allopen") version "1.5.21"
    id("io.quarkus")
}

repositories {
    mavenCentral()
    mavenLocal()
}

val quarkusPlatformGroupId: String by project
val quarkusPlatformArtifactId: String by project
val quarkusPlatformVersion: String by project
val quarkusVersion: String = "2.2.0.Final"

dependencies {
    implementation("io.quarkus:quarkus-config-yaml")
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
    implementation("io.quarkus:quarkus-hibernate-orm-panache-kotlin:${quarkusVersion}")
    implementation("io.quarkus:quarkus-jdbc-mysql:0.26.1")
    implementation("io.quarkus:quarkus-hibernate-validator:${quarkusVersion}")
    implementation("io.quarkus:quarkus-kotlin:${quarkusVersion}")
    implementation("io.quarkus:quarkus-resteasy-jackson:${quarkusVersion}")
    implementation("io.quarkus:quarkus-security-jpa:${quarkusVersion}")
    implementation("io.quarkus:quarkus-jdbc-mysql:${quarkusVersion}")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc:${quarkusVersion}")
    implementation("io.quarkus:quarkus-resteasy:${quarkusVersion}")

    testImplementation("io.quarkus:quarkus-junit5:${quarkusVersion}")
    testImplementation("io.rest-assured:rest-assured:4.4.0")
}

group = "br.edu.usf"
version = "1.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

allOpen {
    annotation("javax.ws.rs.Path")
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("io.quarkus.test.junit.QuarkusTest")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_11.toString()
    kotlinOptions.javaParameters = true
}
