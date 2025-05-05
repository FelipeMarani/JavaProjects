package RPG;

public class Arqueiro extends Personagem{

    private String arco;
    private int damage;
    private int durability;
    private int rank;

    public String getArco() {
        return arco;
    }

    public void setArco(String name) {
        this.arco = arco;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Arqueiro(String name, int level, int xp, String arco, int damage, int durability, int rank) {
        super(name, level, xp);
        this.arco = arco;
        this.rank = rank;
        if (damage < 0 || damage > 10) {
            System.out.println("Dano de arma inválido: Dano referencial 0~10.");
        } else {
            this.damage = damage;
        }
        if (rank < 2) {
            this.durability = durability;
        } else if (durability > 50) {
            System.out.println("Durabilidade de arma excede seu rank padrão, 0~50");
        } else {
            this.durability = durability;
        }
    }

}
