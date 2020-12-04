import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
    java
}
group = "me.pavel"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test-junit"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

task("day1_1", JavaExec::class) {
    main = "Day1Task1Kt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("day1_2", JavaExec::class) {
    main = "Day1Task2Kt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("day2_1", JavaExec::class) {
    main = "Day2Task1Kt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("day2_2", JavaExec::class) {
    main = "Day2Task2Kt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("day3_1", JavaExec::class) {
    main = "Day3Task1Kt"
    classpath = sourceSets["main"].runtimeClasspath
}

task("day3_2", JavaExec::class) {
    main = "Day3Task2Kt"
    classpath = sourceSets["main"].runtimeClasspath
}