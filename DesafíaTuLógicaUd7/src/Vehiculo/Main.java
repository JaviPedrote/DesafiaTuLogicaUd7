package Vehiculo;

import javax.swing.JOptionPane;

import Vehiculo.Turismo.TipoAsientos;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Taxi tax1 = new Taxi("Volkswagen", "Pasat", "73464T730H", 3 , TipoAsientos.RECLINABLE, 120 , 1.50);
		Taxi tax2 = new Taxi("Seat", "Ibiza", "555Y903RE", 5 , TipoAsientos.CUERO, 210 , 1.20);
		
		Particular par1 = new Particular("Citroen", "C5", "hdgd94353fd", 5 , TipoAsientos.RECLINABLE, "Antonio", true);
		Particular par2 = new Particular("Renault", "Clio", "qwerty9090", 5 , TipoAsientos.CALEFACCION, "Francisco", true);

		Autobus bus1 =new Autobus("Volvo","9999", "jfhfgdv734743kmv", 3, 73, 12);
		
		System.out.println(tax1);
		System.out.println(tax2);
		System.out.println(par1);
		System.out.println(par2);
		System.out.println(bus1);		
		System.out.println();
		System.out.println(Vehiculo.getVehiculosFuncionando());
		tax1.ReiniciarContador(25000);
		System.out.println("El coste del trayecto es "+tax1.calcularCosteTrayecto());
		par1.setPropietario("Javier");
		System.out.println(par1);
		
		
	//-------Calcular precio para alquilar un particular o un taxi--------
		
		int eleccion= Integer.parseInt(JOptionPane.showInputDialog("¿Que vehículo le gustaría alquilar?"
				+ "\n\"Si quiere alquilar un particular pulse 1, si quiere alquilar un taxi pulse 2\""));
		
		switch (eleccion) {
		case 1:
			int diasPar = Integer.parseInt(JOptionPane.showInputDialog("A seleccionado alquilar un particular.\n¿Cuantos dias querría alquilarlo? "));
			
			System.out.println("Alquilar un particular "+diasPar+" dias son "+par1.calcularPrecioAlquiler(diasPar)+" €");
			
			break ;
		case 2:
			int diasTax = Integer.parseInt(JOptionPane.showInputDialog("A seleccionado alquilar un taxi.\n¿Cuantos dias querría alquilarlo? "));
			
			System.out.println("Alquilar un taxi "+diasTax+" dias son "+tax1.calcularPrecioAlquiler(diasTax)+" €");
			
			break ;
		default:
			System.out.println("La opción no es correcta");
		}
		
		
	}

}
