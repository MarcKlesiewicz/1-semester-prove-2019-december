
public class Person {

    // TODO Ret nedenstående datatyper
    String navn = "Test Testesen";
    int alder = 18;
    String by = "Næstved";
    int postNummer = 4700;
    String vej = "Femøvej";
    String husnummer = "3B";
    String nationalitet = "Dansk";
    String fritidsStringeresser = "Snitning, LOL, strikke";
    String smarthomeDevices =  "Xbox, 3 Smartlamper, Køleskab m.m.";
    double hojde = 1.56;
    double vaegt = 76;
    double karaktergennemsnit = 5.33;
    int eksamensKarakterer = 7, 12, -3, 4, 2, 10;
    String opdateretDato; // Sun Jan 08 00:00:00 CET 1978

    // TODO Vis eksempler på typecasting
    @Override
    public String toString() {
        return "Navn: " + navn + "By" + by;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.navn = "Test Testesen";
        person.by = "Næstved";
        System.out.println();
    }

}
