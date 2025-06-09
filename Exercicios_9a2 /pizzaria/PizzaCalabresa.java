package pizzaria;

public class PizzaCalabresa extends Pizza {

    private int qtdFatias;
    private int qtdCalabresa;
    private int qtdMolho;
    private int qtdQueijo;
    private int qtdCebola;
    private double tpPreparo;

    public int getQtdFatias() {
        return qtdFatias;
    }

    public void setQtdFatias(int qtdFatias) {
        this.qtdFatias = qtdFatias;
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

    public int getQtdCebola() {
        return qtdCebola;
    }

    public void setQtdCebola(int qtdCebola) {
        this.qtdCebola = qtdCebola;
    }

    public double getTpPreparo() {
        return tpPreparo;
    }

    public void setTpPreparo(double tpPreparo) {
        this.tpPreparo = tpPreparo;
    }

    public PizzaCalabresa() {
        super(1, "Calabresa", "Média");
        this.qtdFatias = 8;
        this.qtdCalabresa = 600;
        this.qtdMolho = 200;
        this.qtdQueijo = 200;
        this.qtdCebola = 300;
        this.tpPreparo = 30;
        setValor(40.00);
        setSabor("Calabresa");
    }

    public PizzaCalabresa(int qtd, String sabor, String tamanho, int qtdFatias, int qtdCalabresa, int qtdMolho,
            int qtdQueijo, int qtdCebola, double tpPreparo) {
        super(qtd, sabor, tamanho);
        this.qtdFatias = qtdFatias;
        this.qtdCalabresa = qtdCalabresa;
        this.qtdMolho = qtdMolho;
        this.qtdQueijo = qtdQueijo;
        this.tpPreparo = tpPreparo;
        this.qtdCebola = qtdCebola;
        setValor(40.00);
        this.tpPreparo = 30;
        setSabor("Calabresa");

    }

    @Override
    public String preparar() {

        double tpPreparo = 30;
        double valor = 40.00;

        if (getQtd() > 1) {
            double prcTotal = valor * getQtd();
            setValor(prcTotal);

        }
        if (getTamanho().equals("Pequena")) {
            tpPreparo = 25;
            valor = 35.00;
        } else if (getTamanho().equals("Grande")) {
            tpPreparo = 45;
            valor = 47.00;

        }
        if (qtdFatias > 8 || qtdQueijo > 200 || qtdCalabresa > 600 || qtdMolho > 200 || qtdCebola > 300) {
            System.out.println("Quantidade de ingredientes superior ao padrão para Pizza Calabresa.");
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
            } else if (qtdCalabresa > 15) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            } else if (qtdCebola > 50) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);

            }
            System.out.println("Novo tempo de preparo: " + tpPreparo + " minutos.");
            System.out.println("Novo valor: " + getValor() + " reais.");
        } else {
            System.out.println("Quantidade de ingredientes dentro do padrão para Pizza Marguerita.");
            System.out.println("Tempo de preparo padrão: " + tpPreparo + " minutos.");

        }
        return "Pizza de Calabresa: \n"
                + "Quantidade: " + getQtd() + "\n"
                + "Valor: " + getValor() + "\n"
                + "Tamanho: " + getTamanho() + "\n"
                + "Quantidade de Calabresa: " + getQtdCalabresa() + "g" + "\n"
                + "Quantidade de Molho: " + getQtdMolho() + "g" + "\n"
                + "Quantidade de Queijo: " + getQtdQueijo() + "g" + "\n"
                + "Quantidade de Cebola: " + getQtdCebola() + "g" + "\n"
                + "Tempo de Preparo: " + getTpPreparo() + "\n";

    }

}
