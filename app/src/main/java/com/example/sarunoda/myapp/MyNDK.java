package com.example.sarunoda.myapp;

/**
 * Created by sarunoda on 10/6/2016.
 */
public class MyNDK {
    static{
        System.loadLibrary("MyLibrary");
    }
    public native String getMyString();
}
