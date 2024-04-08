package Vehiculo;

public abstract class Turismo extends Vehiculo {
	
 enum TipoAsientos {
		
		RECLINABLE,CUERO,CALEFACCION;
		
	}
	TipoAsientos asiento ;
	
	
	public TipoAsientos getTipoAsientos() {
	return asiento;
}
			
	public Turismo(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, TipoAsientos asiento) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas);
		this.asiento=asiento ;
	}

	public String toString() {
		return super.toString()+"; Tipo de asiento: "+ getTipoAsientos().name();
	}



	public Turismo(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas);
	
	}

	abstract double calcularPrecioAlquiler(int dias);
	
	abstract int getMaxVelicidad();
	
	
	
		

}
	