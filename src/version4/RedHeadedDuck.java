package version4;

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
public class RedHeadedDuck implements Duck {
	
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
        
	public RedHeadedDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior) {
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
		System.out.println("I'm a Red Heade Duck");
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
