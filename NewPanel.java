import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewPanel extends JPanel implements ActionListener {

    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();

    public PanelSwap(){
        //super(new BorderLayout());
        firstPanel.setBackGround(Color.RED);

        secondPanel.stBackground(Color.BLUE);

        JButton swap1 = new JButton("Change the Panel...");
        swap1.addActionListener(this);

        JButton swap2 = new JButton("Find the Change...");
        swap2.addActionListener(this);

        firstPanel.add(swap1);
        secondPanel.add(swap2);

        firstPanel.add(swap1);
        secondPanel.add(swap2);

        add(firstPanel);

    }

    public void actionListener(ActionEvent e) {
        for (Component c : getComponents()) {
            if (firstPanel == c) {
                remove(firstPanel);
                add(secondPanel);

            } else {
                remove(secondPanel);
                add(firstPanel);
            }
            
        repaint();
        revalidate();

        }
    }
    
}
