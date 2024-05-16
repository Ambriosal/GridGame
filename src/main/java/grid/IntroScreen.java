package grid;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroScreen extends BaseScreen {

    public IntroScreen() {
        JLabel text = new JLabel("This is the intro!");
        JButton button = new JButton("Exit");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

        add(text);
        add(button);

    }

}
