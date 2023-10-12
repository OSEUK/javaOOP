package ch01_03;

enum Light {
    RED(30, "Red"), AMBER(10, "Amber"), GREEN(30, "Green");

    int time;
    String color;
    Light(int time, String color){
        this.time = time;
        this.color = color;
    }

    int getTime(){return time;}
    String getColor() {return color;}
}
public class Enum7 {
    public static void main(String[] args) {
        for(Light light : Light.values()){
            System.out.printf("Value : %5s, Time : %d , Color : %5s\n", light, light.getTime(), light.getColor());
        }
    }
}
