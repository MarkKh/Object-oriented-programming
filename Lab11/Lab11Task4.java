import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

class Lab11Task4 extends JFrame {
  public Lab11Task4() {
    setTitle("Khomsan");
    setSize(350, 200);
    setLocation(10, 200);
    setLayout(new FlowLayout());

    final JLabel Label = new JLabel("Hello world");
    getContentPane().add(Label);

    final JButton Button = new JButton("Yes Flash");
    getContentPane().add(Button);

    final JButton Button2 = new JButton("No Flash");
    getContentPane().add(Button2);

  }

  public static void main(String[] args) {
    Lab11Task4 app = new Lab11Task4();
    app.setVisible(true);
    app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
