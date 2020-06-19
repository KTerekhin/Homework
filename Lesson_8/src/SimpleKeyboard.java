import javax.swing.*;
import java.awt.*;

public class SimpleKeyboard extends JFrame {
    private JTextField outputField;

    public SimpleKeyboard(String title) {
        this.outputField = outputField;
        setTitle(title);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(150, 150, 600, 600);
        setLayout(new GridLayout(5, 4));

        outputField = new JTextField();

        char[] chars = {'7', '8', '9', '/', '4', '5', '6', '*', '1', '2', '3', '-', '0', '.', '=', '+'};
        for (int i = 0; i < chars.length; i++) {
            JButton jb = new JButton(String.valueOf(chars[i]));
            jb.addActionListener(new ButtonListener(outputField));
            add(jb);
        }
        add(outputField);
        setVisible(true);
    }
}

//                   7    8    9    /      |      0     1     2     3
//                   4    5    6    *      |      4     5     6     7
//                   1    2    3    -      |      8     9     10    11
//                   0    .    =    +      |      12    13    14    15
