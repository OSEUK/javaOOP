package ch04;

public class RecursiveSum {
    long sum(int n){
        if(n == 1)
            return 1;
        else
            return n + sum(n-1);
    }

    public static void main(String[] args) {
        RecursiveSum rs = new RecursiveSum();

        System.out.println(rs.sum(100));
    }

}
