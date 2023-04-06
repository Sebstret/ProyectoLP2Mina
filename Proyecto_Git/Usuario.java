class Usuario{
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

}