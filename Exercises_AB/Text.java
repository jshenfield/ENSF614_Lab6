/* ENSF 614 - Lab 5 Exercise A
 * File Name: Text.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield
 * Submission Date: November 4th, 2025
 */

import java.awt.Color;
import java.awt.Graphics;

public class Text implements Component {

	int x, y;
	String text;

	public Text(String text, int x, int y) {
		this.x = x;
		this.y = y;
		this.text = text;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawString(text, x, y);
	}

}
