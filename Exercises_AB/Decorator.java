/* ENSF 614 - Lab 5 Exercise A
 * File Name: Decorator.java
 * M. Moussavi, October 2024
 * Lab Section: B01
 * Completed by: Jack Shenfield
 * Submission Date: November 4th, 2025
 */

import java.awt.Graphics;

public abstract class Decorator implements Component {

	Component cmp;
	int x, y, width;
	public int height;

	public Decorator(Component cmp, int x, int y, int width, int height) {
		this.cmp = cmp;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g) {
		cmp.draw(g);
	}

}
