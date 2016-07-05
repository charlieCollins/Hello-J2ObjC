Hello J2ObjC XCode
==================

See notes in ../README.md (if you didn't start there, go read that).

There are many ways to work with J2ObjC generated code inside an iOS project (XCode).
For this Hello World example this project favors importing code compiled with J2Objc as a STATIC LIBRARY.

This iOS project ASSUMES you have already succeeded in transpiling
*HelloWorld.java* into *libHello-J2ObjC-j2objc.a* (the static library) from the top level project (../).



Setup XCode
-----------

* Make sure that *java/build/packedBinaries/libHello-J2ObjC-j2objc.a* exists.
* Open the iOS project in XCode: File->Open, browse to "iOS" folder of this project and open.

Inside the iOS project go to Build Settings and update paths.
There are library and header search paths that must be updated.
There are several RELATIVE paths that you should not have to change, and some complete paths that you will need to update.

The COMPLETE settings needed to link the static library are as follows:
* ALREADY SET - Build Settings -> Linking -> Other Linker Flags ````-ljre_emul```
* ALREADY SET - Build Settings -> Search Paths -> Always Search User Paths set to YES.
* UPDATE PATH - Add Build Settings -> Search Paths -> Header Search Paths: ```<path to J2ObjC>/include``` (for both debug and release)
* UPDATE PATH - Build Settings -> Search Paths Library Search Paths: ```<path to J2ObjC>/lib``` (for both debug and release)
* ALREADY SET - Build Settings -> Search Paths Library Search Paths Debug: ````../build/packedBinaries/Hello-J2ObjC-j2objcStaticLibrary/iosDebug```
* ALREADY SET - Build Settings -> Search Paths Library Search Paths Release: ````../build/packedBinaries/Hello-J2ObjC-j2objcStaticLibrary/iosRelease```
* ALREADY SET - Build Settings -> Search Paths User Header Search Paths: ````../build/j2objcOutputs/src/main/objc```
* ALREADY SET - Build Phase -> Link Binaries With Libraries (and point to lib)
* Build and Run in XCode


TODO
After getting env vars to work add these:
* Make sure that $J2OBJC_HOME is set correctly before proceeding.
* Allow XCode to use env vars: ```defaults write com.apple.dt.Xcode UseSanitizedBuildSystemEnvironment -bool NO```





