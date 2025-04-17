import java.util.Scanner;

public class AlturaJava {

    public static void main(String[] args) {
        Scanner tcdscanner = new Scanner(System.in);

        System.out.print("Digite seu nome:");
        String name = tcdscanner.nextLine();

        tcdscanner.nextLine();
        System.out.print("Digite sua altura em metros:");
        double height = tcdscanner.nextDouble();
        tcdscanner.nextLine();
        tcdscanner.nextLine();

        System.out.print("Digite sua idade:");
        int age = tcdscanner.nextInt();
        tcdscanner.nextLine();

        tcdscanner.close();

        System.out.println("Nome: " + name + "\nAltura: "+ height+ "m"+"\nIdade: "+ age);
    }

}
