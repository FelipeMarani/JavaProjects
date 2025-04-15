
import java.util.Scanner;

public class Nome{
    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = tcdScanner.nextLine();

        tcdScanner.nextLine();
        
        System.out.println(nome);
        tcdScanner.close();
    }
}
