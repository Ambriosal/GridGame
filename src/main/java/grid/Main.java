package grid;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);


        //testing
        // GridState gridState = new GridState();
        // Screens & adding screens
        ScreenManager screenManager = new ScreenManager();
        HomeScreen homeScreen = new HomeScreen(screenManager);
        IntroScreen introScreen = new IntroScreen(screenManager);
        SelectScreen selectScreen = new SelectScreen(screenManager);
        // GameScreen gameScreen = new GameScreen(screenManager, gridState);
        Display display = new Display();

    
        screenManager.addScreen("Home", homeScreen);
        screenManager.addScreen("Intro", introScreen);
        screenManager.addScreen("ModeSelect",selectScreen);
        screenManager.addScreen("Display", display);
        // screenManager.addScreen("Game", gameScreen);

        frame.add(screenManager);
        frame.setVisible(true);

        screenManager.showScreen("Home");

    }

}
