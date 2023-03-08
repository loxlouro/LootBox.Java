package system;

import toys.Toy;

import java.util.ArrayList;

public class DropChance {
    private int weight=0;
    public DropChance(int weight){
        this.weight=weight;
    }
    public static Toy dropSomething(Toy[] toys){
        ArrayList<Toy> toysList = new ArrayList<>();
        for (Toy i:toys){
            for (int j=0;j<i.getChance().weight;j++){
                toysList.add(i);
            }
        }
        Toy temp=toysList.get((int) Math.round((Math.random()*100)/toysList.size()));
        return temp;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
}
