import java.util.Date;
class DetallePedido{
	private int idDetallePedido;
	private int orderId;
	private String shippingAddres;
	private String shippingType;
	private double shippingCost;
	private String billingAddress;
	private Date createdDate;

	public DetallePedido(int idDetallePedido, int orderId, String shippingAddres, 
		String shippingType, double shippingCost, String billingAddress, Date createdDate){
		this.idDetallePedido=idDetallePedido;
		this.orderId=orderId;
		this.shippingAddres=shippingAddres;
		this.shippingType=shippingType;
		this.shippingCost=shippingCost;
		this.billingAddress=billingAddress;
		this.createdDate=createdDate;
	}
}

