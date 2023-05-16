package paket;

public class BezalkoholnoPice extends Pice{

	protected boolean energetsko;
	
	public BezalkoholnoPice(String naziv, String brend, Ukus ukus, boolean energetsko) {
		super(naziv, brend, ukus);
	this.energetsko = energetsko;
	}

	public boolean isEnergetsko() {
		return energetsko;
	}

	public void setEnergetsko(boolean energetsko) {
		this.energetsko = energetsko;
	}
	
	@Override
	public void opisiPice() {
			System.out.println("Pice "+ naziv + " je brenda " + brend + " ukusa " + ukus.toString().toLowerCase() + " da li je energetsko? " +energetsko );
		}	
}
