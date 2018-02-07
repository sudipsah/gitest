package hell;
import javax.swing.*;

public class Simple {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JButton jButton = new JButton("click");
		jButton.setBounds(44, 45, 68, 52);
		frame.add(jButton);
		frame.setSize(300,300);
		frame.setLayout(null);
		frame.setVisible(true);
	}

}
