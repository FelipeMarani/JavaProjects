package Tunning;

public class Carro extends Modificacoes {

    private String marca;
    private String modelo;
    private int ano;
    private int potencia;

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

    public Carro(String mc, String mod, int ano, int pt, int tpBodyKt, int tpRodas, int tpTmRodas, int tpFunilaria,
            int tpTunning, double tpRtKit, int tpOffR, double custoModificacao) {

        super(tpBodyKt, tpRodas, tpTmRodas, tpFunilaria, tpTunning, tpRtKit, tpOffR, custoModificacao);
        this.marca = mc;
        this.modelo = mod;
        this.ano = ano;
        this.potencia = pt;
    }

    @Override
    public String modificar() {

        double valor = 0;
        String stRoda = "Roda Original";
        String stBodykit;
        String stFunilaria;
        String stTunning;

        if (getTipoRodas() == 1) {
            stRoda = "Rodas de liga leve";
            if (getTamanhoRodas() <= 16) {
                valor = 2781;
                setCustoModificacao(valor);
            } else if (getTamanhoRodas() > 16 && getTamanhoRodas() <= 20) {
                valor = 8949;
                setCustoModificacao(valor);
            } else if (getTamanhoRodas() > 20 && getTamanhoRodas() <= 24) {
                valor = 9358.5;
                setCustoModificacao(valor);
            } else {
                System.out.println("Tamanho de rodas não definido ou inválido.");
                stRoda = "Roda Original";
                return "Tamanho de rodas não definido ou inválido.";
            }
        } else if (getTipoRodas() == 2) {
            stRoda = "Roda Forjada";
            if (getTamanhoRodas() >= 20 && getTamanhoRodas() <= 24) {
                valor = 40263;
                setCustoModificacao(valor);
            } else {
                System.out.println("Tamanho de rodas não definido ou inválido.");
                stRoda = "Roda Original";
                return "Tamanho de rodas não definido ou inválido.";
            }
        }

        if (getTipoBodyKit() == 1) {
            stBodykit = "Body Kit Esportivo";
            valor += 15562;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 2) {
            stBodykit = "Body Kit Agressivo";
            valor += 23343;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 3) {
            stBodykit = "Body Kit Elegante";
            valor += 18674.4;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 4) {
            stBodykit = "Body Kit Retro";
            valor += 21786.8;
            setCustoModificacao(valor);
        } else {
            System.out.println("Tipo de Body Kit não definido ou inválido.");
            return "Tipo de Body Kit não definido ou inválido.";
        }

        if (getTipoFunilaria() == 1) {
            stFunilaria = "Funilaria padrão";
            valor += 3500;
            setCustoModificacao(valor);
        } else if (getTipoFunilaria() == 2) {
            stFunilaria = "Funilaria Esportiva";
            valor += 3850;
            setCustoModificacao(valor);
        } else if (getTipoFunilaria() == 3) {
            stFunilaria = "Funilaria classica";
            valor += 4620;
            setCustoModificacao(valor);
        } else if (getTipoFunilaria() == 4) {
            stFunilaria = "Funilaria personalizada";
            valor += 6930;
            setCustoModificacao(valor);
        } else {
            System.out.println("Tipo de Funilaria não definido ou inválido.");
            return "Tipo de Funilaria não definido ou inválido.";
        }

        String modificacao = "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano + "\n" +
                "Potência: " + potencia + "\n" +
                "Tipo Body Kit: " + stBodykit + "\n" +
                "Tipo Rodas: " + stRoda + "\n" +
                "Tamanho Rodas: " + getTamanhoRodas() + "\n" +
                "Tipo Funilaria: " + stFunilaria + "\n" +
                "Tipo Tunning: " + getTipoTunning() + "\n" +
                "Retrofit Kit: " + getTipoRetrokit() + "\n" +
                "Off Road Kit: " + getTipoOffRoadkit() + "\n" +
                "Custo da Modificação: R$" + getCustoModificacao();

        return modificacao;

    }

}
