import java.util.Scanner;

public class Quickmaths {


    public static int gennemsnit(int a, int b) {
        return ((a + b) / 2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void start() {
        boolean loop = true;

        while(loop){

            Scanner input = new Scanner(System.in);

            System.out.println("Indtast A:");
            int a = input.nextInt();
            System.out.println("Indtast B:");
            int b = input.nextInt();

            System.out.println("Sum:" + Quickmaths.sum(a, b));

            System.out.println("Gennemsnit:" + Quickmaths.gennemsnit(a, b));


        }
    }
}











