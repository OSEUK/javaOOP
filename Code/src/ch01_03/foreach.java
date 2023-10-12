package ch01_03;
class Hello{
    String toWhom = "world";

    public String getWhom() {
        return toWhom;
    }

    public void setWhom(String toWhom) {
        this.toWhom = toWhom;
    }

    void sayHello(){
        System.out.println("hello " + toWhom);
    }
}
public class foreach {
    public static void main(String[] args) {
        Hello arr[] = new Hello[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = new Hello();
        }

        String whom[] = { "ycho", "jsl", "everyone" };
        int index = 0;
        for (Hello a : arr) {
            a.setWhom(whom[index]);
            index++;
        }

        // 화면에 출력
        for (Hello a : arr) {
            a.sayHello();
        }

    }
}
