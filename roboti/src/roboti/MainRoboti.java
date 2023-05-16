package roboti;

public class MainRoboti {

	public static void main(String[] args) {
		Roboti r = new Roboti("R1",Boje.PLAVA,80);
		r.aboutMe();
		r.setIme("R2");
		r.aboutMe();
	}
}
