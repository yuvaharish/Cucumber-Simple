package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookClass {
	
	@Before
	public void befoer() {
		System.out.println("thanos has collected the stones");
	}
	@After
	public void after() {
		System.out.println("thanos finally died");
	}
}
