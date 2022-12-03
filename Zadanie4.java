import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj polecenie i dwie liczby:");
        String polecenie = scanner.nextLine();
        switch (polecenie){
            case "ADD":
                ADD();
                break;
            case "SUB":
                SUB();
                break;
            case "DIV":
                DIV();
                break;
            case "MUL":
                MUL();
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
    public static void ADD () {
        int add = wczytaj1()+wczytaj2();
        System.out.println(add);
    }
    public static void SUB () {
        int sub = wczytaj1()-wczytaj2();
        System.out.println(sub);
    }
    public static void DIV () {
        int div = wczytaj1()/wczytaj2();
        System.out.println(div);
    }
    public static void MUL () {
        int mul = wczytaj1()*wczytaj2();
        System.out.println(mul);
    }
}