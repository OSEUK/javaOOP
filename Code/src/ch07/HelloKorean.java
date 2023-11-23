package ch07;

public class HelloKorean extends Hello{
    public HelloKorean(String toWhom) {
        super(toWhom);
    }

    @Override
    public void sayHello() {
        System.out.println("안녕하세요 " + getToWhom());
    }
}
