
import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        Scanner tcdscanner = new Scanner(System.in);

        System.out.println("Programa para verificar se um número é par ou ímpar");

        System.out.print("Digite um numero inteiro:");
        int num = tcdscanner.nextInt();
        tcdscanner.nextLine();

        tcdscanner.close();
        if(num % 2 == 0){
            System.out.println("O numero informado é par");
        }
        else{
            System.out.println("O numero informado é impar.");
        }
        
    }

}
