class Conta {

    int id;
    String name;
    int idade;
    String Titular;
    String birthday;
    String cpf;
    double saldo;
    Exercicio1_4d.TipoConta type;

    void depositar(double dep) {

        if (dep > 0) {

            this.saldo = this.saldo + dep;
            System.out.println("Depósito realizado com sucesso!!");
            System.out.printf("Saldo atual: %f", this.saldo);
        } else {
            System.out.println("Não é possível depositar valores menores que 0");
        }
    }
    void sacar(double saque){

        if (saque > this.saldo) {
            System.out.println("Não é possível realizar o saque, saldo insuficiente!!");
            System.out.printf("Saldo: R$ %f", this.saldo);
        }
        else{
            this.saldo = this.saldo - saque;
            System.out.println("Saque efetuado com sucesso!!");
            System.out.printf("Saldo atual: R$ %f", this.saldo);
        }

    }

}
