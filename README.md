## Basic Github Java Project Archetype

This archetype can be used to generate simple maven projects,
which are hosted on Github.

## Contents

* Maven site 
   * Default Reports
   * Cobertura Code Coverage Report
   * JavaDoc
   * Markdown Site Support
   * Fluido Skin with Github Fork Me
* Dependencies
   * JUnit
   * [Google Guava](http://code.google.com/p/guava-libraries/)
   * [Typesafe Config](https://github.com/typesafehub/config)
* Maven Release Profile
   * Ready to release on maven central


## Setup

There are a few things to mind, when generating a maven project
with this archetype

### Git

Make sure to initialize a git repository otherwise the changelog
report won't work.

```
git init
```

### Git Connection

The connection is currently defined via `github/${groupId}/${artifactId}`.
Make sure this is correct

### Server

Checkout your _settings.xml_ in your _.m2_ folder. In order to use the
Github plugin and the maven release plugin to maven central, your _settings.xml_
should contain these servers.

```xml
<settings>
    ...
    <servers>
            <server>
                <id>sonatype-nexus-snapshots</id>
                <username>yourUser</username>
                <password>yourPassword</password>
            </server>
            <server>
                <id>sonatype-nexus-staging</id>
                <username>yourUser</username>
                <password>yourPassword</password>
            </server>
            <server>
                <id>github</id>
                <username>yourUser</username>
                <password>yourPassword</password>
            </server>
    </servers>
    ...
</settings>
```
