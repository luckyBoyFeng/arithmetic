package com.dafeng.arithmetic;

public class AInstance {

    //饿汉式
//    public static  AInstance mInstance = new AInstance();
    AInstance() {

    }

//    public static AInstance getInstance() {
//        return mInstance;
//    }

    //懒汉式
//    public static AInstance mInstance = null;
//
//    public static AInstance getInstance() {
//        if (mInstance == null) {
//            mInstance = new AInstance();
//        }
//        return mInstance;
//    }

    //懒汉式线程安全
    public static AInstance mInstance = null;

    public static synchronized AInstance getInstance() {
        if (mInstance == null) {
            mInstance = new AInstance();
        }
        return mInstance;
    }

    //静态内部类
    public static class BHolder {
        public static final AInstance mInstance = new AInstance();
    }

    public static final AInstance getmInstance() {
        return BHolder.mInstance;
    }

}