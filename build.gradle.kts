plugins {
    kotlin("jvm") version "2.1.0"
    id("com.vanniktech.maven.publish") version "0.35.0"
}

group = "com.rodwan"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.20.1")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

// This block explicitly tells the underlying Gradle Signing Plugin (applied automatically by the vanniktech plugin)
// how to load the PGP private key from CI secrets.
signing {
    val signingKey = project.findProperty("signingInMemoryKey") as String
    val signingPassphrase = project.findProperty("signingPassword") as String

    if (signingKey.isNotEmpty()) {
        useInMemoryPgpKeys(signingKey, signingPassphrase)
    }
}

mavenPublishing {
    coordinates("io.github.rodwan-bakkar", "coreapi", version.toString())

    pom {
        name.set("Shopping Cart Core API")
        description.set("A shared library containing commands, events and DTOs")
        inceptionYear.set("2020")
        url.set("https://github.com/Rodwan-Bakkar/shopping-cart-core-api")
        licenses {
            license {
                name.set("The Apache License, Version 2.0")
                url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                distribution.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
            }
        }
        developers {
            developer {
                id.set("Rodwan-Bakkar")
                name.set("Rodwan Bakkar")
                url.set("https://github.com/Rodwan-Bakkar/")
            }
        }
        scm {
            url.set("https://github.com/Rodwan-Bakkar/shopping-cart-core-api")
            connection.set("scm:git:git://github.com:Rodwan-Bakkar/shopping-cart-core-api.git")
            developerConnection.set("scm:git:ssh://git@github.com:Rodwan-Bakkar/shopping-cart-core-api.git")
        }
    }
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}
