import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class gui2019 extends JFrame implements ActionListener{

  JButton a;
  JLabel x;
  JButton b;
  int num = 1;
    public gui2019(){
      setTitle("Window");
      setSize(300,200);
      setDefaultCloseOperation(3);

      setLayout(new FlowLayout());

      a = new JButton("-");
      getContentPane().add(a);
      a.setActionCommand("x");
      a.addActionListener(this);

      x = new JLabel("1");
      getContentPane().add(x);

      b = new JButton("+");
      getContentPane().add(b);
      b.addActionListener(this);
    }
      public void actionPerformed(ActionEvent e){
        JButton c = (JButton) e.getSource();
        if(c.getActionCommand().equals("x")){
          num--;
          x.setText(""+num);
        }
        else {
          num++;
          x.setText(""+num);
        }
      }


    public static void main(String[] args) {
      gui2019 app = new gui2019();
      app.setVisible(true);
    }
}
