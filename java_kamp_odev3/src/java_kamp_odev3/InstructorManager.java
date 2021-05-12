package java_kamp_odev3;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println("ödev eklendi");
	
	}

	
	@Override
	public void dell(User user) {
	
		System.out.println("ödev silindi");
	}
	
	public void student_add(User user) {
		int a=user.getId();
	String b=	user.getName();
	String c=	user.getRol();
		System.out.println("öðrenci eklendi eklendi"+a+" "+b+" "+c+" ");

		
	}
	
	
}
