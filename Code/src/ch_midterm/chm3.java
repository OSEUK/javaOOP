package ch_midterm;

class Coffee{
    String origin, grade;
    int degreeOfRoast;

    public Coffee(String origin) {
        this.origin = origin;
    }

   public Coffee(String o, String g){
        origin = o;
        grade = g;
   }

    public void roasting(int d){
        System.out.println("roasting... " + origin + " " + grade);
        degreeOfRoast = d;
    }
    public void grinding(){
        System.out.println("degree of roast is " + degreeOfRoast);
    }
    public void brew() {
        System.out.println("brewing...");
    }

}
public class chm3 {
    public static void main(String[] args) {
        Coffee cf1 = new Coffee("Kenya", "AA");
        Coffee cf2 = new Coffee("brazil");
        cf1.roasting(6);
        cf1.grinding();
        cf2.roasting(2);
        cf2.grinding();
    }
}
