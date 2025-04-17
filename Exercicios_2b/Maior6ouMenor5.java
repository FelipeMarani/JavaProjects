
import java.util.Scanner;

public class Maior6ouMenor5 {

    public static void main(String[] args) {
        Scanner tcdscanner  = new Scanner(System.in);

        System.out.println("Programa para calcular o maior e o menor número entre 6 e 5");

        System.out.println("Digite o numero a ser comparado: ");
        int num = tcdscanner.nextInt();
        tcdscanner.close();

        if (num > 6) {
            System.out.println("O numero informado é maior que 6");
        }
        else if(num == 6){
            System.out.println("O numero informado é igual a 6");
        }
        else if(num == 5){
            System.out.println("O numero informado é igual a 5");
        }
        else{
            System.out.println("O numero informado é menor que 5");
        }

    }

}
