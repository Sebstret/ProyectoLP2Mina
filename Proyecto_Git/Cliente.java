import java.util.ArrayList;

class Cliente extends Usuario{
	private String direccionDeEntregaPorDefecto;
	private String ciudad;
	private String distrito;
	private ArrayList<Pedido> pedidosRealizados;

	public Cliente(int idUsuario, int DNI, String nombre, String email, String contraseña,
		int telefono, boolean activo, String direccionDeEntregaPorDefecto, String ciudad, String distrito){
		super(idUsuario,DNI,nombre,email,contraseña,telefono,activo);
		this.direccionDeEntregaPorDefecto = direccionDeEntregaPorDefecto;
		this.ciudad = ciudad;
		this.distrito = distrito;
	}
	
	// Getters y Setters respectivos
	
	@Override
	public void consultarDatosPersonales(){
	}
	
	@Override
	public void editarDatosPersonales(){
	}
	
	@Override
	public void consultarHistorial(){
		// En el caso del cliente consulta su historial de compras
	}
	
	public void registrarPedido(Pedido pedido){
	}
	
	public void verPedidos(){
	}
	
	public void confirmarPedidos(){
	}
	
	public void pagarPedido(Pedido pedido){
	}
	
	public void cancelarPedido(Pedido pedido){
	}
	
	public void calificarVendedor(Vendedor vendedor){
	}
	
	public void consultarDatosEnvio(Pedido pedido){
	}
	
	public String emitirReportePedidos(){
	}
}
