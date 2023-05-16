package paket;

public class Main {
public static void main(String[] args) {
	
	Ucionica u = new Ucionica("RAF2",25);
	Ucionica u1 = new Ucionica("RAF3",25);
	Ucionica u2 = new Ucionica("RAF4", 20);
Grupa g = new Grupa("128");
	Fakultet raf = new Fakultet("Racunarski fakltet", "RAF", 2004, 100);
	raf.dodajUcionicu(u);
	raf.dodajUcionicu(u1);
	raf.dodajUcionicu(u2);
	
	Student s = new Student("Dusan", "Dragomirovic", 216, "RI", 2022);
	Student s1 = new Student("Dimitrije", "Ivanovic", 118, "Arh", 2019);
	Student s2 = new Student("Moj", "Otac", 69, "Pmf", 2022);

	s.siPrepisivao();
	s.radiIspit();
	s1.siPrepisivao();
	s1.radiIspit();
	s2.siPrepisivao();
	s2.radiIspit();
System.out.println(((Student)s).prepisivac);
System.out.println(((Student)s).uhvacen);
System.out.println(((Student)s1).prepisivac);
System.out.println(((Student)s1).uhvacen);
System.out.println(((Student)s2).prepisivac);
System.out.println(((Student)s2).uhvacen);
	
g.dodajStudenta(s);
g.dodajStudenta(s1);
g.dodajStudenta(s2);
g.odrziIspit();

	
	System.out.println(raf.getBrUcionica());
	System.out.println("da li ima dovoljno mesta? "+raf.imaMesta());
}
}
