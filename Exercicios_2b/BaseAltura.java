import java.util.Scanner;

public class BaseAltura {

    public static void main(String[] args) {
        Scanner tcdscanner = new Scanner(System.in);

        System.out.println("Programa para calcular a area de um triângulo");

        System.out.print("Digite a base do triângulo:");
        double base = tcdscanner.nextDouble();
        tcdscanner.nextLine();

        System.out.print("Digite a altura do triângulo:");
        double height = tcdscanner.nextDouble();
        tcdscanner.nextLine();

        tcdscanner.close();

        double area = (base * height) / 2;

        String resultado = String.format("%.1f", area);
        System.out.println("A área do triângulo é: " + resultado + "m²");

    }

}
