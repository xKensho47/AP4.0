//Dados 3 numeros y un orden, que ordene los mismos y 
//los retorne en un vector de 3
package Ej03_Arrays_Strings;

public class Ej1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 1, n2 = 2, n3 = 3;
		String orden = "Decreciente";
		int[] vec = new int[3];
		
		if(orden.equals("Decreciente")) {
			if(n1 > n2 && n2 > n3) {
				vec[0] = n1;
				vec[1] = n2;
				vec[2] = n3;
			}
			else if(n1 > n3 && n3 > n2) {
				vec[0] = n1;
				vec[1] = n3;
				vec[2] = n2;
			}
			else if(n2 > n1 && n1 > n3) {
				vec[0] = n2;
				vec[1] = n1;
				vec[2] = n3;
			}
			else if(n2 > n3 && n3 > n1) {
				vec[0] = n2;
				vec[1] = n3;
				vec[2] = n1;
			}
			else if(n3 > n1 && n1 > n2 ) {
				vec[0] = n3;
				vec[1] = n1;
				vec[2] = n2;
			}
			else {
				vec[0] = n3;
				vec[1] = n2;
				vec[2] = n1;
			}
			
		}
		else if(orden.equals("Ascendente")) {
			if(n1 < n2 && n2 < n3) {
				vec[0] = n1;
				vec[1] = n2;
				vec[2] = n3;
			}
			else if(n1 < n3 && n3 < n2) {
				vec[0] = n1;
				vec[1] = n3;
				vec[2] = n2;
			}
			else if(n2 < n1 && n1 < n3) {
				vec[0] = n2;
				vec[1] = n1;
				vec[2] = n3;
			}
			else if(n2 < n3 && n3 < n1) {
				vec[0] = n2;
				vec[1] = n3;
				vec[2] = n1;
			}
			else if(n3 < n1 && n1 < n2 ) {
				vec[0] = n3;
				vec[1] = n1;
				vec[2] = n2;
			}
			else {
				vec[0] = n3;
				vec[1] = n2;
				vec[2] = n1;
			}
		}
		for(int i=0; i<vec.length; i++)
			System.out.print(vec[i] + " ");

	}

}
