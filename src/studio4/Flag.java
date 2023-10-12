package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setXscale(0,100);
		StdDraw.setYscale(0,100);

		double x = 50;
		double y = 50;
		double halfWidth = 30;
		double halfHeight = 20;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(x, y, halfWidth, halfHeight);
		StdDraw.setPenColor(Color.RED);
		double halfH = 10;
		StdDraw.filledCircle(x, y, halfH);
		
	}
	
	
}