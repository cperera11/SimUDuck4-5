package version5;

/*
 * Wait a second, didn't we say we should NOT program
 * to an implementation? But what are we doing in that
 * constructor? We're making a new instance of a concrete
 * Quack implementation class!
 * 
 * Good catch! That's exactly what we're doing ... for now!
 * Later, we'll have more design patterns that can help fix
 * this problem.
 * 
 * Still, notice that while we are setting the behaviors
 * to concrete classes, we could easily change that at runtime.
 * So we still have lots of flexibility here, but we're doing a
 * poor job of initializing the instance variables in a flexible
 * way. But think about it, since the quackBehavior instance
 * variable is an interface type, we could, through the magic
 * of polymorphism, dynamically asign a different QuackBehavior
 * implementation at runtime. We'll see this later.
 */	
public class MallardDuck implements Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
        private SwimBehavior swimBehavior;
        
        
	public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
		setFlyBehavior(flyBehavior);
                setQuackBehavior(quackBehavior);
                setSwimBehavior(swimBehavior);
	}

    public final FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public final void setFlyBehavior(FlyBehavior flyBehavior) {
        if (flyBehavior == null || flyBehavior.toString().isEmpty()){
            throw new IllegalArgumentException("Fly behavior cannot be null or empty!");
        }
        this.flyBehavior = flyBehavior;
    }

    public final QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

        @Override
    public final void setQuackBehavior(QuackBehavior quackBehavior) {
        if(quackBehavior == null || quackBehavior.toString().isEmpty()){
        throw new IllegalArgumentException("Quack behavior cannot be null or empty!");
        }
        this.quackBehavior = quackBehavior;
    }

    public final SwimBehavior getSwimBehavior() {
        return swimBehavior;
    }

    public final void setSwimBehavior(SwimBehavior swimBehavior) {
        if(swimBehavior == null || swimBehavior.toString().isEmpty()){
        throw new IllegalArgumentException("Swim behavior cannot be null or empty!");
        }
        this.swimBehavior = swimBehavior;
    }
                
    @Override
    public final void display() {
        System.out.println("I'm a Mallard Duck");
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
	
}
