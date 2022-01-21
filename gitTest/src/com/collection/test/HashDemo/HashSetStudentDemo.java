package com.collection.test.HashDemo;

/*
    1 定义学生类
    2 创建HashSet集合对象
    3 创建学生对象
    4 把学生添加到集合
    5 遍历集合
    6 在学生类中重写hashCode()和equals()方法
 */

import java.util.HashSet;

public class HashSetStudentDemo {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<Student> hs = new HashSet<>();

        //创建学生对象
        Student s1 = new Student("张三",30);
        Student s2 = new Student("李四",40);
        Student s3 = new Student("王五",50);

        Student s4 = new Student("王五",50);//需要在学生类中重写hashCode()和equals()方法

        //把学生添加到集合
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        //遍历集合
        for(Student s:hs){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
