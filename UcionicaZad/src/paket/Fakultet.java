package paket;

import java.util.ArrayList;
import java.util.List;

public class Fakultet {
	String naziv;
	String skracenica;
	int godOsn;
	int brStud;
	List<Ucionica> ucionice;
	public Fakultet(String naziv, String skracenica, int godOsn, int brStud) {
		this.naziv = naziv;
		this.skracenica = skracenica;
		this.godOsn = godOsn;
		this.brStud = brStud;
		this.ucionice = new ArrayList<>();
	}
	public Fakultet() {
		
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		this.skracenica = skracenica;
	}
	public int getGodOsn() {
		return godOsn;
	}
	public void setGodOsn(int godOsn) {
		this.godOsn = godOsn;
	}
	public int getBrStud() {
		return brStud;
	}
	public void setBrStud(int brStud) {
		this.brStud = brStud;
	}
	public List<Ucionica> getUcionice() {
		return ucionice;
	}
	public void setUcionice(List<Ucionica> ucionice) {
		this.ucionice = ucionice;
	}
	
	public int getBrUcionica() {
	
		return ucionice.size(); 
	}
	public void dodajUcionicu(Ucionica u ) {
		if(ucionice.contains(u)) {
			return;
		}else
		ucionice.add(u);
	}
	
	public boolean imaMesta() {
		int ukupnoMesta = 0;
		for(Ucionica u : ucionice) {
			ukupnoMesta += u.getKapacitet();
	}
		if(ukupnoMesta>brStud) {
			return true;
		}return false;
	}
	 
}
 