Hello J2ObjC XCode
==================

See notes in ../README.md (if you didn't start there, go read that).

There are many ways to work with J2ObjC generated code inside an iOS project (XCode).
For this Hello World example this project favors importing code compiled with J2Objc as a STATIC LIBRARY.

This iOS project ASSUMES you have already succeeded in transpiling
*HelloWorld.java* into *libHello-J2ObjC-j2objc.a* (the static library) from the top level project (../).



Setup XCode
-----------

* Make sure that $J2OBJC_HOME is set correctly before proceeding.
* Allow XCode to use env vars: ```defaults write com.apple.dt.Xcode UseSanitizedBuildSystemEnvironment -bool NO```
* Make sure that *java/build/packedBinaries/libHello-J2ObjC-j2objc.a* exists.
* Open the iOS project in XCode: File->Open, browse to "iOS" folder of this project and open.

TODO
* Add Build Settings Other Linker Flags for -ljre_emul
* Add Build Settings Search Paths (Header, Library, User Header)
* Add Build Phase Link Binaries With Libraries (and point to lib)
* Build and Run in XCode







