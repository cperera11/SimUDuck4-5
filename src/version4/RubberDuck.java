package version4;

public class RubberDuck implements Duck {
    private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
        
	public RubberDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior) {
		setFlyBehavior(flyBehavior);
                setQuackBehavior(quackBehavior);
	}

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        if (flyBehavior == null || flyBehavior.toString().isEmpty()){
            throw new IllegalArgumentException("FlyBehavior cannot be null or empty!");
        }
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null || quackBehavior.toString().isEmpty()){
        throw new IllegalArgumentException("QuackBehavior cannot be null or empty!");
        }
        this.quackBehavior = quackBehavior;
    }
                
    @Override
    public void display() {
		System.out.println("I'm a Rubber Duck");
	}

    @Override
    public final void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public final void performFly() {
        flyBehavior.fly();
    }

    @Override
    public final void swim() {
        
    }
	
}
