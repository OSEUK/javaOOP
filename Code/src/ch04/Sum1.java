package ch04;

public class Sum1 {
    int n = 0;

    public int getN() {
        return n;
    }

    int add(int num){
        if(num > 100){
            n += num;
            printNum();
        }
        else if(num <= 50){
            return n;
        }
        else{
            printNum();
        }
        return n;
    }
    void printNum(){
        System.out.println(getN());
    }


}
