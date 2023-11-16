package ch06;

public class Robusta extends CoffeeBean{
    @Override
    void print() {
        System.out.println("Robusta coffee...");
    }
    void print(String s){
        System.out.printf("%s: %s\n", getSpecies(), s);
    }
}
