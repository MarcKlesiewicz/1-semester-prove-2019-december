
import java.util.Arrays;
import java.util.Scanner;

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }

    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

//Opgave 4.b
    public void printBrugereArr() {
        for (int i = 0; i < 1 ; i++){
            System.out.println(Arrays.toString(getBrugere()));

        }

    }


    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {
        String reverseBrugere[] = getBrugere();
            System.out.println(Arrays.toString(getBrugere()));

        }




//opgave 4.a
    public void waitingFor0() {
        Scanner input = new Scanner(System.in);

        System.out.println("Venter på 0! Skriv et tal...");
        int tal = input.nextInt();
        while (tal != 0){
            System.out.println("Venter på 0! Skriv et tal...");
            tal = input.nextInt();
        }
        System.out.println("Du har tastet 0. Så er det slut!");
 
    }
}
