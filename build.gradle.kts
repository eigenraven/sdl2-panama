plugins {
    `java-library`
    `maven-publish`
    idea
}

repositories {
    mavenCentral()
}

val projectVersion: String = providers.gradleProperty("libraryVersion").get()
val targetJavaVersion: String = providers.gradleProperty("libraryTargetJavaVersion").get()
val sdlVersion: String = providers.gradleProperty("sdlVersion").get()
val projectGroup = "me.eigenraven.sdl2panama"

project.version = projectVersion
project.group = projectGroup

dependencies {
}

testing {
    suites {
        // Configure the built-in test suite
        getByName<JvmTestSuite>("test") {
            // Use JUnit Jupiter test framework
            useJUnitJupiter("5.9.3")
        }
    }
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(targetJavaVersion))
    }
    sourceCompatibility = JavaVersion.toVersion(targetJavaVersion)
    targetCompatibility = JavaVersion.toVersion(targetJavaVersion)
    withSourcesJar()
    withJavadocJar()
}

// Use preview syntax & features
val javaPreviewArgs = listOf("--enable-preview")

listOf(tasks.compileJava, tasks.compileTestJava).forEach {
    it.configure {
        sourceCompatibility = targetJavaVersion // Needed for IntelliJ
        with(options) {
            compilerArgs.addAll(javaPreviewArgs)
            javaModuleVersion.set(provider { version as String })
        }
    }
}

tasks.test {
    jvmArgs = javaPreviewArgs + listOf("--enable-native-access=ALL-UNNAMED")
}

tasks.javadoc {
    this.javadocTool.set(javaToolchains.javadocToolFor(java.toolchain))
    with(options as StandardJavadocDocletOptions) {
        addBooleanOption("-enable-preview", true)
        addStringOption("-release", targetJavaVersion)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = projectGroup
            artifactId = "sdl2panama"
            version = projectVersion

            from(components["java"])

            pom {
                name.set("SDL2 Panama bindings")
                description.set("Bindings to the SDL2 library generated using jextract for Java 20")
                url.set("https://www.eigenraven.me/")
                licenses {
                    license {
                        name.set("zlib")
                        url.set("https://opensource.org/license/zlib-license-php/")
                    }
                }
                developers {
                    developer {
                        id.set("eigenraven")
                        name.set("Raven Szewczyk")
                        email.set("git@eigenraven.me")
                    }
                }
            }
        }
    }

    repositories {
        maven {
            name = "eigenravenMavenReleases"
            url = uri("https://maven.eigenraven.me/releases")
            credentials(PasswordCredentials::class)
            authentication {
                create<BasicAuthentication>("basic")
            }
        }
    }
}
