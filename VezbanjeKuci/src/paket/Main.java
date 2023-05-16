package paket;

public class Main {
public static void main(String[] args) {
	Osoba o = new Osoba("Petar","Petrovic",27,Pol.M,false);
	System.out.println(o.getIme() +"  "+ o.getPrezime() + ", " +o.getGod());
	String nacionalnost = o.odrediNacionalnost();
	System.out.println(nacionalnost);
	o.traziPosao(   );
}
}
