package lab_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

enum Teams {
  REAL,
  MILAN
};

public class Main {
    public static int milan = 0;
    public static int real = 0;
    public static Teams last = null;
    public static JLabel labelResult = new JLabel("Result: 0 X 0");
    public static JLabel labelScore = new JLabel("Last Scorer: N/A");
    public static JLabel labelWinner = new JLabel("Winner: DRAW");
    public static void addScore(Teams team) {
        if (team == Teams.MILAN) {
            Main.milan = Main.milan + 1;
            Main.last = Teams.MILAN;
        } else {
            Main.real = Main.real + 1;
            Main.last = Teams.REAL;
        }
        Main.labelResult.setText("Result: " + Main.milan + " X " + Main.real);
        Main.labelScore.setText("Last Scorer: " + team);
        Main.labelWinner.setText("Winner: " + (Main.real == Main.milan ? "DRAW" : Main.real > Main.milan ? Teams.REAL : Teams.MILAN));
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Результат матча");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        JPanel panel= new JPanel();
        JPanel panel2 = new JPanel();
        //задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
        panel.setPreferredSize(new Dimension(300,500));
        // задали свойство панели размеры
        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.addScore(Teams.MILAN);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.addScore(Teams.REAL);
            }
        });
        panel.add(button1);
        panel.add(button2);
        // лейблы
        panel.add(Main.labelResult, JLabel.CENTER);
        panel.add(Main.labelScore, JLabel.CENTER);
        panel.add(Main.labelWinner, JLabel.CENTER);
        //добавили панель к фрейму
        frame.getContentPane().add(panel);
        //упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}
