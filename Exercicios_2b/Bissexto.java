
import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {
        Scanner tcdscanner = new Scanner(System.in);

        System.out.println("Programa para a verificação de anos bissextos.");

        System.out.println("Insira um ano: ");
        int year = tcdscanner.nextInt();

        tcdscanner.close();

        if (year % 4 == 0 || year % 400 == 0) {

            System.out.println("O ano é bissexto");
        } else {
            System.out.println("O ano não é bissexto");
        }
    }

}
