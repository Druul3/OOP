package paket;

public class Krug implements GeometrijskiOblici {

	double a;
	double pi = 3.14;
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double izracunajPovrsinu() {

		return a*a*pi;
	}

	@Override
	public double izracunajObim() {
		return 2*a*3.14;
	}

	public Krug(double a) {
		super();
		this.a = a;
	}

	
}
