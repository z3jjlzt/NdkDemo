#include "com_kkk_jni_jniMathKit.h"

JNIEXPORT jint JNICALL Java_com_kkk_jni_jniMathKit_getSum
        (JNIEnv *env, jobject jobject, jint a, jint b){
    return a+b;
}