package klkMobOp;

public abstract class Korisnik {

	private String brTel;
	private String ime;
	private String prezime;
	private String adresa;
	public Korisnik korisnik;
	public Korisnik(String brTel, String ime, String prezime, String adresa) {
	
		this.brTel = brTel;
		this.ime = ime;
		this.prezime = prezime;
		this.adresa = adresa;
	}
	
	private abstract void obaviRazgovor(Korisnik k, int brMin);
	
	
	
	
	
	
	
	
	
	public String getBrTel() {
		return brTel;
	}
	public void setBrTel(String brTel) {
		this.brTel = brTel;
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
	@Override
	public String toString() {
		return "Korisnik [brTel=" + brTel + ", ime=" + ime + ", prezime=" + prezime + ", adresa=" + adresa + "]";
	}
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	
}
