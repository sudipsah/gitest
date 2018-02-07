package hell;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Image{

public static void main(String[] a){
JFrame f = new JFrame();
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.add(new ButtonDemo());
f.setSize(500,500);
f.setVisible(true);
}
}

class ButtonDemo extends JPanel implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
JTextField jtf;

public ButtonDemo() {
try {
  SwingUtilities.invokeAndWait(new Runnable() {
    public void run() {
      makeGUI();
    }
  });
} catch (Exception exc) {
  System.out.println("Can't create because of " + exc);
}
}

private void makeGUI() {
setLayout(new FlowLayout());

ImageIcon france = new ImageIcon("france.gif");
JButton jb = new JButton(france);
jb.setActionCommand("France");
jb.addActionListener(this);
add(jb);

ImageIcon germany = new ImageIcon("germany.gif");
jb = new JButton(germany);
jb.setActionCommand("Germany");
jb.addActionListener(this);
add(jb);

ImageIcon italy = new ImageIcon("italy.gif");
jb = new JButton(italy);
jb.setActionCommand("Italy");
jb.addActionListener(this);
add(jb);

ImageIcon japan = new ImageIcon("japan.gif");
jb = new JButton(japan);
jb.setActionCommand("Japan");
jb.addActionListener(this);
add(jb);

jtf = new JTextField(15);
add(jtf);
}

public void actionPerformed(ActionEvent ae) {
jtf.setText(ae.getActionCommand());
}
}