//Dado un String y una letra, contar la cantidad de apariciones
//de la letra en el String

package Ej03_Arrays_Strings;

public class Ej1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "Hola qué tal?";
		char letra = 'a';
		boolean flag = false;
		int cont = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == letra) {
				flag = true;
				cont++;
			}
			flag = false;
		}
		System.out.println("La letra \"" + letra + "\" se repite " + cont + " veces.");
		
	}

}
