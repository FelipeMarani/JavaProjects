package pizzaria;

public class PizzaMarguerita extends Pizza {

    private int qtdFatias;
    private int qtdQueijo;
    private int qtdMolho;
    private int qtdTomate;
    private int qtdManjericao;
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

    public int getQtdTomate() {
        return qtdTomate;
    }

    public void setQtdTomate(int qtdTomate) {
        this.qtdTomate = qtdTomate;
    }

    public int getQtdManjericao() {
        return qtdManjericao;
    }

    public void setQtdManjericao(int qtdManjericao) {
        this.qtdManjericao = qtdManjericao;
    }

    public double getTpPreparo() {
        return tpPreparo;
    }

    public void setTpPreparo(double tpPreparo) {
        this.tpPreparo = tpPreparo;
    }

    public PizzaMarguerita() {
        super(1, "Marguerita", "Média");
        this.qtdFatias = 8;
        this.qtdQueijo = 200;
        this.qtdMolho = 200;
        this.qtdTomate = 15;
        this.qtdManjericao = 50;
        setValor(45.00);
        this.tpPreparo = 35;
        setSabor("Marguerita");

    }

    public PizzaMarguerita(int qtd, String sabor, String tamanho, int qtdFatias, int qtdQueijo, int qtdMolho,
            int qtdTomate, int qtdManjericao) {

        super(qtd, sabor, tamanho);
        this.qtdFatias = qtdFatias;
        this.qtdQueijo = qtdQueijo;
        this.qtdMolho = qtdMolho;
        this.qtdTomate = qtdTomate;
        this.qtdManjericao = qtdManjericao;
        setValor(45.00);
        this.tpPreparo = 35;
        setSabor("Marguerita");

    }

    @Override
    public String preparar() {

        double tpPreparo = 30;
        double valor = 45.00;

        if (getQtd() > 1) {
            double prcTotal = valor * getQtd();
            setValor(prcTotal);

        }

        if (getTamanho().equals("Pequena")) {
            tpPreparo = 25;
            valor = 37.00;
        } else if (getTamanho().equals("Grande")) {
            tpPreparo = 45;
            valor = 50.00;

        }

        if (qtdFatias > 8 || qtdQueijo > 200 || qtdMolho > 200 || qtdTomate > 15 || qtdManjericao > 50) {
            System.out.println("Quantidade de ingredientes superior ao padrão para Pizza Marguerita.");
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
            } else if (qtdTomate > 15) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);
            } else if (qtdManjericao > 50) {
                tpPreparo += 5;
                setValor(getValor() + 2.5);

            }
        } else {
            System.out.println("Quantidade de ingredientes dentro do padrão para Pizza Marguerita.");
            System.out.println("Tempo de preparo padrão: " + tpPreparo + " minutos.");

        }

        return "Pizza de Marguerita: \n"
                + "Quantidade: " + getQtd() + "\n"
                + "Valor: " + getValor() + "\n"
                + "Tamanho: " + getTamanho() + "\n"
                + "Quantidade de Queijo: " + getQtdQueijo() + "g" + "\n"
                + "Quantidade de Molho: " + getQtdMolho() + "g" + "\n"
                + "Quantidade de Tomate: " + getQtdTomate() + "\n";
    }
}
