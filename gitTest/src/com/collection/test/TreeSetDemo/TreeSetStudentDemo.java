package com.collection.test.TreeSetDemo;

/*
    存储学生对象并遍历。创建集合使用无参构造方法；
    要求按照年龄从小到大进行排序，年龄相同时按照姓名的字母排序
 */

import java.util.TreeSet;

public class TreeSetStudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //创建学生对象
        Student s1 = new Student("xishi",29);
        Student s2 = new Student("wangzhaojun",28);
        Student s3 = new Student("diaochan",30);
        Student s4 = new Student("yangyuhuan",33);

        Student s5 = new Student("lingqingxia",33);
        Student s6 = new Student("lingqingxia",33);

        //把学生添加到集合
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        //遍历集合
        for(Student s : ts){
            System.out.println(s.getName()+','+s.getAge());
        }
    }
}
