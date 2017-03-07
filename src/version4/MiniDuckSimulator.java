package version4;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
            Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
            Duck redHeadedDuck = new RedHeadedDuck(new FlyWithWings(), new Quack());
            Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
            
		Duck[] ducks = {mallardDuck,redHeadedDuck,rubberDuck};
                
                for(Duck duck: ducks ){
                    
                    duck.display();
                    duck.performFly();
                    duck.performQuack();
                    System.out.println("--------");
                }

	}

}
