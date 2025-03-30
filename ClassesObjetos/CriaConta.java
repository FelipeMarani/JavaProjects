import java.util.Scanner;

public class CriaConta {

    public static void main(String[] args) {
        Conta nConta = new Conta();
        int id = 1;

        Scanner tcdScanner = new Scanner(System.in);

        System.out.println("Bem vindo ao menu de criação de conta:");

        System.out.print("Deseja criar uma conta? [1]: Sim; [2]: Não  ");
        int cond = tcdScanner.nextInt();
        if (cond == 1) {
            while (cond == 1) {

                nConta.id = id;
                System.out.print("Informe o nome do titular da conta: ");
                String titular = tcdScanner.next();
                System.out.print("Informe seu nome: ");
                String name = tcdScanner.next();
                System.out.print("Informe seu CPF: ");
                String CPF = tcdScanner.next();
                System.out.println("Informe sua data de nascimento, no padrão dd/mm/aa: ");
                String aniversario = tcdScanner.next();
                System.out.print("Informe sua idade: ");
                int idade = tcdScanner.nextInt();
                if (idade < 17) {
                    System.out.println("Apenas maiores de 17 podem estar criando a conta");
                    System.out.println("Operação cancelada!");
                    break;
                } else {
                    int[] agencia = new int[4];

                }

            }

        }
    }
}
