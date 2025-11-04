/* ENSF 614 - Lab 5 Exercise A
 * File Name: BorderDecorator.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield
 * Submission Date: November 4th, 2025
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class BorderDecorator extends Decorator {

	public BorderDecorator(Component cmp, int x, int y, int width, int height) {
		super(cmp, x, y, width, height);
	}

	public void draw(Graphics g) {
		super.draw(g);

		Graphics2D g2d = (Graphics2D) g;

		// Save the old stroke and color so we can restore them later
		Stroke oldStroke = g2d.getStroke();
		Color oldColor = g2d.getColor();

		// Set new stroke and color
		// dashed line here
		g2d.setStroke(new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[] { 5 }, 0));
		g2d.setColor(Color.BLACK);

		// draw rectangle
		g2d.drawRect(x, y, width, height);

		// reset stroke and color
		g2d.setStroke(oldStroke);
		g2d.setColor(oldColor);
	}

}
