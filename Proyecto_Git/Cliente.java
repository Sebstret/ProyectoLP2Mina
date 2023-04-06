class Cliente extends Usuario{
	private String direccionDeEntregaPorDefecto;
	private String ciudad;
	private String distrito;
	public ArrayList<Pedido> pedidosRealizados;

	public Cliente(int idUsuario, int DNI, String nombre, String email, String contraseña,
		int telefono, boolean activo, String direccionDeEntregaPorDefecto, String ciudad, String distrito){
		super(idUsuario,DNI,nombre,email,contraseña,telefono,activo);
		this.direccionDeEntregaPorDefecto = direccionDeEntregaPorDefecto;
		this.ciudad = ciudad;
		this.distrito = distrito;
	}
	
	@Override
	public String consultarDatos(){
	}
	
	public void registrarPedido(){
	}
	
	public int buscarPedido(){
	}
	
	public void actualizarPedido(int idPedido){
	}
	
	public void eliminarPedido(){
	}
	
	public void puntuarVendedor(){
	}
}
