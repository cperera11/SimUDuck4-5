package version4;

public interface Duck {
	
	public abstract void display();
	
	/*
	 * Rather than handling the quack behavior itself, the Duck object
	 * delegates that behavior to the object referenced by quackBehavior.
	 * This object is unknown -- that's DIP in action!
	 */
	public abstract void performQuack();
	
	public abstract void performFly();
	
	public abstract void performSwim();
	
	
	
	// OTHER DUCK-LIKE METHODS
}
