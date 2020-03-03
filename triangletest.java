package tpintegration;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class triangletest {

	tptesttriangle t1;

	tptesttriangle t2;

	tptesttriangle t3;

	tptesttriangle t4;

	@Before
	public void btest() {

		t1 = new tptesttriangle(2, 2, 2);

		t2 = new tptesttriangle(3, 3, 2);

		t3 = new tptesttriangle(4, 3, 2);

		t4 = new tptesttriangle(-5, 0, 2);

	}

	@Test
	public void testn() {

		assertNotNull(t1.getType());
		assertNotNull(t2.getType());
		assertNotNull(t3.getType());
		assertNotNull(t4.getType());

	}

}
