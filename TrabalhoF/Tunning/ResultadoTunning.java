/** Classe ResultadoTunning representa o resultado de um processo de tunning de um carro  
 * 
 * @author Felipe Jesus
 * @version 1.0
 * 
 * **/

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

    /*
     * Construtor para inicializar os atributos de ResultadoTunning
     * @param ResultadoTunning definição dos atributos de potencia extra, tempo de 0 a 100 km/h e velocidade máxima
     */

    public ResultadoTunning(int ptExtra, double zeroToCem, int velocidadeMaxima) { // Construtor para inicializar os atributos de ResultadoTunning

        this.ptExtra = ptExtra;
        this.zeroToCem = zeroToCem;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    

}
