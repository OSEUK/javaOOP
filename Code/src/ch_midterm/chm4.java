package ch_midterm;

class Hello {
    String towhom = "world";
    Hello(){}
    Hello(String whom){
        setTowhom(whom);
    }
    public void setTowhom(String towhom) {
        this.towhom = towhom;
    }
    public void sayHello(){
        System.out.println("hello" + towhom);
    }


}
public class chm4 {
    public static void main(String[] args) {
        Hello[] helloArray = new Hello[3];
        helloArray[0] = new Hello();
        helloArray[1] = new Hello("홍길동");
        helloArray[2] = new Hello("허균");

        for(int i = 0; i < helloArray.length; i++){
            helloArray[i].sayHello();
        }
    }
}
