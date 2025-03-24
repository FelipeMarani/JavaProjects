
import java.util.Scanner;

public class ExercicioB1 {

    public static void main(String[] args) {

        Scanner tcdcScanner = new Scanner(System.in);

        System.out.print("Digite a sua idade com ponto:");
        double yaer = tcdcScanner.nextDouble();

        int age = (int)yaer;
        double dec = yaer - age;
        int mes = (int)(dec * 12);

        System.out.printf("Você possuí %d anos e  %d meses", age, mes);

    }

}
