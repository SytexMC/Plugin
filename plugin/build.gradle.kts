plugins {
    alias(libs.plugins.run.paper)
    alias(libs.plugins.yml.paper)
}

java { toolchain.languageVersion.set(JavaLanguageVersion.of(project.ext.get("javaToolchainVersion") as Int)) }

tasks {
    runServer {
        minecraftVersion("1.21.7")
        jvmArgs("-Dcom.mojang.eula.agree=true") // Automatically agree to the Minecraft EULA
    }

    compileJava {
        options.encoding = Charsets.UTF_8.name() // We want UTF-8 for everything
        options.release.set(project.ext.get("javaToolchainVersion") as Int)
    }

    processResources {
        filteringCharset = Charsets.UTF_8.name() // We want UTF-8 for everything
    }

    withType<Jar> {
        archiveBaseName.set(rootProject.name) // Set JAR filename to match the project name
        from(rootProject.file("LICENSE")) // Include the LICENSE file in the built jar
    }
}

dependencies {
    compileOnly(libs.paper.api)
}

paper {
    main = "me.sytex.plugin.Plugin"

    apiVersion = "1.21"

    foliaSupported = true

    name = "Plugin"
    description = "A Paper Plugin Template"
    version = project.version as String

    authors = listOf("Sytex")
    contributors = listOf()
}