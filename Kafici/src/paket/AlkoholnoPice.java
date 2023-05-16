package paket;

public class AlkoholnoPice extends Pice {

	
	public double brPromila;
	public AlkoholnoPice(String naziv, String brend, Ukus ukus, double brPromila) {
		super(naziv, brend, ukus);
	this.brPromila = brPromila;
	
	}
	public double getBrPromila() {
		return brPromila;
	}
	public void setBrPromila(double brPromila) {
		this.brPromila = brPromila;
	}
	public boolean isJakoPice() {
		return brPromila>=10;
		}
	@Override
	public void opisiPice() {
		System.out.println("Pice "+ naziv + " je brenda " + brend + " ukusa " + ukus.toString().toLowerCase() + " sa " +brPromila+" promila." );
	}

}
