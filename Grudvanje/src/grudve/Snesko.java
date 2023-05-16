package grudve;

public class Snesko {

	String naziv;
	double snaga;
	double brZivota;
	
	public String getNaziv() {
		return naziv;
	}
	public double getSnaga() {
		return snaga;
	}
	public double getBrZivota() {
		return brZivota;
	}
	public Snesko(String naziv, double snaga, double brZivota){
		this.naziv = naziv;
		this.snaga = snaga;
		this.brZivota = brZivota;
		
	}
	public boolean siZiv() {
	if(brZivota != 0.0) {
		return true;
	}
	return false;

	}
	public void ukloniZivote(double x){
		this.brZivota -= x;
		if(this.brZivota <0.0)
			this.brZivota = 0.0;
	}
	public void ukloniZivoteCrit(double x){
		this.brZivota -= x*0.5;
		if(this.brZivota <0)
			this.brZivota = 0;
	}
	public void gadjaj(Snesko sneskoMeta) {
		sneskoMeta.ukloniZivote(this.snaga);
}
	public void gadjajCrit(Snesko sneskoMeta) {
		sneskoMeta.ukloniZivoteCrit(this.snaga);
}

}



