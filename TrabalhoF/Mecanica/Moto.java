package Mecanica;

public class Moto extends Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String potencia;

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

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public Moto(String mc, String mod, int ano, String pt, String cor, String placa, String tpCombustivel,
            String defeito) {

        super(cor, placa, tpCombustivel, defeito);
        this.marca = mc;
        this.modelo = mod;
        this.ano = ano;
        this.potencia = pt;

    }

}
