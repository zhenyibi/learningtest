package com.Lambda;

/**
 * @author zhenyiBi
 * @date 2022/7/21
 * <p>
 * 练习2：
 * 1 定义一个接口(Flyable),里面定义一个抽象方法，void fly(String s);
 * 2 定义一个测试类（FlyableDemo）,在测试类中提供两个方法
 * 一个是useFly(Flyable f)
 * 一个方法是主方法，在主方法中调用useFlyable方法
 */
public class FlyableDemo {
    public static void main(String[] args) {
        //在主方法中调用useFlyable方法
        Flyable f = new FlyableImpl();
        useFylable(f);
        System.out.println("---------------");

        //匿名内部类
        useFylable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println(s + "飞起来了");
            }
        });

        System.out.println("---------------");

        //Lambda表达式
        useFylable((String s) -> {
            System.out.println(s + "飞起来了");
        });
    }

    private static void useFylable(Flyable f) {
        f.fly("bob");
    }
}
