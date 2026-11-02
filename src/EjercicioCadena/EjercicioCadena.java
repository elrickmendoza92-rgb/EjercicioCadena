package EjercicioCadena;

import java.util.Random;

public class EjercicioCadena {

	public static void main(String[] args) {
		// Aqui mando a llamar elmetodo a tu metodo para que se ejecute al darle RUN
			procesarCadena();
	}
		

		    public static void procesarCadena() {
		        // 1. Generar cadena aleatoria de tamaño 250
		        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
		        StringBuilder sb = new StringBuilder();
		        Random random = new Random();
		        
		        for (int i = 0; i < 250; i++) {
		            int index = random.nextInt(caracteres.length());
		            sb.append(caracteres.charAt(index));
		        }
		        String cadenaAleatoria = sb.toString();
		        System.out.println("Cadena generada:\n " + cadenaAleatoria);

		        // 2. Contar la cantidad de letras "A" y "a"
		        int contadorA = 0;
		        for (int i = 0; i < cadenaAleatoria.length(); i++) {
		            char c = cadenaAleatoria.charAt(i);
		            if (c == 'A' || c == 'a') {
		                contadorA++;
		            }
		        }
		        System.out.println("Cantidad de letras 'A' o 'a':\n " + contadorA);

		        // 3. Generar cadena inversa únicamente de los primeros 98 caracteres
		        int limite = Math.min(98, cadenaAleatoria.length());
		        String subcadena = cadenaAleatoria.substring(0, limite);
		        String cadenaInversa = new StringBuilder(subcadena).reverse().toString();
		        
		        System.out.println("Cadena inversa de los primeros 98 caracteres:\n " + cadenaInversa);
		    }
		

}
