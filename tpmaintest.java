package tpintegration;

public class tpmaintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		tptesttriangle t1 = new tptesttriangle(2, 2, 2);

		System.out.println("on a un triangle" + t1.getType());

		tptesttriangle t2 = new tptesttriangle(3, 3, 2);

		System.out.println("on a un triangle" + t2.getType());

		tptesttriangle t3 = new tptesttriangle(4, 3, 2);

		System.out.println("on a un triangle" + t3.getType());

		tptesttriangle t4 = new tptesttriangle(0, -3, 2);

		System.out.println("on a un triangle" + t4.getType());
	}

}
