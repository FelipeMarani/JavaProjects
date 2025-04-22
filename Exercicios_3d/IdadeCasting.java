import java.util.Scanner;

public class IdadeCasting {

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Programa para a conversão da idade em Inteiros.");

        System.out.print("Informe a sua idade com virgula, ex: 25,5: ");
        double year = tcdScanner.nextDouble();
        tcdScanner.close();

        int idade = (int)year;

        System.out.println("Você possuí " + idade + " anos");
    }


    
}
