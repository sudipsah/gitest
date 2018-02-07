package hell;


	import org.eclipse.swt.SWT;
	import org.eclipse.swt.events.PaintEvent;
	import org.eclipse.swt.events.PaintListener;
	import org.eclipse.swt.layout.FillLayout;
	import org.eclipse.swt.widgets.Canvas;
	import org.eclipse.swt.widgets.Display;
	import org.eclipse.swt.widgets.Shell;

	public class Graph {
	  public static void main(String[] args) {
	    final Display display = new Display();
	    final Shell shell = new Shell(display);
	    shell.setText("Canvas Example");
	    shell.setLayout(new FillLayout());

	    Canvas canvas = new Canvas(shell, SWT.NONE);

	    canvas.addPaintListener(new PaintListener() {
	      public void paintControl(PaintEvent e) {

	        e.gc.setForeground(display.getSystemColor(SWT.COLOR_BLUE));
	        e.gc.drawText("I'm in blue!",20,20);        
	      }
	    });

	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch()) {
	        display.sleep();
	      }
	    }
	    display.dispose();
	  }
	}

}
