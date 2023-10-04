package studio4;
import java.util.Scanner;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */

public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		System.out.println(in);
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		boolean fill = in.nextBoolean();
		if (shape == "rectangle")
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			StdDraw.setPenColor(red,green,blue);
			StdDraw.rectangle(x,y, halfWidth, halfHeight);
			StdDraw.show();
		}

		
		
		
//		StdDraw.setPenColor(Color.BLUE);
//		StdDraw.rectangle(1.0, 1.0, 1.0, 1.0);
	
	}
}
