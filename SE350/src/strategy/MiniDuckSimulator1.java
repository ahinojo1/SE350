package strategy;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
