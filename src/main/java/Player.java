public abstract class Player {

    private String name;
    private int health;
    private int purse;
    private int maxHealth;

    public Player(String name, int health, int purse){
        this.name = name;
        this.health = 100;
        this.purse = purse;
        this.maxHealth = 100;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public int getPurse(){
        return purse;
    }

    public void setHealthReduced(int damage){
        health -= damage;
    }

    public void healed(int healing){
        if(health < maxHealth) {
            health += healing;
        }
    }

    public void increasePurse(int coins){
        purse += coins;
    }

    public void decreasePurse(int price){
        purse -= price;
    }
}
