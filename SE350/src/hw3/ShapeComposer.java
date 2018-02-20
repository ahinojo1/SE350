package hw3;




import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShapeComposer extends Application{

	Point2D clickPoint = null;
	Point2D releasePoint = null;
	Point2D lastPosition = null;
	boolean inDragMode;
	
	ArrayList<MyShape> shapes = new ArrayList<MyShape>();
	
	MyShape currentShape;
	
	private MyShape getCurrentShape() { // IDK???
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		AnchorPane root = new AnchorPane();
		Scene scene = new Scene(root, 1000, 1000);
		scene.setFill(Color.WHITESMOKE);
		primaryStage.setTitle("Shape Composer");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
		EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent mouseEvent) {
				// TODO Auto-generated method stub
				 clickPoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				 releasePoint = new Point2D(mouseEvent.getX(), mouseEvent.getY());
				 String eventName = mouseEvent.getEventType().getName();
				 if(!inDragMode) {
					 currentShape = getCurrentShape();
				 }
				 
				 switch(eventName) {
				 case("MOUSE_DRAGGED"):
					 inDragMode = true;
					 if(currentShape != null && lastPosition != null) {
						 double deltaX = clickPoint.getX() - lastPosition.getX();
						 double deltaY = clickPoint.getX() - lastPosition.getY();
						 currentShape.move(deltaX, deltaY);
					 }
					 break;
				 case("MOUSE_RELEASED"):
					if(currentShape != null && currentShape instanceof CircObject) {
						for(MyShape container : shapes) {
							if(container instanceof RectObject /*&& container.ContainsPoint(clickPoint)*/) {
								((RectObject)container).add(currentShape);
								break;
							}
							 //root.getChildren().add(new CircObject(clickPoint.getX(),clickPoint.getY()));
						}
					}
				 	if(currentShape == null) {
				 		if(mouseEvent.getButton() == MouseButton.PRIMARY) {
				 			CircObject circle = new CircObject(clickPoint);
				 			shapes.add(circle);
				 			root.getChildren().add(circle.getCircle());
				 		}else {
				 			RectObject rect = new RectObject(clickPoint);
				 			shapes.add(rect);
				 			root.getChildren().add(rect.getRectangle());
				 		}
				 	}
				 	else {
				 		currentShape = null;
				 	}
				 	inDragMode = false;
				 	break;
					 
				 }
				 lastPosition = clickPoint;
				 
			}
			
		};
		scene.setOnMouseDragged(mouseHandler);
		scene.setOnMouseReleased(mouseHandler);
		scene.setOnMousePressed(mouseHandler);
		
	}

}
