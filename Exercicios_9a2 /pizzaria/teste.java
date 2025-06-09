package pizzaria;

import java.util.Scanner;

public class teste {

    static Pizza[] pizzas = new Pizza[5];

    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual tipo de pizza você deseja?");
            System.out.println("1 - Calabresa");
            System.out.println("2 - 4 Queijos");
            System.out.println("3 - Margherita");
            System.out.print("Opção: ");
            int op = tcdScanner.nextInt();
            tcdScanner.nextLine();
            if (op == 1) {
                System.out.println("Digite o tamanho da Pizza (Pequena, Média ou Grande):");
                String tmPizza = tcdScanner.next();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de pizzas:");
                int qtdPizza = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de fatias:");
                int qtdFatias = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de calabresa em gramas:");
                int qtdCalabresa = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de molho em gramas:");
                int qtdMolho = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de queijo em gramas:");
                int qtdQueijo = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de cebola em gramas:");
                int qtdCebola = tcdScanner.nextInt();
                tcdScanner.nextLine();
                PizzaCalabresa pizzaCalabresa = new PizzaCalabresa(qtdPizza, "Calabresa", tmPizza, qtdFatias,
                        qtdCalabresa, qtdMolho, qtdQueijo, qtdCebola, 30);
                pizzas[i] = pizzaCalabresa;
                System.out.println("Pizza em preparo: " + pizzaCalabresa.getSabor());
            } else if (op == 2) {
                System.out.println("Digite o tamanho da Pizza (Pequena, Média ou Grande):");
                String tmPizza = tcdScanner.next();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de pizzas:");
                int qtdPizza = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de fatias:");
                int qtdFatias = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de queijo em gramas:");
                int qtdQueijo = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de molho em gramas:");
                int qtdMolho = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite quantos tipos de queijo deseja:");
                int qtdTpQueijo = tcdScanner.nextInt();
                tcdScanner.nextLine();
                PizzaQueijo pizzaQueijo = new PizzaQueijo(qtdPizza, "Queijo", tmPizza, qtdFatias,
                        qtdQueijo, qtdMolho, qtdTpQueijo, 35);
                pizzas[i] = pizzaQueijo;
                System.out.println("Pizza em preparo: " + pizzaQueijo.getSabor());

            } else if (op == 3) {
                System.out.println("Digite o tamanho da Pizza (Pequena, Média ou Grande):");
                String tmPizza = tcdScanner.next();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de pizzas:");
                int qtdPizza = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de fatias:");
                int qtdFatias = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de queijo em gramas:");
                int qtdQueijo = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de molho em gramas:");
                int qtdMolho = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de tomate que deseja:");
                int qtdTomate = tcdScanner.nextInt();
                tcdScanner.nextLine();
                System.out.println("Digite a quantidade de manjericão que deseja:");
                int qtdManjericao = tcdScanner.nextInt();
                tcdScanner.nextLine();
                PizzaMarguerita pizzaMarguerita = new PizzaMarguerita(qtdPizza, "Marguerita", tmPizza, qtdFatias,
                        qtdQueijo, qtdMolho, qtdTomate, qtdManjericao);
                pizzas[i] = pizzaMarguerita;
                System.out.println("Pizza em preparo: " + pizzaMarguerita.getSabor());

            } else {
                System.out.println("Opção inválida. Tente novamente.");
                i--;
                continue;
            }

        }

        for(int i = 0; i < 5; i++){
          String descrição = pizzas[i].preparar();
          System.out.println(descrição);
        }

        tcdScanner.close();

    }
}
