package java_kamp_odev3;

public class StudentManager extends UserManager {

	
	@Override
	public void add(User user) {
		System.out.println("�dev eklendi");
	
	}

	
	@Override
	public void dell(User user) {
	
		System.out.println("�dev silindi");
	}
}
