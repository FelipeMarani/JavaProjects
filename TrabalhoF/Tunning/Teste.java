package Tunning;

import java.util.Scanner;

public class Teste {

    static Carro[] carros = new Carro[10];
    static Cliente[] clientes = new Cliente[10];

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            // Cadastro do Cliente
            System.out.println("\n--- Cadastro do Cliente " + (i + 1) + " ---");
            System.out.print("Digite o nome do cliente: ");
            String nome = tcdScanner.nextLine();
            
            System.out.print("Digite o CPF do cliente: ");
            String cpf = tcdScanner.nextLine();
            
            System.out.print("Digite o telefone do cliente: ");
            String telefone = tcdScanner.nextLine();
            
            System.out.print("Digite o email do cliente: ");
            String email = tcdScanner.nextLine();
            
            clientes[i] = new Cliente(nome, cpf, telefone, email);

            // Cadastro do Carro
            System.out.println("\n--- Cadastro do Carro " + (i + 1) + " ---");
            System.out.println("Cliente: " + clientes[i].getNome());
            
            System.out.print("Digite a marca do carro: ");
            String mc = tcdScanner.nextLine();
            
            System.out.print("Digite o modelo do carro: ");
            String md = tcdScanner.nextLine();
            
            System.out.print("Digite o ano do carro: ");
            int ano = Integer.parseInt(tcdScanner.nextLine());
            
            System.out.print("Digite a potencia do carro: ");
            int pt = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.print("Digite a velocidade máxima do carro: ");
            int vm = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.print("Digite o tempo de 0 a 100 do carro: ");
            double ztc = Double.parseDouble(tcdScanner.nextLine()); // Alterado para nextLine()

            // Modificações do Carro
            System.out.println("\n--- Modificações do Carro " + (i + 1) + " ---");
            System.out.println("Escolha o tipo de Body Kit:");
            System.out.println("1 - Body Kit Esportivo");
            System.out.println("2 - Body Kit Agressivo");
            System.out.println("3 - Body Kit Elegante");
            System.out.println("4 - Body Kit Reto");
            System.out.println("51 - Body Kit Off Road");
            int tpKit = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.println("Escolha o tipo de Rodas:");
            System.out.println("1 - Rodas de liga leve");
            System.out.println("2 - Rodas Forjadas");
            int tpRodas = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.print("Escolha o tamanho das Rodas, entre 16~24: ");
            int tpTmRodas = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.println("Escolha o tipo de Funilaria:");
            System.out.println("1 - Funilaria Padrão");
            System.out.println("2 - Funilaria Esportiva");
            System.out.println("3 - Funilaria Classica");
            System.out.println("4 - Funilaria Personalizada");
            int tpFunilaria = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()
            
            System.out.println("Escolha o tipo de Tunning: ");
            System.out.println("1 - Tunning Type 1");
            System.out.println("2 - Tunning Type 2");
            System.out.println("3 - Tunning Type 3");
            System.out.println("4 - Tunning Advanced");
            System.out.println("5 - Tunning Retro");
            System.out.println("6 - Tunning Off Road");
            int tpTunning = Integer.parseInt(tcdScanner.nextLine()); // Alterado para nextLine()

            carros[i] = new Carro(clientes[i], mc, md, ano, pt, tpKit, tpRodas, tpTmRodas, tpFunilaria, tpTunning, 0.0);
            carros[i].setVelocidadeMaxima(vm);
            carros[i].setZeroToCem(ztc);
        }

        // Exibir resultados de tunning
        for (int i = 0; i < 10; i++) {
            System.out.println("\n--- Resultado do Tunning do Carro " + (i + 1) + " ---");
            carros[i].ResultadoTunning();
            System.out.println("---------------------------------------------------");
        }
        tcdScanner.close();
    }
}
