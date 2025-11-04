/* ENSF 614 - Lab 5 Exercise A
 * File Name: ColourFrameDecorator.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield 
 * Submission Date: November 4th, 2025
 * 
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class ColourFrameDecorator extends Decorator {

	float thickness;

	public ColourFrameDecorator(Component cmp, int x, int y, int width, int height, float thickness) {
		super(cmp, x, y, width, height);
		this.thickness = thickness; // had to add this as my constructor was missing the 5th integer argument
	}

	// example method given, slightly modified for my use
	public void draw(Graphics g) {
		super.draw(g);
		Graphics2D g2d = (Graphics2D) g;

		// save old stroke and colour
		Stroke oldStroke = g2d.getStroke();
		Color oldColor = g2d.getColor();

		// set stroke & colour
		// plain coloured line with thickness
		g2d.setStroke(new BasicStroke(thickness));
		g2d.setColor(Color.RED); // red as per assignment requirements

		g2d.drawRect(x, y, width, height);

		// Restore old stroke and color
		g2d.setStroke(oldStroke);
		g2d.setColor(oldColor);
	}

}
