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
        JButton playButton = new JButton("Play!");
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screenManager.showScreen("Intro");
            }

        });

        // JButton setButton = new JButton("Settings");
        // setButton.addActionListener(new ActionListener() {
        //     @Override
        //     public void actionPerformed(ActionEvent e){
        //         screenManager.showScreen("Settings");
        //     }
        // });

        add(text);
        add(playButton);

    }

}
