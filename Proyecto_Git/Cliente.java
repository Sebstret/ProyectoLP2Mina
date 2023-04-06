class Cliente extends Usuario{
	private int idCliente;
	private String billingAddress;
	private String documento;
	private String defaultShippingAddress;

	public Cliente(int idUsuario, int DNI, String nombre, String email, String contraseña,
		int telefono, boolean activo,int idCliente, String billingAddress, String documento, String defaultShippingAddress){
		super(idUsuario,DNI,nombre,email,contraseña,telefono,activo);
		this.idCliente=idCliente;
		this.billingAddress=billingAddress;
		this.documento=documento;
		this.defaultShippingAddress=defaultShippingAddress;
	}

}