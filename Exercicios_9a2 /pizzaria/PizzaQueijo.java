package pizzaria;

public class PizzaQueijo extends Pizza {
    private int qtdFatias;
    private int qtdQueijo;
    private int qtdMolho;
    private int qtdTipoQueijo;
    private double tpPreparo;

    public int getQtdFatias() {
        return qtdFatias;
    }
    public void setQtdFatias(int qtdFatias) {
        this.qtdFatias = qtdFatias;
    }
    public int getQtdQueijo() {
        return qtdQueijo;
    }
    public void setQtdQueijo(int qtdQueijo) {
        this.qtdQueijo = qtdQueijo;
    }
    public int getQtdMolho() {
        return qtdMolho;
    }
    public void setQtdMolho(int qtdMolho) {
        this.qtdMolho = qtdMolho;
    }
    public int getQtdTipoQueijo() {
        return qtdTipoQueijo;
    }
    public void setQtdTipoQueijo(int qtdTipoQueijo) {
        this.qtdTipoQueijo = qtdTipoQueijo;
    }
    public double getTpPreparo() {
        return tpPreparo;
    }
    public void setTpPreparo(double tpPreparo) {
        this.tpPreparo = tpPreparo;
    }

    public PizzaQueijo(){
        super(1, "Queijo", "Média");
        this.qtdFatias = 8;
        this.qtdQueijo = 700;
        this.qtdMolho = 200;
        this.qtdTipoQueijo = 4;
        this.tpPreparo = 35;
        setValor(43.00);
        setSabor("Queijos");

    }

    public PizzaQueijo(int qtd, String sabor, String tamanho, int qtdFatias, int qtdQueijo, int qtdMolho, int qtdTipoQueijo, double tpPreparo){
        super(qtd, sabor, tamanho);
        this.qtdFatias = qtdFatias;
        this.qtdQueijo = qtdQueijo;
        this.qtdMolho = qtdMolho;
        this.qtdTipoQueijo = qtdTipoQueijo;
        this.tpPreparo = 35;
        setValor(43.00);
        setSabor("Queijos");

    }
    @Override
    public String preparar() {

        double tpPreparo = 35;
        double valor = 43;

        if (getTamanho().equals("Pequena")) {
            tpPreparo = 25;
            valor = 36.00;
        } else if (getTamanho().equals("Grande")) {
            tpPreparo = 45;
            valor = 49.00;
            
        }

        if (getQtd() > 1) {
            double prcTotal = valor * getQtd();
            setValor(prcTotal);
        }
        if (qtdFatias > 8 || qtdQueijo > 700 || qtdMolho > 200 || qtdTipoQueijo > 4) {

            System.out.println("Quantidade de ingredientes superior ao padrão para Pizza Queijo.");
            System.out.println("Isso aumentará o tempo de preparo e preço da pizza.");
            System.out.println("Tempo de preparo padrão: " + tpPreparo + " minutos.\n" +
                    "Valor padrão: " + getValor() + " reais.");
            if (qtdFatias > 8) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            } else if (qtdQueijo > 200) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            } else if (qtdMolho > 200) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            } else if (qtdTipoQueijo > 15) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            }
            System.out.println("Novo tempo de preparo: " + tpPreparo + " minutos.");
            System.out.println("Novo valor: " + getValor() + " reais.");
        } else {
            System.out.println("Quantidade de ingredientes dentro do padrão para Pizza Marguerita.");
            System.out.println("Tempo de preparo padrão: " + tpPreparo + " minutos.");

        }
            

        return "Pizza Queijo: " + getSabor() + "\n" +
                "Tamanho: " + getTamanho() + "\n" +
                "Quantidade de fatias: " + qtdFatias + "\n" +
                "Quantidade de queijo: " + qtdQueijo + "\n" +
                "Quantidade de molho: " + qtdMolho + "\n" +
                "Quantidade de tipos de queijo: " + qtdTipoQueijo + "\n" +
                "Tempo de preparo: " + tpPreparo + " minutos.\n" +
                "Valor total: R$" + getValor() +"\n";

    }

    
}
