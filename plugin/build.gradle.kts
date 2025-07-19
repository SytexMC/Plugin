plugins {
    alias(libs.plugins.run.paper)
    alias(libs.plugins.pluginyml)
}

java { toolchain.languageVersion.set(JavaLanguageVersion.of(project.ext.get("javaToolchainVersion") as Int)) }

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(project.ext.get("javaToolchainVersion") as Int)
    }

    javadoc { options.encoding = Charsets.UTF_8.name() }
    processResources { filteringCharset = Charsets.UTF_8.name() }

    runServer {
        minecraftVersion("1.21.7")
        jvmArgs("-Dcom.mojang.eula.agree=true")
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