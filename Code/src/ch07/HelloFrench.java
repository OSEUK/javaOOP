package ch07;

public class HelloFrench extends Hello{
    public HelloFrench(String toWhom) {
        super(toWhom);
    }

    @Override
    public void sayHello() {
        System.out.println("Bonjour " + getToWhom());
    }
}
