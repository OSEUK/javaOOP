package ch06;

public class CoffeeBean {
    private String species = "Coffee";
    void print() {
        System.out.println(species);
    }
    protected void setSpecies(String s) { species = s ;}
    public String getSpecies() { return species; }
}
