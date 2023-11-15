import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Display{
    static JFrame frame;
    static JPanel mainPanel;

    public static void main(String[] args) throws IOException{
        mainMenu();
    }

    private static void mainMenu() throws IOException{
        frame = new JFrame("Word Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel title = new JLabel("Title");
        //title.setPreferredSize(new Dimension(120, 30));

        JButton start = new JButton("New Game");
        start.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                levelSelect();
            }
        });

        mainPanel.add(title, BorderLayout.CENTER);
        mainPanel.add(start, BorderLayout.SOUTH);

        //show GUI
        frame.getContentPane().add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void levelSelect(){
        mainPanel.removeAll();
        
        JLabel selectALevel = new JLabel("Select a Level:");

        JPanel middlePanel = new JPanel();

        JButton level1 = new JButton("Level 1");
        level1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                difficultySelect();
            }
        });

        JButton level2 = new JButton("Level 2");
        level2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                difficultySelect();
            }
        });

        JButton level3 = new JButton("Level 3");
        level3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                difficultySelect();
            }
        });

        middlePanel.add(level1, BorderLayout.WEST);
        middlePanel.add(level2, BorderLayout.CENTER);
        middlePanel.add(level3, BorderLayout.EAST);

        mainPanel.add(selectALevel, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void difficultySelect(){
        mainPanel.removeAll();

        JLabel selectADiff = new JLabel("Select a Difficulty:");

        JPanel middlePanel = new JPanel();

        JButton diff1 = new JButton("Difficulty 1");
        diff1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                startGame();
            }
        });

        JButton diff2 = new JButton("Difficulty 2");
        diff2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                startGame();
            }
        });

        JButton diff3 = new JButton("Difficulty 3");
        diff3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                startGame();
            }
        });

        middlePanel.add(diff1, BorderLayout.WEST);
        middlePanel.add(diff2, BorderLayout.CENTER);
        middlePanel.add(diff3, BorderLayout.EAST);

        mainPanel.add(selectADiff, BorderLayout.NORTH);
        mainPanel.add(middlePanel, BorderLayout.CENTER);

        frame.getContentPane().add(mainPanel);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

    private static void startGame(){
        mainPanel.removeAll();

        frame.getContentPane().add(mainPanel);

        mainPanel.revalidate();
        mainPanel.repaint();
    }

}
