package Tunning;

abstract class Modificacoes {

    private int tipoBodyKit;
    private int tipoRodas;
    private int tamanhoRodas;
    private int tipoFunilaria;
    private int tipoTunning;
    private double tipoRetrokit;
    private int tipoOffRoadkit;
    private double custoModificacao;

    public int getTipoBodyKit() {
        return tipoBodyKit;
    }

    public void setTipoBodyKit(int tipoBodyKit) {
        this.tipoBodyKit = tipoBodyKit;
    }

    public int getTipoRodas() {
        return tipoRodas;
    }

    public void setTipoRodas(int tipoRodas) {
        this.tipoRodas = tipoRodas;
    }

    public int getTipoFunilaria() {
        return tipoFunilaria;
    }

    public void setTipoFunilaria(int tipoFunilaria) {
        this.tipoFunilaria = tipoFunilaria;
    }

    public int getTipoTunning() {
        return tipoTunning;
    }

    public void setTipoTunning(int tipoTunning) {
        this.tipoTunning = tipoTunning;
    }

    public double getTipoRetrokit() {
        return tipoRetrokit;
    }

    public void setTipoRetrokit(double tipoRetrokit) {
        this.tipoRetrokit = tipoRetrokit;
    }

    public int getTipoOffRoadkit() {
        return tipoOffRoadkit;
    }

    public void setTipoOffRoadkit(int tipoOffRoadkit) {
        this.tipoOffRoadkit = tipoOffRoadkit;
    }

    public double getCustoModificacao() {
        return custoModificacao;
    }

    public void setCustoModificacao(double custoModificacao) {
        this.custoModificacao = custoModificacao;
    }

    public int getTamanhoRodas() {
        return tamanhoRodas;
    }

    public void setTamanhoRodas(int tamanhoRodas) {
        this.tamanhoRodas = tamanhoRodas;
    }

    public Modificacoes(int tamanhoRodas) {
        this.tamanhoRodas = tamanhoRodas;
    }

    abstract String modificar();

    public Modificacoes(int tipoBodyKit, int tipoRodas, int tamanhoRodas, int tipoFunilaria, int tipoTunning,
            double tipoRetrokit,
            int tipoOffRoadkit, double custoModificacao) {

        this.tipoBodyKit = tipoBodyKit;
        this.tipoRodas = tipoRodas;
        this.tamanhoRodas = tamanhoRodas;
        this.tipoFunilaria = tipoFunilaria;
        this.tipoTunning = tipoTunning;
        this.tipoRetrokit = tipoRetrokit;
        this.tipoOffRoadkit = tipoOffRoadkit;
        this.custoModificacao = custoModificacao;
    }

}
