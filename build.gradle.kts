import org.jetbrains.kotlin.gradle.plugin.getKotlinPluginVersion
import tasks.AddLibTask
import tasks.UpdateMassiveCatalogsTask

plugins {
    `javiersc-versioning`
    `javiersc-changelog`
    `javiersc-code-analysis`
    `javiersc-dependency-updates`
    `javiersc-docs`
    `kotlinx-binary-compatibility-validator`
    `javiersc-nexus`
    `javiersc-readme-badges-generator`
}

// TODO: Remove when [#3286](https://github.com/dependabot/dependabot-core/issues/3286) is fixed
allprojects {
    repositories {
        mavenCentral()
        google()
        jcenter()
        gradlePluginPortal()
    }
}

tasks {
    withType<Test> {
        maxParallelForks = Runtime.getRuntime().availableProcessors()
        useJUnitPlatform()
        useTestNG()
    }

    register<AddLibTask>("addLib")
    register<UpdateMassiveCatalogsTask>("updateMassiveCatalogs")
    register("checkKotlinVersion") {
        allprojects
            .asSequence()
            .map { project -> project.getKotlinPluginVersion() }
            .toSet()
            .filterNotNull()
            .firstOrNull()
            .also { println("HELLO $it") }
    }
}

subprojects.onEach { subproject ->
    val content = buildCatalogFile(file("${subproject.projectDir}/build.gradle.kts"))

    if (content != null) {
        file("${subproject.buildDir}/catalogs/").apply { if (!exists()) mkdirs() }
        file("${subproject.buildDir}/catalogs/libs.versions.toml").apply {
            if (!exists()) createNewFile()
            writeText(content)
        }
    }
}
