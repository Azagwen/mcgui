# Installation

<p style="font-size: 20px; color: orange;">Warning - McGUI is currently in pre-release, it may contain bugs.. For more infomation, <a style="color: orange;" href="">join the discord for updates.</a></p>

First of all, add falsemaven to your repositories in `build.gradle`:

```groovy
repositories {
    maven {
        name = "falsemaven"
        url = 'https://maven.falseresync.ru/releases'
    }
    maven { url 'https://jitpack.io' }
}
```
Add the following to underneath your repositories in `build.gradle`:

```groovy
configurations {
    shadow
    api.extendsFrom shadow
}
```

Add the following dependencies to your dependencies in `build.gradle`:

```groovy
modImplementation "cal.codes:mcgui:1.0.0-pr2"
include "cal.codes:mcgui:1.0.0-pr2"

// SpruceUI - Is used majorly by mcgui and is required for rendering screens and other misc UI related stuff.
modImplementation "com.github.LambdAurora:SpruceUI:1.16wip-SNAPSHOT"
    include "com.github.LambdAurora:SpruceUI:1.16wip-SNAPSHOT"
    include "org.reflections:reflections:0.9.12"

    shadow ("org.aperlambda:lambdajcommon:1.8.1") {
        // Minecraft already has all the google dependencies.
        exclude group: 'com.google.code.gson'
        exclude group: 'com.google.guava'
    }

```

Reload your gradle project and you should be ready.

### Next Steps

- [Creating a mcui file.](/gs/createfile.md)


