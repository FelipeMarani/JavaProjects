package Pizzaria;
abstract  class Pizza{

   private int qtd;
   private String sabor;
   private double valor;
   private String tamanho;
   
   public int getQtd() {
    return qtd;
   }
   public void setQtd(int qtd) {
    this.qtd = qtd;
   }
   public String getSabor() {
    return sabor;
   }
   public void setSabor(String sabor) {
    this.sabor = sabor;
   }
   public double getValor() {
    return valor;
   }
   public void setValor(double valor) {
    this.valor = valor;
   }
   public String getTamanho() {
    return tamanho;
   }
   public void setTamanho(String tamanho) {
    this.tamanho = tamanho;
   }

   abstract String preparar();

    
    
}