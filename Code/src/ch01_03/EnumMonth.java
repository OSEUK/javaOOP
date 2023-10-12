package ch01_03;

enum Month {
    JAN(1, "January"), FEB(2, "February"),
    MAR(3, "March"), APR(4, "April"),
    MAY(5, "May"), JUN(6, "June"),
    JUL(7, "July"), AUG(8, "August"),
    SEP(9, "September"), OCT(10, "October"),
    NOV(11, "November"), DEC(12, "December");
    int month;
    String name;
    Month(int month, String name) {
        this.month = month;
        this.name = name;
    }
    int getMonth() { return month; }
    String getName() { return name; }
}
public class EnumMonth {
    public static void main(String[] args) {
        for( Month month : Month.values()) {
            System.out.printf(
                    "Value : %s, Num : %d, Name: %s\n",
                    month, month.getMonth(), month.getName()
            );
        }
    }

}
