package Tunning;

public class Carro extends Modificacoes {

    private Cliente dono;
    private String marca;
    private String modelo;
    private int ano;
    private int potencia;
    private int velocidadeMaxima;
    private double zeroToCem;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getZeroToCem() {
        return zeroToCem;
    }

    public void setZeroToCem(double zeroToCem) {
        this.zeroToCem = zeroToCem;
    }

    public Cliente getDono() {
        return dono;
    }

    public void setDono(Cliente dono) {
        this.dono = dono;
    }

    public Carro(Cliente dono, String mc, String mod, int ano, int pt, int tpBodyKt, int tpRodas, int tpTmRodas,
            int tpFunilaria,
            int tpTunning, double custoModificacao) {

        super(tpBodyKt, tpRodas, tpTmRodas, tpFunilaria, tpTunning, custoModificacao);
        this.marca = mc;
        this.modelo = mod;
        this.ano = ano;
        this.potencia = pt;
        this.dono = dono;
    }

    public void ResultadoTunning() {

        ResultadoTunning result = modificar();
        int velocidadeMaximaF = 0;
        this.potencia += result.getPtExtra();
        this.zeroToCem -= result.getZeroToCem();
        int ptTotal = this.potencia;
        if(getZeroToCem() < 1.89 ){
            this.zeroToCem = 1.89; // Valor mínimo para zeroToCem
        }
        if (ptTotal <= 450) {
            velocidadeMaximaF = (int) (ptTotal * 0.25);
            if (velocidadeMaximaF > 400) {
                velocidadeMaximaF = 399;
            }
        } else if (ptTotal >= 450) {
            velocidadeMaximaF = (int) (ptTotal * 0.15);
            if (velocidadeMaximaF > 400) {
                velocidadeMaximaF = 399;
            }
        }
        this.velocidadeMaxima += velocidadeMaximaF + result.getVelocidadeMaxima();

        System.out.println("Cliente: " + this.getDono().getNome());
        System.out.println("CPF: " + this.getDono().getCpf());
        System.out.println("Telefone: " + this.getDono().getTelefone());
        System.out.println("Email: " + this.getDono().getEmail());

        System.out.println("Resultado da Modificação:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Potência: " + this.potencia + " cv");
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
        System.out.println("Aceleração 0 a 100: " + this.zeroToCem + " segundos");
        System.out.println("Body Kit: " + getTipoBodyKit());
        System.out.println("Rodas: " + getTipoRodas());
        System.out.println("Tamanho das Rodas: " + getTamanhoRodas() + " polegadas");
        System.out.println("Funilaria: " + getTipoFunilaria());
        System.out.println("Tunning: " + getTipoTunning());
        System.out.println("Custo da Modificação: R$ " + getCustoModificacao());

    }

}
