pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Android App"

include(":android_app")
include(":libs:android_core")
include(":libs:kotlin_core")

project(":android_app").projectDir = file("sample/android")
project(":libs:android_core").projectDir = file("android/core")
project(":libs:kotlin_core").projectDir = file("kotlin/core")