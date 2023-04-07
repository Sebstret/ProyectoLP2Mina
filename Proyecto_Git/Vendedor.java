import java.util.ArrayList;
import java.util.Date;

class Vendedor extends Usuario{
	private String nombreNegocio;
	private String RUC;
	private String direccion;
	private Date fechaRegistro;
	private ArrayList<Producto> productos;
	
	public Vendedor(int idUsuario, int DNI, String nombre, String email, String contraseña,
		int telefono, boolean activo, String nombreNegocio, String RUC , String direccion,Date fechaRegistro,
		ArrayList<Producto> productos){
		super(idUsuario,DNI,nombre,email,contraseña,telefono,activo);
		this.nombreNegocio=nombreNegocio;
		this.RUC=RUC;
		this.direccion=direccion;
		this.fechaRegistro=fechaRegistro;
		this.productos=productos;
	}
	
	@Override
	public String consultarDatosPersonales(){
	}
	
	@Override 
	public void editarDatosPersonales(){
	}
	
	@Override 
	public void consultarHistorial(){
		// En el caso del vendedor consulta el historial de ventas
	}
	
	public void añadirProducto(Producto producto){
	}
	
	public void actualizarProducto(Producto producto){
	}
	
	public void eliminarProducto(Producto producto){
	}
	
	public void consultarDatosComprador(Pedido pedido){
	}
	
	public void generarFactura(Pedido pedido){
	}
	
	public void procesarPago(Pedido pedido, double monto){
	}
	
	public void enviarProductos(Producto producto, Pedido pedido){
	}
}
