package com.collection.test.collectionStudentDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    1.定义学生类
    2.创建Collection集合对象
    3.创建学生对象
    4.把学生添加到集合
    5.遍历集合（迭代器方式）
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合对象
        Collection<Student> c = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("张三", 30);
        Student s2 = new Student("李四", 40);
        Student s3 = new Student("王五", 50);

        //把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);

        //遍历集合（迭代器方式）
        for (Student s : c) {
            System.out.println(s.getName() + ',' + s.getAge());
        }
    }
}
