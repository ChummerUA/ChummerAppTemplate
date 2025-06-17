object Plugins {
    const val javaLibrary = "java-library"
    const val kotlin = "kotlin"

    object Android {
        const val application = "com.android.application"
        const val library = "com.android.library"
    }

    object JetBrains {
        private const val root = "org.jetbrains.kotlin"
        const val android = "$root.android"
        const val jvm = "$root.jvm"
        const val composeCompiler = "$root.plugin.compose"
        const val serialization = "$root.plugin.serialization"
    }

    object Maven {
        const val publish = "maven-publish"
    }

    const val sqlDelight = "app.cash.sqldelight"

    const val serialization = "plugin.serialization"

    const val hilt = "com.google.dagger.hilt.android"
    const val ksp = "com.google.devtools.ksp"

    const val googleServices = "com.google.gms.google-services"
}
