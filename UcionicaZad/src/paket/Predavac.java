package paket;

import java.util.ArrayList;
import java.util.List;

public class Predavac {

	
	protected String ime;
	protected String prezime;
	 List<Predmet> predmeti;

	public Predavac(String ime, String prezime) {
		
		this.ime = ime;
		this.prezime = prezime;
		predmeti = new ArrayList<>();
	
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public List<Predmet> getPredmeti() {
		return predmeti;
	}

	public void setPredmeti(List<Predmet> predmeti) {
		this.predmeti = predmeti;
	}
	public void dodajPredmet(Predmet p) {
		predmeti.add(p);
	}
}

