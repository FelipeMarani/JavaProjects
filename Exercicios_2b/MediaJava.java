import java.util.Scanner;

public class MediaJava {

    public static void main(String[] args) {
        Scanner tcdcanner = new Scanner(System.in);

        System.out.println("Insira 3 numeros inteiros para calcular a média:");

        System.out.print("Digite o primeiro numero:");
        int num = tcdcanner.nextInt();
        tcdcanner.nextLine();
        System.out.print("Digite o segundo numero");
        int num2 = tcdcanner.nextInt();
        tcdcanner.nextLine();
        System.out.print("Digite o terceiro numero:");
        int num3 = tcdcanner.nextInt();
        tcdcanner.nextLine();

        tcdcanner.close();
        double media = (double)(num + num2 + num3) / 3;

        String resultado = String.format("%.1f", media);
        System.out.println("A média dos números é:" + resultado);
    }

}
