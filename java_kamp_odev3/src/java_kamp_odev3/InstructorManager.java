package java_kamp_odev3;

public class InstructorManager extends UserManager{
	
	@Override
	public void add(User user) {
		System.out.println("�dev eklendi");
	
	}

	
	@Override
	public void dell(User user) {
	
		System.out.println("�dev silindi");
	}
	
	public void student_add(User user) {
		int a=user.getId();
	String b=	user.getName();
	String c=	user.getRol();
		System.out.println("��renci eklendi eklendi"+a+" "+b+" "+c+" ");

		
	}
	
	
}
