package io.example.dsa.core.designpattern.creational;

public class Singleton {

    private static Singleton instance;

    private Singleton() {    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }

    protected Object readResolve()
    {
        return instance;
    }
}
