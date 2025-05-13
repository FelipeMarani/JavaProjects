package Pizzaria;

public class SaborCalabresa extends Pizza {

    private int qtdFatias;
    private String tamanho;
    private int qtdCalabresa;
    private int qtdMolho;
    private int qtdQueijo;
    private double tpPreparo;

    public int getQtdFatias() {
        return qtdFatias;
    }

    public void setQtdFatias(int qtdFatias) {
        this.qtdFatias = qtdFatias;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtdCalabresa() {
        return qtdCalabresa;
    }

    public void setQtdCalabresa(int qtdCalabresa) {
        this.qtdCalabresa = qtdCalabresa;
    }

    public int getQtdMolho() {
        return qtdMolho;
    }

    public void setQtdMolho(int qtdMolho) {
        this.qtdMolho = qtdMolho;
    }

    public int getQtdQueijo() {
        return qtdQueijo;
    }

    public void setQtdQueijo(int qtdQueijo) {
        this.qtdQueijo = qtdQueijo;
    }

    public double getTpPreparo() {
        return tpPreparo;
    }

    public void setTpPreparo(double tpPreparo) {
        this.tpPreparo = tpPreparo;
    }
    public SaborCalabresa(int qtd, String sabor, double valor, String tamanho, int qtdCalabresa, int qtdMolho, int qtdQueijo, double tpPreparo){
        super(qtd, sabor, valor, tamanho);
        
    }

    @Override
    public String preparar() {
        return "Pizza de Calabresa: \n"
                + "Quantidade: " + getQtd() + "\n"
                + "Valor: " + getValor() + "\n"
                + "Tamanho: " + getTamanho() + "\n"
                + "Quantidade de Calabresa: " + getQtdCalabresa() + "\n"
                + "Quantidade de Molho: " + getQtdMolho() + "\n"
                + "Quantidade de Queijo: " + getQtdQueijo() + "\n"
                + "Tempo de Preparo: " + getTpPreparo() + "\n";
    }

}
