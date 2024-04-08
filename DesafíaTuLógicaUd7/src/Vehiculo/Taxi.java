package Vehiculo;

public final class Taxi extends Turismo implements Calculable,Iniciable{
	
	private final double ImporteInicio=2 ;
	private double kmRecorridos;
	private double importeKm;
	
	public Taxi(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas,TipoAsientos asiento,	double kmRecorridos,double importeKm) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas,asiento);
		this.kmRecorridos=kmRecorridos;
		this.importeKm=importeKm;
	}

	
	public double getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(double kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public double getImporteKm() {
		return importeKm;
	}

	public void setImporteKm(double importeKm) {
		this.importeKm = importeKm;
	}

	public double getImporteInicio() {
		return ImporteInicio;
	}
	
	double calcularPrecioAlquiler(int dias) {
		
		return dias*50;
	}
	
	int getMaxVelicidad() {
		
		return 200;
	}

	public void ReiniciarContador(double kilometros) {
		System.out.println("--Se procede a reiniciar kilometraje del taxi con un total de "+kilometros+" km");
		System.out.println("\n--Reiniciando kilometraje.....");		
	}

	public double calcularCosteTrayecto() {
		return ImporteInicio+(kmRecorridos*importeKm);
	}
	
	public String toString(){
		return "------------TAXI------------ \n"+super.toString()+"; Importe Inicio: "+ImporteInicio+"; Importe kilómetros: "+importeKm+
					"; Km.Recorridos: "+kmRecorridos+"; Coste del trayecto:"+ calcularCosteTrayecto()+" € \n";
	}
	
	

}
