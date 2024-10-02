package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		//Outline for flag
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
		
		//Red head
		StdDraw.setPenColor(244, 38, 15);
		StdDraw.filledEllipse(0.5, 0.5, 0.21, 0.2);
		
		//Circles on top of red head
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(0.5, 0.58, 0.1);
		StdDraw.filledEllipse(0.72, 0.53, 0.05, 0.07);
		StdDraw.filledEllipse(0.28, 0.53, 0.05, 0.07);
		
		//Outline for red head
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.ellipse(0.5, 0.5, 0.21, 0.2);
		
		//Face
		StdDraw.setPenColor(255, 219, 172);
		StdDraw.filledEllipse(0.5, 0.34, 0.12, 0.08);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.ellipse(0.5, 0.34, 0.12, 0.08);
		
		// Eyes
		StdDraw.setPenColor(Color.black);
		StdDraw.filledEllipse(0.45, 0.34, 0.01, 0.03);
		StdDraw.filledEllipse(0.55, 0.34, 0.01, 0.03);
		
		// Eyeballs 
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledEllipse(0.45, 0.355, 0.005, 0.01);
		StdDraw.filledEllipse(0.55, 0.355, 0.005, 0.01);

	}
}