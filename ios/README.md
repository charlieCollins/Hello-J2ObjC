XCode/iOS Setup
===============

APPROACH
--------
There are many ways to work with J2ObjC generated code inside an iOS project (XCode).
For this simple Hello World example I am importing code compiled with J2Objc as a STATIC LIBRARY.

REQUIRED STEPS
--------------
You need to have J2ObjC installed, so that you can link to it's libs and headers in XCode.
Then you need to set an env var to point to where your install.
```export J2OBJC_HOME=<where you installed J2OBJC```

You also need to tell XCode to allow env vars (because, it's XCode, lols).
```defaults write com.apple.dt.Xcode UseSanitizedBuildSystemEnvironment -bool NO```

Once you have J2ObjC installed (extracted) and have defined J2OBJC_HOME, proceed...

TODO - make this not suck, quick notes....

1. Make sure you can BUILD the ObjC code using the java project (see README there).
2. Make sure your java/build/j2ObjcOutputs output has .h and .m files.
3. Make sure your java/build/packedBinaries output has .a files (these are the libraries).
4. Add Build Settings Other Linker Flags for -ljre_emul
5. Add Build Settings Search Paths (Header, Library, User Header)
6. Add Build Phase Link Binaries With Libraries (and point to lib)
7. Build and Run in XCode







