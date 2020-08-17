package aritmetica;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) throws IOException {
		
		Guia2();
		
	}
	
	public static void Guia2() throws IOException {
		
		CacularVariables calCacularVariables = new CacularVariables();
		double valorUno;
        double valorDos;
        double valorTres;
        double valorCuatro;
        
        System.out.println("Seleccione una opción para iniciar\n 1: Conversor a pulgada. \n 2: Area entre cuadrado y circulo.");
        System.out.println(" 3: Impuesto. \n 4: Restaurante. \n 5: Enteros hasta cero. \n 6: Enteros n.");
        System.out.println(" 7: Sueldos vendedores. \n 8: Contar pares.");
        
	    BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
        String opcion = reader.readLine();
       
        switch (opcion) {
		case "1":
			System.out.println("Ingrese valor en pulgadas: ");
			 valorUno = Double.valueOf(reader.readLine());
			 System.out.println("Ingrese unidad de medida: ");
			 System.out.println("(P) para Pies");
			 System.out.println("(C) para Centrimetros");
			 System.out.println("(L) para Leguas");
			 System.out.println("(Y) para Yardas");
	         String unidadMedida = reader.readLine();
			calCacularVariables.convertToPulgada(unidadMedida, valorUno);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;

		case "2":
			System.out.println("Ingrese el radio: ");
			 valorUno = Double.valueOf(reader.readLine());
			 calCacularVariables.areaEntreCirculoCuadrado(valorUno);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		case "3":
			System.out.println("Ingrese el valor bruto del vehiculo: ");
			 valorUno = Double.valueOf(reader.readLine());
			 System.out.println("Ingrese el tipo de vehiculo: ");
			 System.out.println("(A) Automovil");
			 System.out.println("(C) Camioneta");
			 String tipoVehiculo = reader.readLine();
			calCacularVariables.impuestoPrecioNeto(valorUno, tipoVehiculo);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		case "4":
			 System.out.println("Ingrese el tipo de comida a solicitar: ");
			 System.out.println("(V) Vetariana");
			 System.out.println("(N) No vegeratiana");
			 System.out.println("(R) Rapida");
			 String tipoPlato = reader.readLine();
			calCacularVariables.restaurante(tipoPlato);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		case "5":
			System.out.println("Ingrese dos valores deseados, para calcular ingrese 0:");
			calCacularVariables.enterosHastaCero();
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		case "6":
			System.out.println("Ingrese la cantida de numeros que desea ingresar: ");
			 valorUno = Double.valueOf(reader.readLine());
			calCacularVariables.mayorMenor(valorUno);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		case "7":
			System.out.println("Ingrese el numero de vendedores: ");
			 valorUno = Double.valueOf(reader.readLine());
			calCacularVariables.sueldosComisiones(valorUno);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;

		case "8":
			System.out.println("Ingrese los numeros para contar y sumar, pares e impares: ");
			 valorUno = Double.valueOf(reader.readLine());
			 calCacularVariables.paresImpares(valorUno);
			System.out.println("\n");
			System.out.println("Volver al menu");
			reader.readLine();
			for (int i = 0; i < 15; i++) {
				System.out.println("\n");
			}
			Guia2();
			break;
			
		default:
			break;
		}

	}
}
