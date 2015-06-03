/*
 * wuff
 *
 * Copyright 2014-2015 Andrey Hihlovskiy and contributors.
 *
 * See the file "LICENSE" for copying and usage permission.
 */
package org.akhikhl.wuff

/**
 *
 * @author akhikhl
 */
class WrappedLibConfig {

  List excludedImports = []

  void excludeImport(importPattern) {
    excludedImports.add(importPattern)
  }
}

