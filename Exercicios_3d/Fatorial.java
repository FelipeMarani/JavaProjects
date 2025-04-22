
import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        System.out.println("Programa para calcular o fatorial de um numero inteiro:");

        Scanner tcdScanner = new Scanner(System.in);

        System.out.print("Informe o numero a ser calculado: ");
        int num = tcdScanner.nextInt();
        tcdScanner.close();
        int fat = 1;

        for (int i = 1; i <= num; i++) {

            fat *= i;

        }
        System.out.println(fat);
    }

}
