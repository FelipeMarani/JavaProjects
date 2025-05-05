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

    
    
    

}
