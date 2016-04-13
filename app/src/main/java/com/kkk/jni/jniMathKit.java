package com.kkk.jni;

/**
 * Created by kkk on 2016/4/13.
 */
public class jniMathKit {
    public native int getSum(int a,int b);//get a+b
    static {
        System.loadLibrary("jniDemo");
    }
}
