package hw3;




import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ShapeComposer extends Application{

	Point2D clickPoint = null;
	Point2D releasePoint = null;
	Point2D lastPosition = null;
	
	ArrayList<MyShape> container = new ArrayList<MyShape>();
	
	MyShape component;
	
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
				 
				 
				 switch(eventName) {
				 case("MOUSE_DRAGGED"):
					 if(lastPosition != null) {
						 double deltaX = clickPoint.getX() - lastPosition.getX();
						 double deltaY = clickPoint.getX() - lastPosition.getY();
						 component.move(deltaX, deltaY);
					 }
				 case("MOUSE_RELEASED"):
					
					for(MyShape shape : container) {
						//root.getChildren().add(new CircObject(clickPoint.getX(),clickPoint.getY()));
					}
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
