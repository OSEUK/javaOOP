package ch06;

public class TestChild {
    public static void main(String[] args) {
        Parent p = new Parent("parent");
        Child c = new Child("child", 0);

        System.out.println(c.getName());
        System.out.println(c.getValue());
    }
}
