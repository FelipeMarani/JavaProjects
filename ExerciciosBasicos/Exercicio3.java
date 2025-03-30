
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa Verificador de médias");


        System.out.print("Digite o primeiro numero:");
        int n1 = tcdScanner.nextInt();
        System.out.print("Digite o segundo numero:");
        int n2 = tcdScanner.nextInt();
        System.out.print("Digite o terceiro numero:");
        int n3 = tcdScanner.nextInt();

        double media = (n1 + n2 + n3) / 3;

        System.out.printf("%,.2f", media);
        

        tcdScanner.close();
        

    }

}
