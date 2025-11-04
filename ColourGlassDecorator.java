/* ENSF 614 - Lab 5 Exercise B
 * File Name: ColourFrameDecorator.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield 
 * Submission Date: November 4th, 2025
 * 
 */

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class ColourGlassDecorator extends Decorator {

	public ColourGlassDecorator(Component cmp, int x, int y, int width, int height) {
		super(cmp, x, y, width, height);
	}

	// example method given, slightly modified for my use
	public void draw(Graphics g) {
		super.draw(g);
		Graphics2D g2d = (Graphics2D) g;

		// save old stroke and colour
		Stroke oldStroke = g2d.getStroke();
		Color oldColor = g2d.getColor();

		g2d.setColor(Color.GREEN);
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1 * 0.1f));
		g2d.fillRect(25, 25, 110, 110);

		g2d.drawRect(x, y, width, height);

		// Restore old stroke and color
		g2d.setStroke(oldStroke);
		g2d.setColor(oldColor);
	}

}