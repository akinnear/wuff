![Wuff logo](media/logo.png "Wuff logo")

[![Build Status](https://travis-ci.org/akhikhl/wuff.png?branch=master)](https://travis-ci.org/akhikhl/wuff)
[![Release](http://img.shields.io/badge/release-0.0.20-47b31f.svg)](https://github.com/akhikhl/wuff/releases/latest)
[![Snapshot](http://img.shields.io/badge/current-0.0.21--SNAPSHOT-47b31f.svg)](https://github.com/akhikhl/wuff/tree/master)
[![License](http://img.shields.io/badge/license-MIT-47b31f.svg)](#copyright-and-license)

### Introduction

Wuff is a gradle plugin for developing and assembling OSGi/Eclipse applications and plugins *independently* of Eclipse-IDE. If you are familiar with [Eclipse Tycho](https://www.eclipse.org/tycho/), then think of Wuff as a gradle-based alternative.

#### What's new :star:

### Version 0.0.23 (unofficial release)

 - added Eclipse Neon 2 SDK (4.6.2) as default configuration
 - reverted Groovy and Spock to `2.3`

### Version 0.0.22 (unofficial release)

Includes fixes relevant to Gradle 3.0.

 - fixed `GroovyRuntimeException` - `Cannot cast object '[configuration]' with class 'java.util.ArrayList' to class 'org.gradle.api.file.FileCollection'`
 - fixed `Manifest.writeTo(Writer) has been deprecated` warning
 - upgraded Groovy and Spock to `2.4`

### Version 0.0.21 (unofficial release)

 - added Eclipse Mars 2 SDK (4.5.2) as default configuration
 - fixed an extension point generation issue for user classes starting with `View`, e.g., `ViewSomething.java`.
 - added `skipRequireBundle` and `skipImportPackage` wuff configurations. Use these 2 to exclude certain entries from the generated `MANIFEST.MF` file.

### Version 0.0.20

- introduced publicLib configuration for eclipse bundles and applications.

### Version 0.0.19

- implemented consistent interpretation of 'provided' configuration: all artifacts in provided are visible at compile-time, but excluded from application bundles

- introduced requireBundle mechanism for wrapped libs

### Version 0.0.18

- Using unpuzzle 0.0.22, which incorporates pull request "ArchiveUnpacker now preserves "executable" permissions in Tar and Zip" ( https://github.com/akhikhl/unpuzzle/pull/8 )

### Where to start?

- If you are new to Wuff, start your acquaintance with [main features](../../wiki/Main-features).

- If you want to create something from scratch quickly, take a look at the tutorials:
[first Equinox app](../../wiki/Create-first-Equinox-app), [first RCP app](../../wiki/Create-first-RCP-app) and [first IDE app](../../wiki/Create-first-IDE-app).

- If you already have bunch of existing Eclipse plugins and apps, consider [converting them to Gradle/Wuff](../../wiki/Convert-existing-Eclipse-plugins-and-apps-to-Gradle).

- If you want to learn all about Wuff systematically, read [wiki pages](../../wiki).

- If you already use Wuff, it is always a good idea to look in [what's new](whatsnew.md) file.

### How to use Wuff?

- Maven artifacts: 'org.akhikhl.wuff:wuff-plugin:+' at jcenter and maven central.
- Source code: compile, explore, deploy.

See more information on [prerequisites and usage](../../wiki/Prerequisites-and-usage) wiki page.

### Copyright and License

Copyright 2014-2015 (c) Andrey Hihlovskiy and contributors

All versions, present and past, of Wuff are licensed under [MIT license](LICENSE).

[![Support via Gittip](https://rawgithub.com/twolfson/gittip-badge/0.2.0/dist/gittip.png)](https://www.gittip.com/akhikhl/)
