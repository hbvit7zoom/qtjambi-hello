# README

'java.library.path=

/usr/java/packages/lib:
/usr/lib64:/lib64:
/lib:
/usr/lib:
/tmp/QtJambi6.12.0-linux-x64_216314'

/usr/lib/x86_64-linux-gnu/libQt6Core.so.6
/usr/lib/x86_64-linux-gnu/libQt6Widgets.so.6


Exception in thread "main" io.qt.QLibraryNotFoundError: Library QtCore (libQt6Core.so.6.8, libQt6Core.so.6, libQt6Core.so) was not found in 'java.library.path=/usr/java/packages/lib:/usr/lib64:/lib64:/lib:/usr/lib:/tmp/QtJambi6.8.2_223577'

'-Djava.library.path=/usr/lib/x86_64-linux-gnu'

Exception in thread "main" io.qt.QLibraryNotFoundError: Library QtJambi (libQtJambi.so.6.8.2, libQtJambi.so.6.8, libQtJambi.so.6, libQtJambi.so) was not found due to missing module 'qtjambi-native-linux-x64'