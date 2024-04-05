import javax.swing.*;
import java.awt.*;

public class App {
    public static void main(String[] args) throws Exception{
        int boardWidth = 600;
        int boardHeight = boardWidth;
        //This is responsible for everything about the frame of the game
        JFrame frame = new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SnakeGame snakeGame = new SnakeGame(boardWidth, boardHeight);
        frame.add(snakeGame);
        //to resolve the issue of counting the white bar as part of the height
        frame.pack();
        snakeGame.requestFocus();
    }
}
