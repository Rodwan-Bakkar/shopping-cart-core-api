# Shopping Cart Core Api

[![Kotlin](https://img.shields.io/badge/Kotlin-2.1.x-purple.svg)](https://kotlinlang.org/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

This is a shared library for the [shopping cart system](https://github.com/Rodwan-Bakkar/shopping-cart?tab=readme-ov-file),
containing the commands, events, and shared DTOs used by other services in the system. It is designed to support
**Domain-Driven Design (DDD)** principles and provides a single source of truth for domain contracts. Both the
[**Command Service**](https://github.com/Rodwan-Bakkar/shopping-cart-command-svc) and
[**Query Service**](https://github.com/Rodwan-Bakkar/shopping-cart-query-svc) depend on this module to share consistent
data structures and domain contracts across the system. To support this reuse, the library is published to
**Maven Central**, allowing both services — and any future microservices — to consume it easily without requiring
credentials or custom configuration.

### 🧑‍💻 Local Development

When developing features that affect multiple services, use `mavenLocal()` to test changes immediately without waiting
for a remote sync.

**To publish locally:**

```bash
./gradlew clean publishToMavenLocal
```

In other services, the `repositories` block is configured as
```
repositories {
    mavenLocal()    // 1st Priority
    mavenCentral()  // 2nd Priority
}
```
Gradle searches `mavenLocal()` first. If a dependency exists there, it will take precedence over the dependency found
on the internet.

### 🚀 Publishing to Maven Central

The library is published to Maven Central via GitHub workflow using a
[gradle plugin](https://github.com/vanniktech/gradle-maven-publish-plugin) to achieve this task. You can check the
[documentation](https://vanniktech.github.io/gradle-maven-publish-plugin/central/) for detailed explanation on how to
publish to Maven Central.

### Versioning Policy

Follow Semantic Versioning ([SemVer](https://semver.org/)):

- **MAJOR**: Breaking changes (e.g., package renaming).
- **MINOR**: New features/Value Objects (Backward compatible).
- **PATCH**: Bug fixes or internal optimizations.

**SNAPSHOTS**: Use the `-SNAPSHOT` suffix (e.g., `1.0.1-SNAPSHOT`) during development to allow overwriting the local
JAR in `mavenLocal()` without constantly incrementing the version. This is helpful because Maven Central and local
release repositories do not allow overwriting or "re-publishing" the same version number once it has been released;
snapshots are the only mutable version type in the Maven ecosystem.

### Usage in Consumer Services

Consumer services uses this dependency by adding the following to `build.gradle.kts`:

```
dependencies {
    implementation("io.github.rodwan-bakkar:coreapi:1.0.1")
}
```



