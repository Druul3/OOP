package paket;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

public class Grupa{
	String nazivGr;
	List<Student> studenti;
	String data;
	
	
	
	public Grupa(String nazivGr) {
		this.nazivGr = nazivGr;
		studenti = new ArrayList<>();
	}

	public String getNazivGr() {
		return nazivGr;
	}

	public void setNazivGr(String nazivGr) {
		this.nazivGr = nazivGr;
	}

	public List<Student> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Student> studenti) {
		this.studenti = studenti;
	}

	public void dodajStudenta(Student student){
		if(studenti.contains(student)) {
			return;
		}else {studenti.add(student);
		System.out.println("Dodali ste studenta u grupu!" );
		}
	}
		public void ispisiStud(){
			for (int i = 0; i<studenti.size();i++) {
				System.out.println(studenti.get(i));

				
			}			
		}
		
		public void odrziIspit() {
			for (int i = 0; i<studenti.size();i++) {
				studenti.get(i).siPrepisivao();
				studenti.get(i).radiIspit();

				
			}	
		}
		public Student najboljiStudent() {
			double max = 0;
			int indeks = 0;
			for (Student student : studenti )  {
				
				if(max< student.getBrPoena()) {
					indeks = student.getBrIndeksa();
					max = student.getBrPoena();	
				}
				
			}
			
			
			return null;
			
		}
		public void ucitajGrupuIzFajla(String filePath) {
			String[] nesto = new String[5]; 
			try{

			File file = new File("assets.txt");
			Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			data = sc.nextLine();
			while(data.length()>0) {
				nesto = data.split(" ", 4);
				Student s = new Student(nesto[0], nesto[1],Integer.parseInt(nesto[2]), nesto[3], Integer.parseInt(nesto[4]));
				studenti.add(s);
				
			}
			}
		
		
		
		 
		}catch (FileNotFoundException e) {
			System.out.println("fsda");}
		Throwable e = null;
		e.printStackTrace();
		}

		
	}




