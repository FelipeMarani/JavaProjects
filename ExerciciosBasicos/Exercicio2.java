import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = tcdScanner.next();

        System.out.print("Digite sua idade:");
        int year = tcdScanner.nextInt();

        System.out.print("Digite sua altura:");
        double high = tcdScanner.nextDouble();

        System.out.println("Bem vindo " + name);
        System.out.printf("%s, você possui %d anos  tem %,.2fcm", name,year,high);
        System.out.println("");

    }

}
