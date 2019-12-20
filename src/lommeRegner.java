import java.util.Scanner;
public class lommeRegner {

    //Opgave 3
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Indtast A:");
        int a = input.nextInt();
        System.out.println("Indtast B:");
        int b = input.nextInt();

        System.out.println("Sum:" + Quickmaths.sum(a, b));

        System.out.println("Gennemsnit:" + Quickmaths.gennemsnit(a, b));

    }



}


