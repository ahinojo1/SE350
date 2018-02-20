package hw3;


import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CircObject implements MyShape{
	double x = 0;
	double y = 0;
	Circle s;
	Color c = Color.BLACK;
	
	public CircObject(Point2D p) {
		s.setCenterX(p.getX());
		s.setCenterY(p.getY());
		s.setRadius(20);
		s = new Circle();
	}
	

	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		s.setCenterX(s.getCenterX() + deltaX);
		s.setCenterY(s.getCenterY() + deltaY);
	}
	
	public void setColor(Color color) {
		this.c = color;
	}
	
	/*public Shape getCurrentShape() {
		return this.s;
	}
*/


	@Override
	public void add(MyShape s) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void remove(MyShape s) {
		// TODO Auto-generated method stub
		
	}


	public Circle getCircle() {
		// TODO Auto-generated method stub
		return this.s;
	}
}