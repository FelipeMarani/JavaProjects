
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa Verificador Par e Ímpar");

        System.out.print("Informe um número inteiro qualquer: ");
        int num = tcdScanner.nextInt();

        if (num % 2 == 0) {

            System.out.println("O numero " + num + " é par");

        } else {
            System.out.println("O número digitado " + num + " é ímpar");
        }

        tcdScanner.close();

    }

}
