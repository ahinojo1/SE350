package hw3;


import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

public class CircObject implements MyShape{
	double x = 0;
	double y = 0;
	Shape s = new Circle();
	Color c = Color.BLACK;
	
	public CircObject(double xCoord, double yCoord) {
		x = xCoord;
		y = yCoord;
		
	}
	

	@Override
	public void move(double deltaX, double deltaY) {
		// TODO Auto-generated method stub
		
	}
	
	public void setColor(Color color) {
		this.c = color;
	}
}