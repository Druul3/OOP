package paket;

public class Kvadrat implements GeometrijskiOblici {

	
	public Kvadrat(double a) {
		this.a = a;
	}

	double a;
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double izracunajPovrsinu() {

		return a*a;
	}

	@Override
	public double izracunajObim() {
		return 4*a;
	}

	
}

