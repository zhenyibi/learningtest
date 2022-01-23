package com.collection.test.TreeSetDemo;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student s) {
//        return 0;不添加
//        return 1;升序
//        return -1;降序

        //按照年龄从小到大进行排序
        int num = this.age - s.age;
        //年龄相同时按照姓名的字母排序
        return num == 0 ? this.name.compareTo(s.name) : num;
    }
}
