package grid;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends BaseScreen {

    private ScreenManager screenManager;

    public HomeScreen(ScreenManager screenManager) {
        this.screenManager = screenManager;

        JLabel text = new JLabel("Home Screen!");
        JButton hB = new JButton("Go to intro");
        hB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenManager.showScreen("Intro");
            }

        });

        add(text);
        add(hB);

    }

}
