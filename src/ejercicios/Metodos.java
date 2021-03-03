package ejercicios;

public class Metodos {

	public static void main(String[] args) {

		System.out.println(concatenacion("hola", "amigo"));
		
		System.out.println(caracterDevuelto(64));
		
		System.out.println(numeroDevuelto('b'));
	}

	public static String concatenacion(String palabra1, String palabra2) {
		
		return palabra1 + " " +  palabra2;
	}
	
	public static char caracterDevuelto(int numero) {
		
		return (char) numero;
	}
	
	public static int numeroDevuelto(char caracter) {
		
		return (int) caracter;
	}
}
