package version5;

import java.util.Random;

public class MiniDuckSimulator {

	public static void main(String[] args) {
            
            Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack(), new Swim());
            Duck modelDuck = new ModelDuck(new FlyWithWings(), new Quack(), new Swim());
            Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak(), new Float());
            
            
		Duck[] ducks = {mallardDuck,modelDuck,rubberDuck};
                
                for(Duck duck: ducks ){
                    
                    duck.display();
                    duck.performFly();
                    duck.performQuack();
                    duck.performSwim();
                    
                    System.out.println("-----------");
                }
                
                // Randomly set values in runtime
            final Random rand = new Random();
            int i = rand.nextInt(ducks.length);
            
            FlyBehavior[] fbs = {new FlyWithWings(),new FlyNoWay(), new FlyRocketPowered()};
            QuackBehavior [] qbs = {new Quack(),new Squeak(),new MuteQuack()};
            SwimBehavior [] sbs = {new Float(),new Swim()};
                       
            
             ducks[i].setFlyBehavior(fbs[rand.nextInt(fbs.length)]);
             ducks[i].setQuackBehavior(qbs[rand.nextInt(fbs.length)]);
             ducks[i].setSwimBehavior(sbs[rand.nextInt(fbs.length)]);
             
            Duck[] newDucks = {new MallardDuck(),new ModelDuck(),new RubberDuck()};
            
             System.out.println("---Randomly selected behaviors---");
             newDucks[i].display();
             ducks[i].performFly();
             ducks[i].performQuack();
             ducks[i].performSwim();
	

        }
}
