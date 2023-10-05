package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
		
		String shapeType = in.next();
		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();
		boolean isFilled = in.nextBoolean();
		
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		if(shapeType.equals("rectangle"))
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(isFilled)
			{
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			
			
		}
		//hii
		else if(shapeType.equals("ellipse"))
		{
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(isFilled)
			{
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
			}
			else
			{
				StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
			
			
		}
		else if(shapeType.equals("triangle"))
		{
			
			double[] xArr = new double[3];
			double[] yArr = new double[3];
			
			for(int i = 0; i < 3; i++)
			{
				xArr[i] = in.nextDouble();
				yArr[i] = in.nextDouble();
			}
			StdDraw.filledPolygon(xArr, yArr);
			
			
		}
		
		
		
		
		
		
	}
}
