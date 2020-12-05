package control;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class C1Test {

	private C1 c1=new C1();
	@BeforeAll
	public static void setUp() {
		System.out.println("Hola");
	}

	@Test
	public void test() {
		double c=c1.method();
		assertTrue(c<1&&c>0);
	}

}