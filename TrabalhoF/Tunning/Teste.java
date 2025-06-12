package Tunning;

import java.util.Scanner;

public class Teste {

    // Arrays para armazenar os carros e clientes
    static Carro[] carros = new Carro[5];
    static Cliente[] clientes = new Cliente[5];

    public static void main(String[] args) {
        Scanner tcdScanner = new Scanner(System.in);

        // Inicialização do loop para cadastro de 5 clientes e seus respectivos carros
        for (int i = 0; i < 5; i++) {
            try { // Início do bloco try para capturar exceções
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
                int ano = 0;
                while (true) {
                    try {
                        System.out.print("Digite o ano do carro: ");
                        ano = Integer.parseInt(tcdScanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um ano válido (número inteiro)!");
                    }
                }
                int pt = 0;
                while (true) {
                    try {
                        System.out.print("Digite a potencia do carro: ");
                        pt = Integer.parseInt(tcdScanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um valor numérico para a potência!");
                    }
                }
                int vm = 0;
                while (true) {
                    try {
                        System.out.print("Digite a velocidade máxima do carro: ");
                        vm = Integer.parseInt(tcdScanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um valor numérico para a velocidade!");
                    }
                }
                double ztc = 0;
                while (true) {
                    try {
                        System.out.print("Digite o tempo de 0 a 100 do carro: ");
                        ztc = Double.parseDouble(tcdScanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Por favor, digite um valor numérico (ex: 5.2) para o 0-100!");
                    }
                }
                
                // Modificações do Carro
                System.out.println("\n--- Modificações do Carro " + (i + 1) + " ---");
                int tpKit = 0;
                while (true) {
                    try {
                        System.out.println("Escolha o tipo de Body Kit:");
                        System.out.println("1 - Body Kit Esportivo");
                        System.out.println("2 - Body Kit Agressivo");
                        System.out.println("3 - Body Kit Elegante");
                        System.out.println("4 - Body Kit Reto");
                        System.out.println("51 - Body Kit Off Road");
                        tpKit = Integer.parseInt(tcdScanner.nextLine());
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Digite o número correspondente.");
                    }
                }
                int tpRodas = 0;
                while (true) {
                    try {
                        System.out.println("Escolha o tipo de Rodas:");
                        System.out.println("1 - Rodas de liga leve");
                        System.out.println("2 - Rodas Forjadas");
                        tpRodas = Integer.parseInt(tcdScanner.nextLine());
                        if (tpRodas < 1 || tpRodas > 2) {
                            System.out.println("Opção inválida! Digite 1 ou 2.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Digite 1 ou 2.");
                    }
                }
                int tpTmRodas = 0;
                while (true) {
                    try {
                        System.out.print("Escolha o tamanho das Rodas, entre 16~24: ");
                        tpTmRodas = Integer.parseInt(tcdScanner.nextLine());
                        if (tpTmRodas < 16 || tpTmRodas > 24) {
                            System.out.println("Tamanho inválido! Digite entre 16 e 24.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido! Digite um número entre 16 e 24.");
                    }
                }
                int tpFunilaria = 0;
                while (true) {
                    try {
                        System.out.println("Escolha o tipo de Funilaria:");
                        System.out.println("1 - Funilaria Padrão");
                        System.out.println("2 - Funilaria Esportiva");
                        System.out.println("3 - Funilaria Classica");
                        System.out.println("4 - Funilaria Personalizada");
                        tpFunilaria = Integer.parseInt(tcdScanner.nextLine());
                        if (tpFunilaria < 1 || tpFunilaria > 4) {
                            System.out.println("Opção inválida! Digite entre 1 e 4.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Digite um número entre 1 e 4.");
                    }
                }
                int tpTunning = 0;
                while (true) {
                    try {
                        System.out.println("Escolha o tipo de Tunning: ");
                        System.out.println("1 - Tunning Type 1");
                        System.out.println("2 - Tunning Type 2");
                        System.out.println("3 - Tunning Type 3");
                        System.out.println("4 - Tunning Advanced");
                        System.out.println("5 - Tunning Retro");
                        System.out.println("6 - Tunning Off Road");
                        tpTunning = Integer.parseInt(tcdScanner.nextLine());
                        if (tpTunning < 1 || tpTunning > 6) {
                            System.out.println("Opção inválida! Digite entre 1 e 6.");
                            continue;
                        }
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Opção inválida! Digite um número entre 1 e 6.");
                    }
                }
                carros[i] = new Carro(clientes[i], mc, md, ano, pt, tpKit, tpRodas, tpTmRodas, tpFunilaria, tpTunning,
                        0.0);
                carros[i].setVelocidadeMaxima(vm);
                carros[i].setZeroToCem(ztc);
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                i--; // Repete a iteração atual
                continue;
            }
        }

        // Exibir resultados de tunning
        for (int i = 0; i < 5; i++) {
            System.out.println("\n--- Resultado do Tunning do Carro " + (i + 1) + " ---");
            carros[i].ResultadoTunning();
            System.out.println("---------------------------------------------------");
        }
        tcdScanner.close();
    }
}
