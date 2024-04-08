package Vehiculo;

public abstract class Vehiculo {
	private String marcaVehiculo ;
	private String modeloVehiculo;
	private String numeroBastidor;
	private int numeroPuertas;
	private static int vehiculosFuncionando=0; //Con static podamos usar este atributo y el getter en la clase Main
	
	 public Vehiculo(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas) {
		this.marcaVehiculo = marcaVehiculo;
		this.modeloVehiculo = modeloVehiculo;
		this.numeroBastidor = numeroBastidor;
		this.numeroPuertas = numeroPuertas;
		vehiculosFuncionando++;
	}

	 public Vehiculo() {
		 
	 }
	
	 
	public String getMarcaVehiculo() {
		return marcaVehiculo;
	}

	public void setMarcaVehiculo(String marcaVehiculo) {
		this.marcaVehiculo = marcaVehiculo;
	}

	public String getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(String modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

//Con static podamos usar este atributo y el getter en la clase Main
	public static String getVehiculosFuncionando() {
		return "Total de vehículos alquilados o funcionando: "+vehiculosFuncionando ;
	}

	public void setVehiculosFuncionando(int vehiculosFuncionando) {
		Vehiculo.vehiculosFuncionando = vehiculosFuncionando;
	}
	

		public String toString(){
		return "Marca: "+marcaVehiculo+"; Modelo: "+ modeloVehiculo+"; Num. Bastidor: "+numeroBastidor+"; Num. Puertas: "+numeroPuertas; }


}