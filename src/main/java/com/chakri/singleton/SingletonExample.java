package com.chakri.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample = null;
    private String s;
    private SingletonExample(){
        s = "I am singleton";
    }

    public static synchronized SingletonExample createSingleton() {
        if (singletonExample == null)
            singletonExample = new SingletonExample();
        return singletonExample;
    }

}
