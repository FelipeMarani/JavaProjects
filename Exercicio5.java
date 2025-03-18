
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);
        System.out.println("Programa Conversor de Celsius em Fahrenheit");

        System.out.print("Digite a temperatura em graus Celsius:");
        double Celsius = tcdScanner.nextDouble();

        double fahrenheit = (Celsius * (9/5)) + 32;

        System.out.printf("A temperatura %,.2f° em fahrenheit é de %,.2f°", Celsius, fahrenheit);

    }

}
