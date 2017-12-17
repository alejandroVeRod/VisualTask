package Dominio;

public class Usuario {

	private String nombre;
	private String apellidos;
	private String DNI;
	private String password;
	private String email;
	private int edad;
	
	public Usuario(String nombre, String apellidos, String dNI, String password, String email, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.password = password;
		this.email = email;
		this.edad = edad;
	}
	public Usuario(String nombre,String apellidos) {
		this.nombre=nombre;
		this.apellidos=apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", password=" + password
				+ ", email=" + email + ", edad=" + edad + "]";
	}
	
}
