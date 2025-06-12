/* 
 * Definição da classe Carro
 * * @author Felipe Jesus
 * @version 1.0
 */

package Tunning;

// Classe Carro representa um carro que pode ser modificado
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

    /*
     * Construtor para inicializar os atributos de Carro
     * @param Carro onde são definidos os atributos de dono, marca, modelo, ano, potência, velocidade máxima e aceleração de 0 a 100 km/h
     */

    // Construtor da classe Carro
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
    /*
     * Metodo para modificar o carro e retornar o resultado do tunning
     * @return ResultadoTunning onde são definidos os atributos de potencia extra, tempo de 0 a 100 km/h e velocidade máxima
     */
    // Método para modificar o carro e exibir o resultado do tunning
    public void ResultadoTunning() {

        ResultadoTunning result = modificar();
        int velocidadeMaximaF = 0;
        this.potencia += result.getPtExtra();
        this.zeroToCem -= result.getZeroToCem();
        int ptTotal = this.potencia;
        if(getZeroToCem() < 1.89 ){// Se o zeroToCem for menor que 1.89, ajusta para 1.89
            this.zeroToCem = 1.89; // Valor mínimo para zeroToCem
        }
        if (ptTotal <= 450) {// Se a potência total for menor ou igual a 450
            velocidadeMaximaF = (int) (ptTotal * 0.25);
        } else if (ptTotal >= 450) {
            velocidadeMaximaF = (int) (ptTotal * 0.15);
        }
        this.velocidadeMaxima += velocidadeMaximaF + result.getVelocidadeMaxima();
        if (this.velocidadeMaxima > 400) {
            this.velocidadeMaxima = 399; // Limita a velocidade máxima a 399 km/h
        }

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
