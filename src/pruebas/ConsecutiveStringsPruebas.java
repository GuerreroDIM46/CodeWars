package pruebas;

public class ConsecutiveStringsPruebas {

	public static String longestConsec(String[] strarr, int k) {
		String resultado;
// comprobar array		
		verArr(strarr);
// limpiar duplicados
		strarr = eliminarElementosDuplicadosDelArray(strarr);
// comprobar array		
		verArr(strarr);
		// calcular numero de elementos vacios
		int numeroDeElementosVacios = numeroElementosVacios(strarr);
		// comprobar k
		if (k < 1 | k > (strarr.length - numeroDeElementosVacios)) {
			resultado = "";
		} else {
// obtener numero de elementos no vacios
			int numeroElementosNoVacios = numeroElementosNoVacios(strarr);
// obtener indice de menor elemento no vacio
			int indicemenorElementoNoVacio = indiceMenorElementoNoVacio(strarr);
// hacer en bucle
			while (numeroElementosNoVacios != k) {
				indicemenorElementoNoVacio = indiceMenorElementoNoVacio(strarr);
				strarr[indicemenorElementoNoVacio] = "";
				numeroElementosNoVacios = numeroElementosNoVacios(strarr);
			}
// comprobar array		
			verArr(strarr);
// componer cadena con matriz		
			resultado = "";
			for (int i = 0; i < strarr.length; i++) {
				resultado = resultado.concat(strarr[i]);
			}
		}
		return resultado;
	}

	public static void verArr(String[] strArr) {
		System.out.println("\n");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + "\t");
		}
		System.out.println("\n");
	}

	public static String[] eliminarElementosDuplicadosDelArray(String[] strArr) {
		String[] resultado = new String[strArr.length];
		resultado = strArr;
		for (int i = 0; i < resultado.length; i++) {
			for (int j = 0; j < resultado.length; j++) {
				if ((i != j) && (resultado[i]).equals(resultado[j])) {
					resultado[j] = "";
				}
			}
		}
		return resultado;
	}

	public static String mayorElemento(String[] strArr) {
		String resultado = "";
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].length() > resultado.length())
				resultado = strArr[i];
		}
		return resultado;
	}

	public static int numeroElementosNoVacios(String[] strArr) {
		int resultado = strArr.length;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals(""))
				resultado--;
		}
		return resultado;
	}

	public static int numeroElementosVacios(String[] strArr) {
		int resultado = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals(""))
				resultado++;
		}
		return resultado;
	}

	public static int indiceMenorElementoNoVacio(String[] strArr) {
		String resultado = mayorElemento(strArr);
		int resultadoNumero = 0;
		for (int i = 0; i < strArr.length; i++) {
			if ((!strArr[i].equals("")) && (strArr[i].length() <= resultado.length())) {
				resultado = strArr[i];
				resultadoNumero = i;
			}
		}
		return resultadoNumero;
	}

	public static void main(String[] args) {
		String[] pruebaStrings = new String[] { "zone", "abigail", "theta", "form", "libe", "theta",
				"zas", "abigail", "tetas" };
		int k = 10;
		System.out.println("El resultado es \"" + longestConsec(pruebaStrings, k) + "\"");
	}
}
