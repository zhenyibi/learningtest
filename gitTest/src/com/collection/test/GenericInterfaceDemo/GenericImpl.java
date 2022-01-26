package com.collection.test.GenericInterfaceDemo;

public class GenericImpl <T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
