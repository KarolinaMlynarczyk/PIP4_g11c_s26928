import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 2 liczby rzeczywiste");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (b < a) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.println("Wybrany przedział: [" + a + ", " + b + "]");
        double d1 = Math.random() * (b - a) + 1;
        double d2 = Math.random() * (b - a) + 1;
        double d3 = Math.random() * (b - a) + 1;

        if (d1 < d2) {
            if (d2 < d3) {
                System.out.println(d1 + " < " + d2 + " < " + d3);
            } else {
                System.out.println(d1 + " < " + d3 + " < " + d2);
            }
        } else if (d1 > d3) {
            if (d2 < d3) {
                System.out.println(d3 + " < " + d2 + " < " + d1);
            }
            else {
                System.out.println(d2 + " < " + d3 + " < " + d1);
            }
        }
        else{
            if(d2<d3){
                System.out.println(d2+" < "+d1+" < "+d3);
            }
            else {
                System.out.println(d3+" < "+d1+" < "+d2);
            }
        }
    }
}
