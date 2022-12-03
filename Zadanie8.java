import java.util.Scanner;

public class Zadanie8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w kantorze!");
        System.out.println("Wybierz walutę:");
        System.out.println("1 - PLN");
        System.out.println("2 - JPY");
        int numer = scanner.nextInt();
        System.out.println("Wprowadź kwotę:");
        double kwota = scanner.nextDouble();

        if (numer == 1){
            double kwota2 = kwota*30.27;
            kwota2 = Math.round(kwota2*100.0)/100.0;
            System.out.println(kwota+" zł => "+kwota2+"¥");

        } else if (numer ==2) {
            double kwota2 = kwota*0.03;
            kwota2 = Math.round(kwota2*100.0)/100.0;
            System.out.println(kwota+" ¥ => "+kwota2+" zł");
        }
        else {
            System.out.println("Nie wybrano poprawnie waluty");
        }
    }
}
