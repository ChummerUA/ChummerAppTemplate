import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id(Plugins.javaLibrary)
    id(Plugins.JetBrains.jvm)
}

java {
    sourceCompatibility = GradleConfig.javaVersion
    targetCompatibility = GradleConfig.javaVersion
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = GradleConfig.jvmTarget
}