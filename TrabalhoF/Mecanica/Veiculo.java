package Mecanica;

public abstract class Veiculo {

    private String cor;
    private String placa;
    private String tipoCombustivel;
    private String defeito;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getDefeito() {
        return defeito;
    }

    public void setDefeito(String defeito) {
        this.defeito = defeito;
    }

    public Veiculo(String cor, String placa, String tpCombustivel, String defeito) {

        this.cor = cor;
        this.placa = placa;
        this.tipoCombustivel = tpCombustivel;
        this.defeito = defeito;
    }

}
