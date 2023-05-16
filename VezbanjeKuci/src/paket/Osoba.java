package paket;

public class Osoba {
	
	private String ime;
	private String prezime;
	private int god;
	private String adresa;
	private boolean zaposlen;
	private Pol pol;
	private String nacionalnost;

	public Osoba(String ime, String prezime, int god, Pol pol, boolean zaposlen){
		this.ime = ime;
		this.prezime = prezime;
		this.god = god;
		this.pol = pol;
		this.zaposlen = zaposlen;
		
		
	}
	public String odrediNacionalnost() {
		if(pol == Pol.M) {
			nacionalnost = "Srbin";
		}
		else nacionalnost = "Srpkinja";
		
		return nacionalnost;
	}
	public boolean traziPosao() {
		if(!zaposlen && god > 25) {
			System.out.println("trazim posao");
			return true;
		}
		return false ;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {     
		return prezime;
	}
	public int getGod() {     
		return god;
	}
	public String getAdresa() {
		return adresa;
	}
	public boolean isZaposlen() {
		return zaposlen;
	}
	public Pol getPol() {
		return pol;
	}
	public String getNacionalnost() {
		return nacionalnost;
	}
}
