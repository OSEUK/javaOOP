package ch07;

public class TestHello {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];

        helloArray[0] = new HelloFrench("OH");
        helloArray[1] = new HelloSpanish("SE");
        helloArray[2] = new HelloKorean("WOOK");

        for(Hello ha : helloArray){
            ha.sayHello();
        }
    }
}
