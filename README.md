Hello J2ObjC
============

UPDATE NEEDED!
--------------
This project is currently outdated, I will update it soon.    
The j2objc-gradle plugin has been deprecated and it only supports OLD version of J2Objc itself.   
This project currently fails to build unless you use an old version of j2objc (0.9).   
I will update this soon to use a manual build script to run j2objc and create a static library.   
FOR NOW THIS PROJECT DOES NOT WORK UNLESS YOU USE AN OLDER VERSION OF J2OBJC, BUT IT STILL CAN BE USED AS REFERENCE.      


Overview
--------
Sample project for getting started with J2ObjC.

Uses [IDEA](https://www.jetbrains.com/idea/), [J2ObjC](http://j2objc.org/),
[j2objc-gradle](https://github.com/j2objc-contrib/j2objc-gradle),
and [Xcode](https://developer.apple.com/xcode/).

The philosophy here is to create an ObjC STATIC LIBRARY from Java source code.
Then AFTER the J2ObjC transpilation works, import the created library into Xcode.

(There are many other ways to work with J2ObjC, you can, for example, have Xcode build your
Java files on the fly, or have your Java project create a Cocoapod via j2objc-gradle,
but for a clear understanding and clean path this project favors the static library approach.)


Setup JAVA Project and run J2ObjC
----------------------------------

The first part is to get a plain Java project with J2ObjC support working (no XCode involved, yet).

* Download and unpack J2ObjC somewhere logical.
* Make sure J2ObjC works (```cd <J2OBJC_HOME>``` >  ```j2objc -version```).
* Clone this repo.
* Import this project into IDEA (the main project is plain Java), import EXTERNAL MODEL -> GRADLE.
* Edit local.properties and set j2objc.home to the correct path (your local install).
* Once you have the Hello-J2OBJC project in IDEA, and local.properties, run ```gradle build```!

This should succeed and create *build/j2objcOutputs* and *build/binaries* and *build/packedBinaries*, etc.

Examine the transpiled Objective-C files at *build/j2objcOutputs/src/main/objc*.

Original Java source is at *src/main/java*.


Setup Xcode and Include Static Library
---------------------------------------

The second part is to use the static library you created in Xcode with an iOS project.

See the [ios/README.md](./ios/README.md).



