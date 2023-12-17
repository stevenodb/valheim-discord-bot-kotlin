plugins {
    kotlin("multiplatform") version "1.9.21"
}

group = "be.takestwo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        useCommonJs()
        nodejs {
            testTask {
                environment("key", "value")
                useMocha()
            }
        }
        binaries.executable()

        sourceSets {
            val jsMain by getting {
                dependencies {
                    implementation(npm("discord.js", "14.14.1"))
                }
            }
            val jsTest by getting {
                dependencies {
                    implementation(kotlin("test"))
                }
            }
        }
    }
}