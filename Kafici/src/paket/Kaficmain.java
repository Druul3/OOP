package paket;

public class Kaficmain {
public static void main(String[] args) {
	Pice pice = new Pice ("Sok od jabuke", "Next", Ukus.VOCNO);
	pice.opisiPice();
	
	BezalkoholnoPice bp = new BezalkoholnoPice("Red Bull", "Red Bull", Ukus.NEUTRALNO, true);
	bp.opisiPice();
	
	BezalkoholnoPice bp1 = new BezalkoholnoPice("Sprite", "od Boga poslato", Ukus.PRELEPO, false);
	bp1.opisiPice();
	
	AlkoholnoPice ap = new AlkoholnoPice("Pivo", "Heiniken", Ukus.GORKO, 4.2);
	ap.opisiPice();
	System.out.println("Da li je " +ap .naziv+ " jako pice "+ap.isJakoPice());
	AlkoholnoPice ap1 = new AlkoholnoPice("Koktel", "Pina Colada", Ukus.PRELEPO, 11.2);
	ap1.opisiPice();
	System.out.println("Da li je " +ap1.naziv+ " jako pice "+ap1.isJakoPice());
	}
}
