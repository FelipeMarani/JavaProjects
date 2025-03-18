
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa Verificador da área do triângulo");

        System.out.print("Digite o valor da base do triângulo:");
        double bs = tcdScanner.nextDouble();

        System.out.print("Digite a altura do triângulo:");
        double high = tcdScanner.nextDouble();

        double area = (bs * high) /2;

        System.out.printf("A área do triângulo é de: %,.2f",area);

    }

}
