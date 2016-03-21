package com.example.icui4cu.ndk_demo2;

/**
 * Created by ICUI4CU on 2016/3/20.
 */
public class libHelloJni {
    public native String getCLanguageString();
    static {
        System.loadLibrary("aabbccdd");
    }
}
