import org.gradle.api.JavaVersion

object GradleConfig {

    const val compileSdk = 35
    const val minSdk = 24

    val javaVersion = JavaVersion.VERSION_1_8
    const val jvmTarget = "1.8"

    const val namespaceRoot = "com.chummer.template"

    const val versionName = "1.0.0"

    const val dbName = "myDb" // TODO configure
}