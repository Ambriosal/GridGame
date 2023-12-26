package grid;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;

public class Display {

    //make sure to use school checkstyle file
    Display() {
    }

    private static ImageIcon createImageIcon(String path) {
        ClassLoader classLoader = Display.class.getClassLoader();
        java.net.URL imgURL = classLoader.getResource("/img/" + path);
    
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            throw new IllegalArgumentException("Couldn't find file: " + path);
        }
    }
    

    JButton[][] displayGrid(int[][] grid, int row, int col) {

        JButton buttons[][] = new JButton[row][col];
        JPanel gridPanel = new JPanel(new GridLayout (row, col));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                buttons[i][j] = new JButton(createImageIcon("Sshoe" + grid[i][j] + ".png"));
                buttons[i][j].setBackground(new ColorUIResource(250, 100, 100));
                buttons[i][j].setPreferredSize(new DimensionUIResource(128, 128));
                gridPanel.add(buttons[i][j]);
            }
        }
        return buttons;
    }

}
