package ClayOb;

import javax.swing.JOptionPane;

public class Operacion {
	
	int numero1,numero2;
	int suma,resta,multiplicacion,division;
	
	
	
	public void leerNumeros() {
		
		numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		numero2= Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
	}

	public void sumar() {	
		suma=numero1+numero2;
	}	
	
	public void restar() {	
		resta=numero1-numero2;
	}	
	public void multiplicar() {	
		multiplicacion=numero1*numero2;
	}	
	public void dividir() {	
		division=numero1/numero2;
	}	
	
	public void mostrarResultados() {
		System.out.print("La Suma es:" +suma);
		System.out.print("\n");
		System.out.print("La Resta es:" +resta);
		System.out.print("\n");
		System.out.print("La Multiplicacion es:" +multiplicacion);
		System.out.print("\n");
		System.out.print("La divison es:" +division);
	}
}


