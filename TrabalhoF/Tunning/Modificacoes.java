package Tunning;

abstract class Modificacoes {

    private int tipoBodyKit;
    private int tipoRodas;
    private int tamanhoRodas;
    private int tipoFunilaria;
    private int tipoTunning;
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

    public Modificacoes(int tipoBodyKit, int tipoRodas, int tamanhoRodas, int tipoFunilaria, int tipoTunning,
            double custoModificacao) {

        this.tipoBodyKit = tipoBodyKit;
        this.tipoRodas = tipoRodas;
        this.tamanhoRodas = tamanhoRodas;
        this.tipoFunilaria = tipoFunilaria;
        this.tipoTunning = tipoTunning;
        this.custoModificacao = custoModificacao;
    }

    public ResultadoTunning modificar() {

        double valor = 0;
        int ptExtra = 0;
        double zeroToCem = 0;
        int velocidadeMaxima = 0;
        String stRoda = "Roda Original";
        String stBodykit;
        String stFunilaria;
        String stTunning;

        if (getTipoRodas() == 1) {
            zeroToCem -= 0.5;
            velocidadeMaxima += 5;
            ptExtra += 10;
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
            }
        } else if (getTipoRodas() == 2) {
            zeroToCem += 0.5;
            velocidadeMaxima += 10;
            ptExtra += 10;
            stRoda = "Roda Forjada";
            if (getTamanhoRodas() >= 20 && getTamanhoRodas() <= 24) {
                valor = 40263;
                setCustoModificacao(valor);
            } else {
                System.out.println("Tamanho de rodas não definido ou inválido.");
                stRoda = "Roda Original";
            }
        }

        switch (getTipoBodyKit()) {
            case 1:
                stBodykit = "Body Kit Esportivo";
                valor += 15562;
                zeroToCem += 1.5;
                setCustoModificacao(valor);
                break;
            case 2:
                stBodykit = "Body Kit Agressivo";
                valor += 23343;
                zeroToCem += 0.9;
                setCustoModificacao(valor);
                break;
            case 3:
                stBodykit = "Body Kit Elegante";
                valor += 18674.4;
                zeroToCem += 0.4;
                setCustoModificacao(valor);
                break;
            case 4:
                stBodykit = "Body Kit Retro";
                valor += 21786.8;
                zeroToCem += 0.7;
                setCustoModificacao(valor);
                break;
            case 51:
                stBodykit = "Body kit Off Road";
                valor += 35000;
                zeroToCem += 2.0;
                setCustoModificacao(valor);
                break;
            default:
                throw new AssertionError();
        }

        switch (getTipoFunilaria()) {
            case 1:
                stFunilaria = "Funilaria padrão";
                valor += 3500;
                setCustoModificacao(valor);
                break;
            case 2:
                stFunilaria = "Funilaria Esportiva";
                valor += 3850;
                setCustoModificacao(valor);
                break;
            case 3:
                stFunilaria = "Funilaria classica";
                valor += 4620;
                setCustoModificacao(valor);
                break;
            case 4:
                stFunilaria = "Funilaria personalizada";
                valor += 6930;
                setCustoModificacao(valor);
                break;
            default:
                throw new AssertionError();
        }

        if (getTipoTunning() == 1) {
            stTunning = "Tunning type 1";
            valor += 9563.75;
            ptExtra += 90;
            setCustoModificacao(valor);
        } else if (getTipoTunning() == 2) {
            stTunning = "Tunning type 2";
            valor += 14345.62;
            ptExtra += 130;
            setCustoModificacao(valor);
        } else if (getTipoTunning() == 3) {
            stTunning = "Tunning type 3";
            valor += 27787.70;
            ptExtra += 250;
            setCustoModificacao(valor);
        } else if (getTipoTunning() == 4) {
            stTunning = "Tunning Advanced";
            valor += 51787.78;
            ptExtra += 500;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 4 && getTipoTunning() == 4) {
            stTunning = "Tunning Retro";
            valor += 17214.75;
            ptExtra += 155;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 51 && getTipoTunning() == 5) {
            stTunning = "Tunning Off Road type 1";
            valor += 15302;
            ptExtra += 220;
            setCustoModificacao(valor);
        } else if (getTipoBodyKit() == 51 && getTipoTunning() == 6) {
            stTunning = "Tunning Off Road type 2";
            valor += 18362;
            ptExtra += 310;
            setCustoModificacao(valor);
        } else {
            stTunning = "Tipo de Tunning não definido ou inválido.";
            System.out.println("Tipo de Tunning não definido ou inválido.");
        }
        setCustoModificacao(valor);

        return new ResultadoTunning(ptExtra, zeroToCem, velocidadeMaxima);

    }
}
