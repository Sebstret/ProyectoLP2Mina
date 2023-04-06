class Producto{
	private int idProducto;
	private String nombre;
	private String categoria;
	private double precioUnitario;
	private String descripcion;
	private Marca marca;
	private int stock;

	public Producto(int idProducto, String nombre, String categoria, double precioUnitario, 
		String descripcion, Marca marca, int stock){
		this.idProducto=idProducto;
		this.nombre=nombre;
		this.categoria=categoria;
		this.precioUnitario=precioUnitario;
		this.descripcion=descripcion;
		this.marca=marca;
		this.stock=stock;
	}
}