#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "Shutdown.h"

JNIEXPORT void JNICALL Java_Shutdown_shutdownWindows(JNIEnv *env, jclass obj){

    system("C:\\Windows\\System32\\shutdown /s");

}