package singleton;

/**
 * 实体类
 * 饿汉式
 */
public class Person {
    private static Person person = new Person();

    private Person() {
    }

    public static Person getInstance() {
        return person;
    }

    public void say() {
        System.out.println("say...");
    }
}

/**
 * 懒汉式(懒加载),使用双重检查锁来保证线程安全
 */
class Person2 {
    private static Person2 person;

    public static Person2 getInstance() {
        if (person == null) {
            synchronized (Person2.class) {
                if (person == null) {
                    person = new Person2();
                }
            }
        }
        return person;
    }
}
