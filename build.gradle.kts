// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenLocal()
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.gradle)
        classpath(Dependencies.kotlinGradle)
        classpath(Dependencies.SqlDelight.gradle)
        classpath(Dependencies.SqlDelight.adapters)
    }
}

plugins {
    id(Plugins.Android.application) version Dependencies.gradleVersion apply false
    id(Plugins.Android.library) version Dependencies.gradleVersion apply false
    id(Plugins.JetBrains.android) version Dependencies.kotlinVersion apply false
    id(Plugins.JetBrains.jvm) version Dependencies.kotlinVersion apply false
    id(Plugins.JetBrains.serialization) version Dependencies.KotlinX.jsonSerializationVersion apply false
    id(Plugins.sqlDelight) version Dependencies.SqlDelight.version apply false
    id(Plugins.hilt) version Dependencies.Dagger.daggerVersion apply false
    id(Plugins.ksp) version Dependencies.kspVersion apply false
    id(Plugins.googleServices) version Dependencies.googleServicesVersion apply false
}