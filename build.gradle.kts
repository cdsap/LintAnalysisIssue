import com.android.build.gradle.internal.lint.AndroidLintAnalysisTask

// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}

allprojects {
    tasks.withType<AndroidLintAnalysisTask>().configureEach {
        println(name)
        doFirst {

            println("inaki")

            variantInputs.mainArtifact.projectCompileExplodedAarsFileCollection?.forEach {
                println(it.name)
            }
            variantInputs.mainArtifact.projectCompileExplodedAars?.forEach {
                println(it.file.path)
            }
            variantInputs.androidTestArtifact.get().projectCompileExplodedAars?.forEach {
                println(it.file.path)
            }
        }
    }
}
