package com.collection.test.ListStudentDemo;

import java.util.ArrayList;
import java.util.List;

/*
    1 定义学生类
    2 创建List集合对象
    3 创建学生对象
    4 把学生添加到集合
    5 遍历集合（迭代器和for循环）
 */
public class ListDemo {
    public static void main(String[] args) {
        //创建List集合对象
        List<Student> list = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("张三", 30);
        Student s2 = new Student("李四", 40);
        Student s3 = new Student("王五", 50);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //遍历集合
        for (Student s : list) {
            System.out.println(s.getName() + ',' + s.getAge());
        }

    }
}
