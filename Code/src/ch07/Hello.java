package ch07;

public abstract class Hello {
    private String toWhom;

    public Hello(String toWhom) {
        this.toWhom = toWhom;
    }

    public String getToWhom() {
        return toWhom;
    }
    public abstract void sayHello();
}
