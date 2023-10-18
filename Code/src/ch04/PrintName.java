package ch04;

public class PrintName {
    String name;

    void setName(String nm) {name = nm;}
    void printName() { printString(name);}
    void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        PrintName pn = new PrintName();
        pn.setName("SEWOOK OH");
        pn.printName();
    }
}
