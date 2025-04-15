
import java.util.Scanner;

public class NomeSobrenome {

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);

        System.out.print("Digite seu primero nome: ");
        String prNome = tcdScanner.nextLine();

        tcdScanner.nextLine();

        System.out.print("Informe seu sobrenome: ");
        String  sgNome = tcdScanner.nextLine();

        tcdScanner.nextLine();
        tcdScanner.close();
        System.out.println("Seu nome é " + sgNome + " "+ prNome);

    }

}
