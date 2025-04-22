
import java.util.Scanner;

public class SomaLista {

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);
        int[] lst = new int[5];

        System.out.println("Programa para somar todos os elementos da lista");
        int sum = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Informe um numero inteiro:");
            int num = tcdScanner.nextInt();
            lst[i] = num;
            sum += num;
        }
        tcdScanner.close();
        System.out.println("A soma entre os valores é igual a: " + sum);
    }

}
