package Week8.Lab6;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class JUnitTest {
	
	public String name;
	public int age;
	
	public JUnitTest(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Test
	public void junitTest() {
		System.out.println("Hello");
		Assert.assertEquals(1, 1);
	}

	@Before
	public void beforeTest() {
		System.out.println("Running before test");
	}

	@BeforeClass
	public static void test() {
		System.out.println("Running before class");
	}

	@After
	public void test2() {
		System.out.println("@After");
	}

	@AfterClass
	public static void test3() {
		System.out.println("@AfterClass");
	}

	@Parameters
	/*
	 * adding Annotation: RunWith(Parameterized.class)
	 * on class
	 */
	public void test4() {
		System.out.println("@AfterClass");
		
	}
	
	
	@Test
	public void testMethod() {
		Assert.assertEquals("abc", "abc");
		System.out.println("");
		System.out.println("Name: "+this.name+" and Age: "+this.age);
		
	}
	@Parameters
	public static Collection<Object[]> parameters() {
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Tom";
		data[0][1] = 30;
		data[1][0] = "Harry";
		data[1][1] = 40;

		return Arrays.asList(data);
		
	}
	
	
	
	
	
	
	
}
