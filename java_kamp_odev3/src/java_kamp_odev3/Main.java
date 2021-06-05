package java_kamp_odev3;

public class Main {

	public static void main(String[] args) {

		User user=new User();
		user.setId(1);
		user.setName("özlem");
		user.setRol("öðrenci");
		
		StudentManager sm=new StudentManager();
		sm.add(user);
		System.out.print("------------------");
		
		InstructorManager im=new InstructorManager();
		im.student_add(user);
        System.out.println("*****");
        
        im.dell(user);
       
	}

}
