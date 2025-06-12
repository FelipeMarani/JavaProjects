package Tunning;

//class ResultadoTunning representa o resultado de um processo de tunning de um carro
public class ResultadoTunning {

    private int ptExtra;
    private double zeroToCem;
    private int velocidadeMaxima;

    public int getPtExtra() {
        return ptExtra;
    }

    public void setPtExtra(int ptExtra) {
        this.ptExtra = ptExtra;
    }

    public double getZeroToCem() {
        return zeroToCem;
    }

    public void setZeroToCem(double zeroToCem) {
        this.zeroToCem = zeroToCem;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public ResultadoTunning(int ptExtra, double zeroToCem, int velocidadeMaxima) { // Construtor para inicializar os atributos de ResultadoTunning

        this.ptExtra = ptExtra;
        this.zeroToCem = zeroToCem;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    

}
