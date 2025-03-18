
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        
        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa Maior ou Menor");

        System.out.print("Digite um número: ");
        double n1 = tcdScanner.nextDouble();

        System.out.print("Digite outro numero: ");
        double n2 = tcdScanner.nextDouble();

        if (n1 > n2) {
            
            System.out.println("O valor de " + n1 + " é maior que "+ n2);

        }
        else if (n1 == n2) {
            System.out.println("O valor de " + n1 + " é igual ao "+ n2);
        }
        else{
            System.out.println("O valor de "+ n2 +" é maior que "+n1);
        }

    }

}
