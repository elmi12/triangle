package tpintegration;

public class tptesttriangle {

	private double l1, l2, l3;

	public tptesttriangle(double a, double b, double c) {

		l1 = a;

		l2 = b;

		l3 = c;
	}

	public ttriangle getType() {

		if (l1 == l2 && l2 == l3) {
			return ttriangle.Equilateral;

		}

		if (l1 == l2 && l2 != l3 && l3 != l1) {
			return ttriangle.Isoceles;

		}

		if (l1 != l2 && l2 != l3 && l3 != l1) {
			return ttriangle.scalene;

		}

		if (l1 <= 0 && l1 != l2 && l2 != l3) {
			return ttriangle.invalid;

		}
		
		else {
			return ttriangle.rectangle;
		}

	}
}
