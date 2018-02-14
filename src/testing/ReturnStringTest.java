package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReturnStringTest {

	@Test
	public void test() {
		Person test = new Person();
		test.setData("Matt Bulley", 23, "QA");
		String output = test.returnString();
		assertEquals((test.name + " : " + test.age + " : " + test.jobTitle).toString(), output);
	}

}
