Hello J2ObjC
============


Overview
--------
Sample project for getting started with J2ObjC.

Uses [IDEA](https://www.jetbrains.com/idea/), [J2ObjC](http://j2objc.org/),
[j2objc-gradle](https://github.com/j2objc-contrib/j2objc-gradle),
and [XCode](https://developer.apple.com/xcode/).

The philosophy here is to create a static ObjC library from Java source code.
Then AFTER the J2ObjC transpilation works, import the created library into XCode.

(There are many other ways to work with J2ObjC, you can, for example, have XCode build your
Java files on the fly, or have your Java project create a Cocoapod via j2objc-gradle,
but for a clear understanding and clean path this project favors the static library approach.)


Setup JAVA Project and run J2ObjC
----------------------------------

The first part is to get a plain Java project with J2ObjC support working (no XCode involved, yet).

* Download and unzip J2ObjC.
* Set J2OBJC_HOME as an env var (```export J2OBJC_HOME=<your dir>```).
* Make sure J2ObjC works (```cd $J2OBJC_HOME``` >  ```j2objc -version```).
* Clone this repo.
* Import this project into IDEA (the main project is plain Java), import EXTERNAL MODEL -> GRADLE.
* Edit local.properties and set j2objc.home to the correct path (your local install).
* Once you have the Hello-J2OBJC project in IDEA, and local.properties, run ```gradle build```!

This should succeed and create *build/j2objcOutputs* and *build/binaries* and *build/packedBinaries*, etc.

Examine the transpiled Objective-C files at *build/j2objcOutputs/src/main/objc*.

Original Java source is at *src/main/java*.


Setup XCode and Include Static Library
---------------------------------------

The second part is to use the static library you created in XCode with an iOS project.

See the README.MD in the ./ios project



Installing J2ObjC (example, if you don't already have it)
----------------------------------------------------------
  ```J2OBJC_HOME=~/j2objcDist
  mkdir -p $J2OBJC_HOME; pushd $J2OBJC_HOME
  curl -L https://github.com/google/j2objc/releases/download/1.0.2/j2objc-1.0.2.zip > j2objc-1.0.2.zip
  unzip j2objc-1.0.2.zip; popd

  export $J2OBJC_HOME
