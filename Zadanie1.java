public class Zadanie1 {
    public static void main(String[] args) {

        boolean czyPada = false;
        boolean czySwieciSlonce = false;

        if(czyPada==true && czySwieciSlonce==false)
        {
            System.out.println("Plucha");
        }
        else{
            if(czyPada==true && czySwieciSlonce==true){
                System.out.println("tęcza");
            }
            else{
                if(czyPada==false && czySwieciSlonce==true){
                    System.out.println("słonecznie");
                }
                else {
                    System.out.println("pochmurno");
                }
            }
        }

    }
}
