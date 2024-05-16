package grid;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);

        // Screens & adding screens
        ScreenManager screenManager = new ScreenManager();
        HomeScreen homeScreen = new HomeScreen(screenManager);
        IntroScreen introScreen = new IntroScreen();

        screenManager.addScreen("Home", homeScreen);
        screenManager.addScreen("Intro", introScreen);

        frame.add(screenManager);
        frame.setVisible(true);

        screenManager.showScreen("Home");

    }

}
