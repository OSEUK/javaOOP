import java.util.Scanner;
class Gcd {

    int gcd(int m , int n) {
        if (m == 0)
            return m;
        else if (m % n == 0)
            return n;
        else
            return gcd(n, m % n);
    }
}

public class Homework4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gcd gcd = new Gcd();
        System.out.print("두 수를 입력하세요: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.println("두 수의 최대공약수는 " + gcd.gcd(m,n) + "입니다.");
    }

}
