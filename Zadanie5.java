import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj polecenie i dwie liczby:");
        String polecenie = scanner.nextLine();
        switch (polecenie){
            case "ADD":
                int add=ADD();
                absoluteValue(add);
                break;
            case "SUB":
                int sub=SUB();
                absoluteValue(sub);
                break;
            case "DIV":
                int div=DIV();
                absoluteValue(div);
                break;
            case "MUL":
                int mul=MUL();
                absoluteValue(mul);
                break;
            default:
                System.out.println("Brak takiej operacji");
                break;
        }
    }
    public static int wczytaj1 (){
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        return x;
    }
    public static int wczytaj2 (){
        Scanner scanner = new Scanner(System.in);
        int y = Integer.parseInt(scanner.nextLine());
        return y;
    }
    public static void absoluteValue(int wynik){
        wynik=Math.abs(wynik);
        System.out.println(wynik);
    }
    public static int ADD () {
        int add = wczytaj1()+wczytaj2();
        return add;
    }
    public static int SUB () {
        int sub = wczytaj1()-wczytaj2();
        return sub;
    }
    public static int DIV () {
        int div = wczytaj1()/wczytaj2();
        return div;
    }
    public static int MUL () {
        int mul = wczytaj1()*wczytaj2();
        return mul;
    }
}