
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa Verificador de anos bissextos");

        System.out.print("Informe o ano que deseja verificar: ");
        int year = tcdScanner.nextInt();

        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println("O ano de " + year + " Foi, ou será bissexto");
        } else {
            System.out.println("O ano de " + year + " não foi, ou não será bissexto");
        }

    }

}
