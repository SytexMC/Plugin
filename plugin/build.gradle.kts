plugins {
    `java-library`
    id("xyz.jpenilla.run-paper") version "2.3.1"
    id("de.eldoria.plugin-yml.paper") version "0.7.1"
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
        minecraftVersion("1.21.5")
        jvmArgs("-Dcom.mojang.eula.agree=true")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.7-R0.1-SNAPSHOT")
}

paper {
    main = "me.sytex.plugin.Plugin"
    bootstrapper = "me.sytex.plugin.PluginBootstrap"
    loader = "me.sytex.plugin.PluginLoader"

    apiVersion = "1.21"

    foliaSupported = true

    name = "Plugin"
    description = "A Paper Plugin Template"
    version = project.version as String

    authors = listOf("Sytex")
    contributors = listOf()
}