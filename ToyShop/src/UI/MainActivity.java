package UI;

import system.DropChance;
import toys.TeddyBearToy;
import toys.Toy;
import toys.ToyCar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainActivity {
    JFrame a = new JFrame("ToyShop");
    JLabel b1 = new JLabel();
    public static Toy[] toyList = new Toy[2];
        public MainActivity() {
            JButton button = new JButton("Drop something");
            button.setBounds(40,90,200,40);
            ActionListener actionListener = new DropSomethingActionListener();
            button.addActionListener(actionListener);
            toyList[0]=new ToyCar(5);
            toyList[1]=new TeddyBearToy(10);
            JButton setWeight = new JButton("Set toy weight");
            setWeight.setBounds(40,180,200,40);
            ActionListener setWeigthactionListener = new SetToyWeightActionListener();
            setWeight.addActionListener(setWeigthactionListener);
            a.add(button);
            a.add(setWeight);
            a.add(b1);
            a.setSize(600,400);
            a.setLayout(null);
            a.setVisible(true);
        }
        public void dropSomething(){
            b1.setBounds(0,0,200,40);
            b1.setText(DropChance.dropSomething(toyList).toString());
        }
        public void setToyWeight(Toy toy, int weight){
            toy.getChance().setWeight(weight);
        }
    class DropSomethingActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            dropSomething();
        }
    }
    class SetToyWeightActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            SetWeightActivity setWeightActivity=new SetWeightActivity(toyList);
        }
    }
}



