
public class Conta {

    String nome;
    String ttNome;
    String agencia;
    String numero;
    double saldo;
    String tpConta;

    void depositar(double value) {

        if (value <= 0) {

            System.out.println("Impossível depositar valores menores ou iguais a 0.");
        } else {
            saldo += value;
            System.out.println("Deposito efetuado com sucesso!!");
            System.out.println("Saldo atual: " + saldo);
        }

    }

    void sacar(double value) {

        if (value > saldo) {

            System.out.println("Impossivel sacar!! Valor em conta insulficiente.");
            System.out.println("Saldo atual: " + saldo);
        } else {
            saldo -= value;
            System.out.println("Saque realizado com sucesso!!");
            System.out.println("Saldo atual: " + saldo);
        }

    }

    void transferir(double value, Conta contaDestino) {
        if (value <= 0) {
            System.out.println("Valor inválido para transferência!");
        } else if (value > this.saldo) {
            System.out.println("Impossível realizar transferência, saldo insuficiente!!");
            System.out.println("Saldo: " + saldo + " R$");
        } else {
            this.saldo -= value;
            contaDestino.depositar(value);
            System.out.println("Transferência realizada com sucesso!!");
            System.out.println("Seu saldo atual: " + saldo + " R$");
        }
    }
}
