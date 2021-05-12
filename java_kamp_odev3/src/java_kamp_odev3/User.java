package java_kamp_odev3;

public class User {

	private int id;
	private String name;
	private String rol;
	private String email;
	private String password;
	
	
	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public User(int id, String name, String rol, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.rol = rol;
		this.email = email;
		this.password = password;
	}

	public User() {}

	public User(int id, String name, String rol) {
		super();
		this.id = id;
		this.name = name;
		this.rol = rol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	
}


