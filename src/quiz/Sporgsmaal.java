package quiz;

import java.util.Scanner;


public class Sporgsmaal {

    Scanner input = new Scanner(System.in);

    private String sporgsmaalTekst;

    private int pointVærdi;

    private String svar[] = {"svar1", "svar2", "svar3", "Svar4"};

    private int rigtigSvar;

    //Beder user om at indtaste et spørgsmål, og return derefter spørgsmål.
    public String setSporgsmaalTekst(String sporgsmaalTekst) {
        System.out.println("Skriv et spørgsmål. (maks 100 tegn)");
        sporgsmaalTekst = input.toString();
        while (sporgsmaalTekst.length()>100){
            System.out.println("for mange tegn (maks! 100 tegn)");
        }
        return sporgsmaalTekst;

    }

    public int setPointVærdi(int pointVærdi) {
        System.out.println("Set en pointværdi:");
        pointVærdi = input.nextInt();
        return pointVærdi;
    }

    public void setSvar(String[] svar) {
        this.svar = svar;
    }
}

