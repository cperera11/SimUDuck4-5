package version5;

public class ModelDuck implements Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private SwimBehavior swimBehavior;
    private double price;
        
	public ModelDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior,SwimBehavior swimBehavior) {
		setFlyBehavior(flyBehavior);
                setQuackBehavior(quackBehavior);
                setSwimBehavior(swimBehavior);
	}

    public ModelDuck() {
    }

      
   public final SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public final void setSwimBehavior(SwimBehavior swimBehavior) {
        if(swimBehavior == null || swimBehavior.toString().isEmpty()){
        throw new IllegalArgumentException("QuackBehavior cannot be null or empty!");
        }
        this.swimBehavior = swimBehavior;
    }
    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    @Override
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
    public final void display() {
		System.out.println("I'm a model duck");
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
    public final void performSwim() {
        swimBehavior.swim();
    }

    public final double getPrice() {
        return price;
    }

    public final void setPrice(double price) {
        this.price = price;
    }
    
    
	
}
