package btiernay;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class AppTest extends AbstractTest {

	@Autowired
	Config config;
	
	@Test
	public void test() {
		System.out.println("Testing that " + config + " was injected");
	}

}
