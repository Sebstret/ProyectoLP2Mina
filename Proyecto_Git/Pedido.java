import java.util.ArrayList;
import java.util.Date;
class Pedido{
	private int idPedido;
	private Date fechaPedido;
	private Date fechaEntrega;
	private String direccionEntrega;
	private EstadoPedido estado;
	private Cliente cliente;
	private Vendedor vendedor;
	private double total;
	private ArrayList<Producto> productos;

	public Pedido (int idPedido, Date fechaPedido, Date fechaEntrega, String direccionEntrega,
		EstadoPedido estado, Cliente cliente, Vendedor vendedor, double total, ArrayList<Producto> productos){
		this.idPedido=idPedido;
		this.fechaPedido=fechaPedido;
		this.fechaEntrega=fechaEntrega;
		this.direccionEntrega=direccionEntrega;
		this.estado=estado;
		this.cliente=cliente;
		this.vendedor=vendedor;
		this.total=total;
		this.productos=productos;
	}
}