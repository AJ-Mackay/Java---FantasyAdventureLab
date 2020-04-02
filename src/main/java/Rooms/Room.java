package Rooms;

import Players.Player;

public abstract class Room {

    private String name;
    private int coins;

    public Room(String name, int coins){
        this.name = name;
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public int getCoins() {
        return coins;
    }

    public void takeCoins(int coins, Player player) {
        this.coins -= coins;
        player.increasePurse(coins);
    }
}
