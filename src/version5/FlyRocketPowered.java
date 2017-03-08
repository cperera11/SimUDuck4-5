package version5;

import version5.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
        @Override
	public void fly() {
		System.out.println("I'm flying with a rocket");
	}
}
