package Players;

public abstract class Fighter extends Player implements IWeapon {
    
    private IWeapon weapon;


    public Fighter(String name, int health, int purse, IWeapon weapon) {
        super(name, health, purse);
        this.weapon = weapon;
    }

    public abstract void attack();
}
