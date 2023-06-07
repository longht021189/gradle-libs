pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
dependencyResolutionManagement {
    // repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.name = "Android App"

include(":apps:android")
include(":apps:web")
include(":libs:android_core")
include(":libs:kotlin_core")

project(":apps:android").projectDir = file("sample/android")
project(":apps:web").projectDir = file("sample/web")
project(":libs:android_core").projectDir = file("android/core")
project(":libs:kotlin_core").projectDir = file("kotlin/core")