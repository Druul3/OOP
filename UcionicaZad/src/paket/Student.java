package paket;

import java.util.Random;

public class Student {
	
	public String ime;
	public String prezime;
	public int brIndeksa;
	public String smer;
	public int godUpisa;
	public boolean prepisivac;
	public double brPoena;
	public boolean uhvacen;
	public Student(String ime, String prezime, int brIndeksa, String smer, int godUpisa) {
		this.ime = ime;
		this.prezime = prezime;
		this.brIndeksa = brIndeksa;
		this.smer = smer;
		this.godUpisa = godUpisa;
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
	public int getBrIndeksa() {
		return brIndeksa;
	}
	public void setBrIndeksa(int brIndeksa) {
		this.brIndeksa = brIndeksa;
	}
	public String getSmer() {
		return smer;
	}
	public void setSmer(String smer) {
		this.smer = smer;
	}
	public int getGodUpisa() {
		return godUpisa;
	}
	public void setGodUpisa(int godUpisa) {
		this.godUpisa = godUpisa;
	}
	public boolean isPrepisivac() {
		return prepisivac;
	}
	public void setPrepisivac(boolean prepisivac) {
		this.prepisivac = prepisivac;
	}
	public double getBrPoena() {
		return brPoena;
	}
	public void setBrPoena(double brPoena) {
		this.brPoena = brPoena;
	}
	public boolean isUhvacen() {
		return uhvacen;
	}
	public void setUhvacen(boolean uhvacen) {
		this.uhvacen = uhvacen;
	}
	
	public void radiIspit(){
		
		if(prepisivac == true) {
			Random random = new Random();
			double uhvacenVr = random.nextDouble();
			if(uhvacenVr>=0.5) {
				setBrPoena(0.0);
				setUhvacen(true);
				System.out.println(ime+ " "+prezime+ " je uhvacen u prepisivanju i ima 0 poena");
			}else {
				
				double brP = random.nextDouble()*100;
				brP = Math.round(brP);
				setBrPoena(brP);
				setUhvacen(false);
System.out.println(ime+ " "+prezime+ " je postigao "+brP+" poena");
			}
			
		}else 
			{Random random = new Random();
			double NovBr = random.nextDouble()*100;
			NovBr = Math.round(NovBr);
			setBrPoena(NovBr);
			setUhvacen(false);
			System.out.println(ime+ " "+prezime+ " je postigao "+NovBr+" poena");
			}
			}
		
		boolean siPrepisivao() {
			
			Random random = new Random();
			double prepisivao = random.nextDouble();
			if(prepisivao <= 0.25) {
				setPrepisivac(true);
				return true;
		}else setPrepisivac(false);
		return false;
		
	}

	
}
