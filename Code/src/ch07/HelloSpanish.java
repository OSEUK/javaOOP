package ch07;

public class HelloSpanish extends Hello{
    public HelloSpanish(String toWhom) {
        super(toWhom);
    }

    @Override
    public void sayHello() {
        System.out.println("Hola a todos " + getToWhom());
    }
}
