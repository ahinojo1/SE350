package hw3;

import java.util.ArrayList;
import java.util.Random;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

public class RectObject implements MyShape{
	
	Rectangle s;
	Color c;
	ArrayList<MyShape> list = new ArrayList<MyShape>();
	
	public RectObject(Point2D p) {
		s = new Rectangle();
		s.setX(p.getX());
		s.setY(p.getY());
		s.setHeight(100);
		s.setWidth(100);
		
		c = getRandColor();
		
		s.setStroke(c);
		s.setStrokeWidth(2.0);
	}


	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		s.setX(s.getX() - deltaX);
		s.setY(s.getY() - deltaY);
		for (MyShape a : list) {
			a.move(deltaX, deltaY);
		}
	}
	

	
	private Color getRandColor() {
		//returns a random color from a set of four basic colors
		Color[] colors = new Color[4];
		colors[0] = Color.BLUE;
		colors[1] = Color.GREEN;
		colors[2] = Color.YELLOW;
		colors[3] = Color.RED;
		Random rand = new Random();
		int colorID = rand.nextInt();
		return colors[colorID];
		
	}
	
	public Color getColor() {
		return this.c;
	}


	@Override
	public void add(MyShape s) {
		// TODO Auto-generated method stub
		list.add(s);
	}


	@Override
	public void remove(MyShape s) {
		// TODO Auto-generated method stub
		list.remove(s);
	}
	
	public Rectangle getRectangle() {
		return this.s;
	}
	
}
