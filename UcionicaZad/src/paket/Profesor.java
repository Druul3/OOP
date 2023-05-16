package paket;

public class Profesor extends Predavac{
	
	int godStaza;
	
	public Profesor(String ime, String prezime, int godStaza) {
		
		super(ime, prezime);
		this.godStaza = godStaza;
	}

	
	@Override
	public void dodajPredmet(Predmet p) {
		  
		super.dodajPredmet(p);
	}

	}
	
	

