package ch_midterm;
class Subway{
    int linenum;

    public Subway(int linenum) {
        this.linenum = linenum;
    }
    void run(){
        System.out.println("Line" + linenum + "runs");
    }

    void renum(int n){
        linenum = n;
    }
}
public class chm2 {
    public static void main(String[] args) {
        Subway sw = new Subway(1);

        sw.run();
        sw.renum(2);
        sw.run();
    }
}
