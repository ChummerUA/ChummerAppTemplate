import org.jetbrains.kotlin.gradle.dsl.JvmTarget
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
    compilerOptions.jvmTarget.set(JvmTarget.fromTarget(GradleConfig.jvmTarget))
}