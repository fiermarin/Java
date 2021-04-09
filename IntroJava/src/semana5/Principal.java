package semana5;

public class Principal {

	public static void main(String[] args) {
		int[] mi_array_enteros = {5,10,15,6,8,22};
		String[] mi_array_string = {"azul", "amarillo", "rosado", "verde", "naranja"};
		
		int[] respuesta_int = sumaEnteros(mi_array_enteros);		//Declaro el array respuesta y espero la respuesta de la funcion SumaEnteros a la cual le paso el array "mi_array_enteros"
		
		for(int i=0;i<respuesta_int.length;i++) {					//Recorro el array respuesta y muestro los datos 
			System.out.println(respuesta_int[i]);
		}
		
		imprimirColores(mi_array_string);			// PRUEBA
	}
	
	public static int[] sumaEnteros(int[] array_enteros) {
		int[] numero = new int[2];									//Declaro el array numero el cual voy a devolver
		int suma=0;													//Declaro la variable suma la cual va a contener la suma del array_enteros
		
		for(int i=0; i<array_enteros.length;i++) {					//Recorro el array_enteros
			if(array_enteros[i] > 11) {								//Si el valor es mayor a 11 entro al if y lo agrego al array numero
				numero[0] = array_enteros[i];
				break;												//Salgo del for para que solamente agregue el primer numero
			}
		}
		
		for(int i=0; i<array_enteros.length;i++) {					//Recorro el array_enteros nuevamente y hago la suma en esta variable
			suma += array_enteros[i];
		}
		
		numero[1] = suma;											//Agrego la variable suma al array numero
		return numero;
	}
	
	public static void imprimirColores(String[] array_string) {
		for(int i=0; i<array_string.length; i++) {					//Recorro el array
			if(array_string[i].substring(0).startsWith("v")) {		//Chequeo si la palabra empieza con "v" si es asi entro al if y la imprimo en pantalla 
				System.out.println(array_string[i]);
			}else if(array_string[i].contains("l")) {				//Chequeo si la palabra contiene la letra "l" si es asi entro al if y la imprimo en pantalla
				System.out.println(array_string[i]);
			}
		}
	}

}
