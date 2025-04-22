import java.util.Arrays;
import java.util.Scanner;

public class Maior {

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);
        int[] lst = new int[5];
        System.out.println("Programa para a verificação do maior elemento presente na lista.");
        for (int i = 0; i < 5; i++) {
            System.err.println("Insira um valor inteiro:");
            int value = tcdScanner.nextInt();
            lst[i] = value;
        }
        tcdScanner.close();
        Arrays.sort(lst);
        System.out.println("O maior elemento da lista é: " + lst[lst.length - 1]);
    }
}
