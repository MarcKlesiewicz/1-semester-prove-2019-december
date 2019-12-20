import org.w3c.dom.ls.LSOutput;

public class Main {


    public static void main(String[] args) {

        //Opgave 1.a
        System.out.println("Hello World!");

        //Opgave 1.b
        System.out.printf(hello("András"));

        System.out.println(hello(""));


    }


    public static String hello(String navn) {

        if (navn == "András") {
            return "Hello " + navn+"!";
        }else{
            return "Hello World!";
        }

    }



}
