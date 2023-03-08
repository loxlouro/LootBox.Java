package toys;

import system.DropChance;

public class TeddyBearToy implements Toy{
    private DropChance chance;
    public TeddyBearToy(int weight){
        this.chance=new DropChance(weight);
    }
    @Override
    public DropChance getChance() {
        return this.chance;
    }

    public String toString(){
        return "YOU WON TEDDY BEAR";
    }

}
