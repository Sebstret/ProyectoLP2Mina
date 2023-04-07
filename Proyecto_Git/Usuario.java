abstract class Usuario implements IConsultable{
	private int idUsuario;
	private int DNI;
	private String nombre;
	private String email;
	private String contraseña;
	private int telefono;
	private boolean activo;

	public Usuario(int idUsuario, int DNI, String nombre, String email, String contraseña,
		int telefono, boolean activo){
		this.idUsuario=idUsuario;
		this.DNI=DNI;
		this.nombre=nombre;
		this.email=email;
		this.contraseña=contraseña;
		this.telefono = telefono;
		this.activo= activo;
	}
	
	public abstract String consultarDatos();
	
	public abstract void editarUsuario();
	
	public abstract void consultarHistorial();
	
	public abstract void consultarDatosPersonales();
	
	public abstract void editarDatosPersonales();
	
	public void iniciarSesion(){
	}
	
	public void cerrarSesion(){
	}
	
	public void cambiarContraseña(String contraseña){
	}

}
