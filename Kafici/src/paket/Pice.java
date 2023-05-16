package paket;

public class Pice {

	
	protected String naziv;
	protected String brend;
	protected Ukus ukus;
	
	
	public Pice(String naziv, String brend, Ukus ukus) {
		super();
		this.naziv = naziv;
		this.brend = brend;
		this.ukus = ukus;
	}

	public void opisiPice() {
		System.out.println("Pice "+ naziv + " je brenda " + brend + " ukusa " + ukus.toString().toLowerCase());
	}

	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getBrend() {
		return brend;
	}


	public void setBrend(String brend) {
		this.brend = brend;
	}


	public Ukus getUkus() {
		return ukus;
	}


	public void setUkus(Ukus ukus) {
		this.ukus = ukus;
	}
	
	
}
