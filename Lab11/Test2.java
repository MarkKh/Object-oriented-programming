import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.Scanner;

public class Test2 extends JFrame implements ActionListener {
  JButton upper, lower;
  JLabel result;
  JTextField txt;

  public Test2() {
    setTitle("Case");
    setSize(500, 200);
    setLocation(250, 250);
    setDefaultCloseOperation(3);
    setLayout(new FlowLayout());

    // panel
    JPanel grid = new JPanel(new GridLayout(2, 2, 1, 1)); // 3 2 1 1
    getContentPane().add(grid);

    // Text Field
    txt = new JTextField();
    getContentPane().add(txt);
    txt.setColumns(20);
    grid.add(txt);

    // Label
    result = new JLabel("");
    getContentPane().add(result);
    grid.add(result);

    // Button
    upper = new JButton("Uppercase");
    upper.setActionCommand("up");
    getContentPane().add(upper, BorderLayout.WEST);
    upper.addActionListener(this);
    grid.add(upper);

    lower = new JButton("Lowercase");
    lower.setActionCommand("low");
    getContentPane().add(lower, BorderLayout.LINE_END);
    lower.addActionListener(this);
    grid.add(lower);
  }

  public void actionPerformed(ActionEvent a) {
    JButton swap = (JButton) a.getSource();
    String input = txt.getText();
    if (a.getActionCommand().equals("up")) {
      result.setText(input.toUpperCase());
    }
    if (a.getActionCommand().equals("low")) {
      result.setText(input.toLowerCase());
    }
  }

  public static void main(String[] args) {
    Test2 app = new Test2();
    app.setVisible(true);
  }
}
