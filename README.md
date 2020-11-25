# Commons

The Commons library is a multi-language software library that contains code I frequently use across my main set of programming languages. The goal of this library is to reduce the amount of copy-paste needed when setting up projects.

## Supported languages

The following languages are currently supported (although there may be slight differences between them):

 - Java
 - Python >= 3.6
 - C
 - C++

## Installation

### Java

**Step 1.** Add the RetryLife maven server to your `build.gradle` file:

```groovy
repositories {
    maven { url 'https://maven.retrylife.ca' }
}
```

**Step 1.** Add this library as a dependency:

```groovy
dependencies {
    implementation 'ca.retrylife:commons-java:v1.+'
    implementation 'ca.retrylife:commons-java-sources:v1.+'
    implementation 'ca.retrylife:commons-java-javadoc:v1.+'
}
```
