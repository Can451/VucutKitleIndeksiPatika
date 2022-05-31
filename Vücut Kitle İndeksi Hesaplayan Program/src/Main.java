import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double result;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boy giriniz: ");
        double boy = inp.nextDouble();
        System.out.println("Kilo giriniz: ");
        double kilo = inp.nextDouble();

        result=kilo/ (boy*boy);
        System.out.println("Kitle indeksi: "+result);

    }
}
