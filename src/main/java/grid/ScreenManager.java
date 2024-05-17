package grid;

import java.awt.CardLayout;

public class ScreenManager extends BaseScreen {

    private CardLayout cardLayout;

    public ScreenManager(){

        cardLayout = new CardLayout();
        setLayout(cardLayout);
    }

    public void addScreen(String name, BaseScreen screen){
        add(screen, name);
    }

    public void showScreen(String name){
        cardLayout.show(this, name);
    }

}
