package com.collection.test.GenericDemo;

/*
    类型通配符 <?>
        匹配任何类型
    类型通配符上限 <? extends 类型>
        List<? extends Number> 可表示Number及其子类
    类型通配符下限 <? super 类型>
        List<? super Number> 可表示Number及其父类
 */

import java.util.ArrayList;
import java.util.List;

public class GenericSuperExtendDemo {
    public static void main(String[] args) {
        //类型通配符 <?>
        List<?> l1 = new ArrayList<Object>();
        List<?> l2 = new ArrayList<Number>();
        List<?> l3 = new ArrayList<Integer>();

        //类型通配符上限 <? extends 类型>
//        List<? extends Number> l4 = new ArrayList<Object>();
        List<? extends Number> l5 = new ArrayList<Number>();
        List<? extends Number> l6 = new ArrayList<Integer>();

//        类型通配符下限 <? super 类型>
        List<? super Number> l7 = new ArrayList<Object>();
        List<? super Number> l8 = new ArrayList<Number>();
//        List<? super Number> l9 = new ArrayList<Integer>();
    }
}
