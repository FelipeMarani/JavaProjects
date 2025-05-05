package RPG;

public class Guerreiro extends Personagem {

    private String name;
    private int damage;
    private int durability;
    private int rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Guerreiro(String nameGuerreiro, int level, int xp, String name, int damage, int durability, int rank) {
        super(nameGuerreiro, level, xp);
        this.name = name;
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
