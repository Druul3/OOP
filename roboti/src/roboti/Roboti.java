package roboti;

public class Roboti {

	private	String ime;
	private Boje boja;
	private int tezina;

	public Roboti(String ime, Boje boja, int tezina) {
	this.ime = ime;
	this.boja = boja;
	this.tezina = tezina;

	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Boje getBoja() {
		return boja;
	}

	public void setBoja(Boje boja) {
		this.boja = boja;
	}

	public int getTezina() {
		return tezina;
	}

	public void aboutMe() {
		System.out.println("Zdravo, ja sam robot" + boja + "boje, zovem se " + ime + "i tezak sam " +tezina );

	}
}
