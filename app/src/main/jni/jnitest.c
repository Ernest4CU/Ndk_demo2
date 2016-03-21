#include "com_example_icui4cu_ndk_demo2_libHelloJni.h"
JNIEXPORT jstring JNICALL Java_com_example_icui4cu_ndk_1demo2_libHelloJni_getCLanguageString
        (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"这是一个android studio NDK测试!");
}