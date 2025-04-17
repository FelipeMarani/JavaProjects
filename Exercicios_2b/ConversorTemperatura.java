
import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {
        Scanner tcdscanner = new Scanner(System.in);

        System.out.println("Programa para converter temperatura de Celsius para Fahrenheit");

        System.out.print("Digite a temperatura em Celsus: ");
        double celsius = tcdscanner.nextDouble();
        tcdscanner.nextLine();

        tcdscanner.close();

        double fahrenheit = (celsius * (9/5)) + 32;
        String resultado = String.format("%.1f", fahrenheit);

        System.out.println("A temperatura em Fahrenheit é: " + resultado + "°F");
        

        
    }

}
