package Weapons;

public abstract class Weapons {

    private int damage;
    private String name;

    public Weapons(int damage, String name){
        this.damage = damage;
        this.name = name;
    }

    public int getDamage(){
        return damage;
    }

    public String getName() {
        return name;
    }

    public String beenPickedUp(){
        return "I picked up this " + this.getName();
    }

    public String beenDropped(){
        return "I dropped my " + this.getName();
    }
}
