package grid;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
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
    private GridState gridState;
    // private JLabel win;
    // private int moveCount;

    Display(GameLogic gameLogic, GridState gridState) {
        this.gameLogic = gameLogic;
        this.gridState = gridState;
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


    JPanel displayGrid(int[][] grid, int row, int col, JLabel winLabel) {

        buttons = new JButton[row][col];
        // int[][] updatedsend = new int[row][col];
        JPanel gridPanel = new JPanel(new GridLayout(row, col));
        // GridState currentGrid;

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
                int x = i;
                int y = j;
                //Adding Action listeners to each button
                buttons[i][j].addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e){
                        //movement
                        int[][] updated = gameLogic.move(grid, x, y, buttons);
                        // GridState.setCurrentGrid(grid);
                        boolean done = gameLogic.levelWin(updated, gridState);
                        System.out.println(done);
                        if (done){
                            winLabel.setText("winner!");
                        }
                        // gridState.copyGrid(updatedsend, updated);
                    }
                });
                
                gridPanel.add(buttons[i][j]);
                // GridState.setCurrentGrid(updatedsend);
            }
        }

        return gridPanel;
    }




    

}