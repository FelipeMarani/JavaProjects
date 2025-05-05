package RPG;

public class Personagem {

    private String name;
    private int level;
    private int xp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Personagem(String name, int level, int xp) {
        this.name = name;
        this.level = level;
        this.xp = xp;
    }

    public void Atacar(Guerreiro guerreiro) {
        System.out.println("O guerreiro " + guerreiro.getName() + " esta atacando com a "
                + guerreiro.getArma() + " e causou um total de "
                + guerreiro.getDamage() + " dano.");

    }

    public void Atacar(Arqueiro arqueiro) {
        System.out.println("O arqueiro " + arqueiro.getName() + " esta atacando com a "
                + arqueiro.getArco() + " e causou um total de "
                + arqueiro.getDamage() + " dano.");

    }

    public void Atacar(Mago mago) {

        System.out.println("O mago " + mago.getName() + " esta atacando com a "
                + mago.getMagic() + " usou um total de "
                + mago.getCustMana() + " mana e causou "
                + mago.getDamage() + " de dano.");

    }

}
