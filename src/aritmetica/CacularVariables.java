package aritmetica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CacularVariables {
	
	 BufferedReader reader =   new BufferedReader(new InputStreamReader(System.in));
	public double convertToPulgada(String unidadMedida, double pulgadas) {
		
		double convertResult = 0.0;
		
		switch (unidadMedida) {
        case "P":
        	convertResult = (pulgadas *  0.0833);
        	System.out.println(pulgadas + " pulgadas, equivale a " + convertResult + " Pies.");
        break;
 
        case "C":
        	convertResult = (pulgadas *  2.54);
        	System.out.println(pulgadas + " pulgadas, equivale a " + convertResult + " Centimetros.");
        break;
        
        case "L":
        	convertResult = (pulgadas *  5.26094);
        	System.out.println(pulgadas + " pulgadas, equivale a " + convertResult + " Leguas.");
        break;
        
        case "Y":
        	convertResult = (pulgadas *  36);
        	System.out.println(pulgadas + " pulgadas, equivale a " + convertResult + " Yardas.");
        break;

        default:
        break;
		}
		
		return convertResult;		
	}
	
	public void areaEntreCirculoCuadrado(double radio) {
		double areaCirculo = (Math.PI * Math.pow(radio, 2));
		System.out.println("El area del circulo es: " + areaCirculo);
		double areaCuadrado = (2.0 * Math.pow(radio, 2));
		System.out.println("El area del circulo es: " + areaCuadrado);
		System.out.println("El area entre el circulo y el cuadrado es de: " + (areaCirculo - areaCuadrado));
	}

	public void impuestoPrecioNeto(double precioBruto, String tipoVehiculo) {

	 double valorImpuesto = 0.0;
	 double valorNeto = 0.0;
		 
	 switch (tipoVehiculo) {
	 case "C":
		 if(precioBruto > 80.0) {
			 valorImpuesto = (precioBruto * 0.5); 
		 }
     break;

     case "A":
    	 if(precioBruto < 20) {
    		 valorImpuesto = 5.0;
    	 }
    	 
    	 if(precioBruto >= 20.0 && precioBruto <= 20.0) {
    		 valorImpuesto = (precioBruto * 0.020); 
    	 }
    	 
    	 if(precioBruto > 40.0) {
    		 valorImpuesto = 9; 
    	 } 
    	 
     break;

     default:
     break;	
	}
	 
	valorNeto = precioBruto + valorImpuesto;
 	System.out.println("El impuesto es de : " + valorImpuesto + " pesos.");
 	System.out.println("El valor neto es de :" + valorNeto + " pesos.");
 	
	}
	
	public void restaurante(String tipoPlato) throws IOException {
		
		 double valorComida = 0.0;
		 double valorConDescuento = 0.0;
			
		 System.out.println("Ingrese el plato deseado: ");
		 switch (tipoPlato) {
		 case "V":
			 System.out.println("(S) Sopa de vegetales");
			 System.out.println("(E) Ensalda");
			 System.out.println("(J) Jugo");
			 String plato = reader.readLine();
			 System.out.println("¿Cuantos platos desea?");
			 double numPlatos = Double.valueOf(reader.readLine());
			 switch (tipoPlato) {
			 case "S":
				 valorComida = valorComida + (10000.0 * numPlatos);
			 break;
			 
			 case "E":
				 valorComida = valorComida + (25000.0 * numPlatos);
			 break;
			 
			 case "J":
				 valorComida = valorComida + (5000.0 * numPlatos);
			 break;
			 
		     default:
			 break;
			 }
			 
			 valorComida = valorComida + (valorComida * 0.19);
			 valorConDescuento = valorComida * 0.20;
			 valorComida = valorComida - valorConDescuento;
	     break;

	     case "N":
			 System.out.println("(C) Bandeja con carne");
			 System.out.println("(P) Bandeja con pollo");
			 String platon = reader.readLine();
			 System.out.println("¿Cuantos platos desea?");
			 double numPlatosn = Double.valueOf(reader.readLine());
			 switch (platon) {
			 case "C":
				 valorComida = valorComida + (30000.0 * numPlatosn);
			 break;
			 
			 case "P":
				 valorComida = valorComida + (28000.0 * numPlatosn);
			 break;
			 
		     default:
			 break;
			 }
			 
			 valorComida = valorComida + (valorComida * 0.19);
			 valorConDescuento = valorComida * 0.10;
			 valorComida = valorComida - valorConDescuento;
	     break;
	     
	     case "R":
			 System.out.println("(P) Perro caliente");
			 System.out.println("(H) Hamburquesa");
			 String plator = reader.readLine();
			 System.out.println("¿Cuantos platos desea?");
			 double numPlatosr = Double.valueOf(reader.readLine());
			 switch (plator) {
			 case "P":
				 valorComida = valorComida + (5000.0 * numPlatosr);
			 break;
			 
			 case "H":
				 valorComida = valorComida + (7000.0 * numPlatosr);
			 break;
			 
		     default:
			 break;
			 }
			 
			 valorComida = valorComida + (valorComida * 0.19);
	     break;

	     default:
	     break;	
	     }
		 
		 System.out.println("El valor total del pedido es: " + valorComida);
	}
	
	public void enterosHastaCero() throws NumberFormatException, IOException {
		double numero = 1;
		List<Double> positivos = new ArrayList<>();
		List<Double> negativo = new ArrayList<>();
		
		while(numero != 0) {
			numero = Double.valueOf(reader.readLine());
			if(numero > 0) {
				positivos.add(numero);
			}
			
			if(numero < 0) {
				negativo.add(numero);
			}
		}
		
		System.out.println("Numeros positivos: ");
		System.out.println("Numero \t\t N.Cubo");
		for (int i = 0; i < positivos.size(); i++) {
			System.out.println( positivos.get(i) + "\t\t" + Math.pow(positivos.get(i), 3));	
		}
		
		System.out.println("Numeros negativos: ");
		System.out.println("Numero \t\t N.Cuadrado");
		for (int i = 0; i < negativo.size(); i++) {
			System.out.println( negativo.get(i) + "\t\t" + Math.pow(negativo.get(i), 2));	
		}
	}
	
	public void mayorMenor(double a) throws NumberFormatException, IOException {
		double menor = 0;
		double mayor = 0;
		for (int i = 0; i < a; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ":");
			Double numero = Double.valueOf(reader.readLine());	
			if (menor == 0 && mayor == 0) {
				menor = numero;
				mayor = numero;
			}
			
			if (numero > mayor)
			{
				mayor = numero;
			}
			
			if (numero < menor)
			{
				menor = numero;
			}
				
			}
		
		System.out.println("El numero mayor fue: " + mayor);
		System.out.println("El numero menor fue: " + menor);		
		
	}
	
	public void sueldosComisiones(double a) throws NumberFormatException, IOException {
		List<Double> sueldos = new ArrayList<>();
		List<Double> comisiones = new ArrayList<>();
		
		Double totalSueldos = 0.0;
		Double totalComisiones = 0.0;
		
		for (int i = 0; i < a; i++) {
			System.out.println("Ingrese el sueldo del vendedor" + (i + 1) + ":");
			Double sueldo = Double.valueOf(reader.readLine());
			System.out.println("Ingrese el monto de ventas del vendedor " + (i + 1) + ":");
			Double totalVendido = Double.valueOf(reader.readLine());
			
			sueldos.add(sueldo);
			comisiones.add(totalVendido * 0.10);
			}	
		
		
		System.out.println("Empleado \t\t Sueldo \t\t Comision \t\t Total");
		for (int i = 0; i < sueldos.size(); i++) {
			totalSueldos = totalSueldos + sueldos.get(i);
			totalComisiones = totalComisiones + comisiones.get(i);
			
			System.out.println("Vendedor " + (i+1) + "\t\t" + sueldos.get(i) + "\t\t" + comisiones.get(i) + "\t\t" + (sueldos.get(i) + comisiones.get(i)));
		}
		
		System.out.println("\n Total sueldos : " + totalSueldos);
		System.out.println("Total comisiones : " + totalComisiones);
	}

	public void paresImpares(double a) throws NumberFormatException, IOException {
		
		double countPares = 0;
		double countImpares = 0;
		double sumPares = 0;
		double sumImpares = 0;
		
		for (int i = 0; i < a; i++) {
			System.out.println("Ingrese el numero " + (i + 1) + ":");
			Double numero = Double.valueOf(reader.readLine());	
			if ((numero % 2) == 0) {
				countPares = countPares + 1;
				sumPares = sumPares + numero;
			}else
			{
				countImpares= countImpares + 1;
				sumImpares = sumImpares + numero;				
			}
			}
		
		System.out.println("El numero de pares fue: " + countPares);
		System.out.println("El numero de impares fue: " + countImpares);
		System.out.println("El suma de pares fue: " + sumPares);
		System.out.println("El suma de impares fue: " + sumImpares);
				
	}
}