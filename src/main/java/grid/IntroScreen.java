package grid;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroScreen extends BaseScreen {

    private ScreenManager screenManager;

    public IntroScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;
        JLabel text = new JLabel("This is the intro!");
        JButton display = new JButton("Next!");

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenManager.showScreen("ModeSelect");
            }

        });

        add(text);
        add(display);

    }

}
