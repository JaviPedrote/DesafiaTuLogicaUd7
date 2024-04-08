package Vehiculo;

public class Particular extends Turismo implements Calculable,Iniciable {

	private double kmRecorridos;
	private double importeKm ;
	private String propietario;
	
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


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public boolean isConAireAcondicionado() {
		return conAireAcondicionado;
	}


	public void setConAireAcondicionado(boolean conAireAcondicionado) {
		this.conAireAcondicionado = conAireAcondicionado;
	}

	boolean conAireAcondicionado;
	public Particular(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas,
			TipoAsientos asiento,String propietario,boolean conAire) {
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas, asiento);
		this.conAireAcondicionado=conAire;
		this.propietario=propietario;
		
	}

	
	public void ReiniciarContador(double kilometros) {
		System.out.println("El particular tiene acumulado un total de "+kilometros);
		
	}

	
	public double calcularCosteTrayecto() {
		return 0;
	}

	
	double calcularPrecioAlquiler(int dias) {
		// TODO Auto-generated method stub
		return 30*dias;
	}

	
	int getMaxVelicidad() {
		// TODO Auto-generated method stub
		return 220;
	}

	public String toString() {
		return "----------PARTICULAR----------\n"+super.toString()+ "; Km.Recorridos: "+kmRecorridos+"; Propietario: "
				+propietario+"; Aire Acondicionado: "+conAireAcondicionado+"\n";
	}
		
}
