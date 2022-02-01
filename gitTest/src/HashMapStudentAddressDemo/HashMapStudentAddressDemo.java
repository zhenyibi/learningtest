package HashMapStudentAddressDemo;

/*
    需求：创建一个HashMap集合，键是学生对象（Student），值是居住地（String）。存储多个键值对对象，并遍历。
        要求保证键的唯一性：如果学生对象的成员变量值相同，就认为是同一个对象

    思路：1 定义学生类
         2 创建HashMap集合对象
         3 创建学生对象
         4 把学生添加到集合
         5 遍历集合
         6 在学生类中重写两个方法：hashCode()和equals()
 */


import java.util.HashMap;
import java.util.Set;

public class HashMapStudentAddressDemo {
    public static void main(String[] args) {
        //创建HashMap集合对象
        HashMap<Student, String> hm = new HashMap<>();

        //创建学生对象
        Student s1 = new Student("张三", 30);
        Student s2 = new Student("李四", 40);
        Student s3 = new Student("王五", 50);
        Student s4 = new Student("王五", 50);

        //把学生添加到集合
        hm.put(s1, "西安");
        hm.put(s2, "武汉");
        hm.put(s3, "郑州");
        hm.put(s4, "北京");

        //遍历集合
        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }

    }
}
