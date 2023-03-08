package UI;

import toys.Toy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetWeightActivity {
    private static Toy[] list;
    JFrame frame = new JFrame("Toy drop chances");
    private static JTextField[] c = new JTextField[2];
    public SetWeightActivity(Toy[] toys) {
        JButton apply = new JButton("Apply");
        apply.setBounds(40,200,200,40);
        ActionListener actionListener = new SetWeightActionListener();
        apply.addActionListener(actionListener);
        for (int i=0;i<toys.length;i++){

            c[i]=new JTextField(String.valueOf((toys[i].getChance().getWeight())));
            c[i].setBounds(50,20+i*40,200,30);
            frame.add(c[i]);
        }

        list=toys;
        frame.add(apply);
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    class SetWeightActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i=0;i<list.length;i++){
                list[i].getChance().setWeight(Integer.parseInt(c[i].getText()));
            }
            MainActivity.toyList=list;
            frame.setVisible(false);
        }
    }

}
