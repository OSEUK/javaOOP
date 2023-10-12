package ch01_03;

public class Output10_59_2 {
    public static void main(String[] args) {
        for (int i = 10; i <= 50 ; i += 10){
            for(int j = 0; j <= 9; j++){
                System.out.print(i + j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
