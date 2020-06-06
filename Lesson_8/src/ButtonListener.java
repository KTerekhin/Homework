import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ButtonListener implements ActionListener {
    Random random = new Random();

    private JTextField jTextField;

    public ButtonListener(JTextField jTextField) {
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        String actionCommand = e.getActionCommand();
        jTextField.setText(jTextField.getText() + " " + actionCommand);
        int R = random.nextInt(255);
        int G = random.nextInt(255);
        int B = random.nextInt(255);
        jButton.setBackground(new Color(R, G, B));
    }
}
