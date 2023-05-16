package paket;

public class Ucionica {
	

		
		String naziv;
		int kapacitet;
		int sprat;
		
		public Ucionica(String naziv, int kapacitet) {
			this.naziv = naziv;
			this.kapacitet = kapacitet;
			}
		
		public boolean smestiStudente(int brStud) {
			if (brStud>this.kapacitet) {
				return false;
			}else return true;
		}

		public String getNaziv() {
			return naziv;
		}

		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}

		public int getKapacitet() {
			return kapacitet;
		}

		public void setKapacitet(int kapacitet) {
			this.kapacitet = kapacitet;
		}

		public int getSprat() {
			return sprat;
		}

		public void setSprat(int sprat) {
			this.sprat = sprat;
		}
}


