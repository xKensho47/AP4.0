//Dado un vector de números, y un número X, que sume todos los  
//números > X y retorne el resultado
package Ej03_Arrays_Strings;

public class Ej1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vec = new int[5];
		vec[0] = 24;
		vec[1] = 32;
		vec[2] = 12;
		vec[3] = 57;
		vec[4] = 35;
		
		int X = 25, suma = 0;
		
		for(int i=0; i < vec.length; i++) {
			if(vec[i] > X ) {
				suma += vec[i];
			}
		}
		System.out.println("La suma de los numeros mayores a X es de: " +suma);

	}

}
