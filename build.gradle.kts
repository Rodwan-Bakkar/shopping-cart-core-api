plugins {
    kotlin("jvm") version "2.1.0"
    `maven-publish`
}

group = "com.rodwan"
version = "0.1.0"

repositories {
    mavenCentral()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            groupId = project.group.toString()
            artifactId = "shopping-cart-core-api"
            version = project.version.toString()
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/Rodwan-Bakkar/shopping-cart-core-api")
            credentials {
                username = project.findProperty("gpr.user") as String? ?: System.getenv("MAVEN_USERNAME")
                password = project.findProperty("gpr.token") as String? ?: System.getenv("MAVEN_PASSWORD")
            }
        }
    }
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.20.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
