buildscript{
    repositories{
        maven{
            url "https://plugins.gradle.org/m2/"
        }
        maven{
            url 'http://dl.bintray.com/cjstehno/public'
        }
    }
    dependencies{
        classpath group: 'gradle.plugin.com.yahoo.parsec.parsec-templates',
                name: 'parsec-templates',
                version: '1.1-SNAPSHOT'
    }
}

if(!project.plugins.findPlugin(com.yahoo.parsec.parsec_templates.ParsecTemplatesPlugin)){
    project.apply(plugin: com.yahoo.parsec.parsec_templates.ParsecTemplatesPlugin)
}
