package ch01_03;

public class UseSplit {
    public static void main(String[] args) {
        String[] arr = {"New York", "Beijing", "Seoul"};
        boolean b = false;
        for(int i =0; i<3; i++){
            if(arr[i].equals("Seoul")){
                System.out.println(i + " " + arr[i]);
                b = true;
            }
        }
        if(b == false){
            System.out.println("Seoul not found");
        }
    }
}
