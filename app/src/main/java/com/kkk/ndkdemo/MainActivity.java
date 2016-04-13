package com.kkk.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.kkk.jni.jniMathKit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jniMathKit jniMathKit= new jniMathKit();
        Log.e("sb", "sum :"+ jniMathKit.getSum(5,6) );
    }
}
