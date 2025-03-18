
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner Scannertcd = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = Scannertcd.next();
        System.out.println("Digite seu sobrenome:");
        String sobrenome = Scannertcd.next();

        System.out.print(sobrenome + " ");
        System.out.println(nome);
        

    }

}
