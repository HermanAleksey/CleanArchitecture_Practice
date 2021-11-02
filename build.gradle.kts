import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
}

group = "me.drago"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val koin_version= "3.1.3"

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.insert-koin:koin-core:$koin_version")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}