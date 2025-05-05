package RPG;

public class Mago extends Personagem{

    private String magic;
    private int rank;
    private int damage;
    private int custMana;

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCustMana() {
        return custMana;
    }

    public void setCustMana(int custMana) {
        this.custMana = custMana;
    }

    public Mago(String nameMago, int level, int xp, String magic, int rank, int damage, int custMana) {
        super(nameMago, level, xp);
        this.magic = magic;
        this.rank = rank;
        if (damage < 0 || damage > 10) {
            System.out.println("Dano de arma inválido: Dano referencial 0~10.");
        } else {
            this.damage = damage;
        }
        if (rank < 2) {
            this.custMana = custMana;
        } else if (custMana > 100) {
            System.out.println("Mana insuficiente para o rank padrão, 0~100");
        } else {
            this.custMana = custMana;
        }
    }

    

}
