package hell;

	import java.awt.BorderLayout;
	import java.awt.Container;
	import javax.swing.JButton;
	import javax.swing.JFrame;

	public class Border {
	  public static void main(String[] args) {
	    JFrame frame = new JFrame("BorderLayoutDemo - Beginnersbook.com");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container container = frame.getContentPane();

	    /* Creating and adding 5 buttons to the each area of Border
	     * Layout. Button names are intentionally kept same as 
	     * area names for better understanding, they can have any names.
	     */
	    container.add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
	    container.add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
	    container.add(new JButton("LINE_START"), BorderLayout.LINE_START);
	    container.add(new JButton("LINE_END"), BorderLayout.LINE_END);
	    container.add(new JButton("CENTER"), BorderLayout.CENTER);

	    //pack() method calculates and assign appropriate size for frame
	    frame.pack();
	 
	    //Making the frame visible
	    frame.setVisible(true);
	  }
	}

