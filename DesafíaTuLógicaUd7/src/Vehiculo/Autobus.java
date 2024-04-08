package Vehiculo;

public class Autobus extends Vehiculo{

	//numero id de autobus
	private int numero;
		
		 //Numero de paradas que realiza el bus
	private int numParadas ;
		
		
	public Autobus(String marcaVehiculo, String modeloVehiculo, String numeroBastidor, int numeroPuertas, int numero,int numParadas){
		super(marcaVehiculo, modeloVehiculo, numeroBastidor, numeroPuertas);
		this.numero=numero ;
		this.numParadas=numParadas;
		
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumParadas() {
		return numParadas;
	}

	public void setNumParadas(int numParadas) {

		this.numParadas = numParadas;
	}
	
	

	public String toString() {
		return "-----------AUTOBÚS-----------\n"+super.toString()+"; Número "+numero+";Número de paradas "+numParadas;
	}
	
}
