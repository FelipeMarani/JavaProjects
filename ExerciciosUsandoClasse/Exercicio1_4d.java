import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio1_4d {

    enum TipoConta {
        Corrente(1, "Conta Corrente"),
        Poupanca(2, "Conta Poupanca"),
        Portabil(3, "Conta Para Portabilidade"),
        Investimento(4, "Carteira de Investimentos"),
        Universitaria(5, "Conta Universitaria");

        private final int codigo;

        private final String Descricao;

        private static final Map<Integer, TipoConta> map = new HashMap<>();

        static {
            for (TipoConta tipo : TipoConta.values()) {
                map.put(tipo.getCodigo(), tipo);

            }
        }

        TipoConta(int codigo, String descricao) {
            this.codigo = codigo;
            this.Descricao = descricao;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescricao() {
            return Descricao;
        }

        public static TipoConta fromCodigo(int codigo) {
            return map.get(codigo);
        }
    }

    public static void main(String[] args) {

        Scanner tcdScanner = new Scanner(System.in);

        Conta conta01 = new Conta();
        conta01.id = 0001;
        conta01.name = "Felipe";
        conta01.idade = 20;
        conta01.Titular = "Felipe Jesus da Silva";
        conta01.birthday = "23/04/2005";
        conta01.cpf = "493.488.888-89";
        conta01.type = TipoConta.Corrente;

        System.out.println("Conta criada com sucesso!!\n");
        System.out.println("Nome do titular: \n" + conta01.Titular);
        System.out.println("Tipo de conta: \n"+ conta01.type.getDescricao());

        System.out.print("Deseja realizar o primeiro depósito?: [1]Sim, [2] Não");
        int option = tcdScanner.nextInt();
        if (option == 1) {
            System.out.print("Quanto deseja depositar?: ");
            double dep = tcdScanner.nextDouble();
            conta01.saldo = dep;
        }
        else{
            System.out.println("Ok, obrigado por acessar o nosso banco!");
        }

    }

}
