pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("com.gradle.develocity") version "3.18"
}

develocity {
    server = "https://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
        publishing { true}
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")

include(":mylibrary")
include(":mylibrary2")
project(":mylibrary").projectDir = file("mylibrary/mylibrary")
project(":mylibrary2").projectDir = file("mylibrary2/mylibrary2")
