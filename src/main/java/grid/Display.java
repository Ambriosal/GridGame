package grid;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Display extends BaseScreen{

    private GameLogic gameLogic;
    private JButton[][] buttons;
    // private int moveCount;

    Display(GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        if(gameLogic == null){
            throw new IllegalArgumentException("Game logic null!! fix this hoe!!");
        }
    }

    static ImageIcon createImageIcon(String filename) throws IOException {
        String realPath = "src/main/resources/img/" + filename;

        // Load the image file as a FileInputStream
        try (FileInputStream stream = new FileInputStream(new File(realPath))) {
            // Convert the FileInputStream to an Image
            Image image = javax.imageio.ImageIO.read(stream);

            // Create and return the ImageIcon
            return new ImageIcon(image);
        } catch (IOException e) {
            throw new IOException("Couldn't find file: " + realPath, e);
        }
    }


    JPanel displayGrid(int[][] grid, int row, int col) {

        buttons = new JButton[row][col];
        JPanel gridPanel = new JPanel(new GridLayout(row, col));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                try {
                    buttons[i][j] = new JButton(createImageIcon("shoe"+grid[i][j]+".png"));
                } catch (IOException e) {
                    //Change this later
                    System.err.println("Error loading image:" +e.getMessage());
                    System.exit(1);
                }
                buttons[i][j].setBackground(new Color(200, 100, 100));
                buttons[i][j].setPreferredSize(new Dimension(128, 128));
                //Adding Action listeners to each button
                int x = i;
                int y = j;
                buttons[i][j].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        gameLogic.move(grid, x, y, buttons);
                        // gameLogic.resetColour();
                        // moveCount++;

                    }
                });
                
                gridPanel.add(buttons[i][j]);
            }
        }

        return gridPanel;
    }

}
