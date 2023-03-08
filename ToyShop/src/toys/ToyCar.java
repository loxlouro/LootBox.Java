package toys;

import system.DropChance;

public class ToyCar implements Toy{
    private DropChance chance;
    public ToyCar(int weight){
        this.chance=new DropChance(weight);
    }


    @Override
    public DropChance getChance() {
        return this.chance;
    }

    @Override
    public String toString() {
        return "THAT's A CAR";
    }
}
