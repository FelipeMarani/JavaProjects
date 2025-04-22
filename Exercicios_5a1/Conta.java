
public class Conta {

    private String nome;
    private String ttNome;
    private String agencia;
    private String numero;
    private double saldo;
    private String tpConta;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTtNome() {
        return ttNome;
    }

    public void setTtNome(String ttNome) {
        this.ttNome = ttNome;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    Conta(String nome, String titular, String agencia, String numeroConta, Double saldo, String tpconta) {

        this.nome = nome;
        this.ttNome = titular;
        this.agencia = agencia;
        this.numero = numeroConta;
        this.saldo = saldo;
        this.tpConta = tpconta;

    }

    void depositar(double value) {

        if (value <= 0) {
            System.out.println("Impossível depositar valores menores ou iguais a 0!!");
            System.out.println("Saldo: " + getSaldo() + " R$");
        } else {
            this.saldo += value;
            System.out.println("Deposito realizado com sucesso!!");
            System.out.println("Saldo: " + getSaldo() + " R$");
        }
    }

    void sacar(double value) {
        if (value > this.saldo || value < 0) {
            System.out.println("Impossivel realizar o saque!!");
            System.out.println("Saldo atual: " + getSaldo() + " R$");
        } else {
            this.saldo -= value;
            System.out.println("Saque realizado com sucesso!!");
            System.out.println("Saldo atual: " + getSaldo() + " R$");
        }
    }

    void transferir(double value, Conta contaDestino) {
        if (value <= 0) {
            System.out.println("Valor inválido para transferência!");
        } else if (value > this.saldo) {
            System.out.println("Impossível realizar transferência, saldo insuficiente!!");
            System.out.println("Saldo: " + getSaldo() + " R$");
        } else {
            this.saldo -= value;
            contaDestino.depositar(value);
            System.out.println("Transferência realizada com sucesso!!");
            System.out.println("Seu saldo atual: " + getSaldo() + " R$");
        }
    }
}
