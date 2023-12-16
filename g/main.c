#include <stdio.h>
#include <jni.h>
#include "main1.h"

JNIEXPORT jint JNICALL Java_main1_sqr(JNIEnv *env, jclass obj, jint i){
    return i * i;
}


JNIEXPORT jint JNICALL Java_main1_cub
  (JNIEnv *env, jclass obj, jint i) {
    return i * i * i;
  }