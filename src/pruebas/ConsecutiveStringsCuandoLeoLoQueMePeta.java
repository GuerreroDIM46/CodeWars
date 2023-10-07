package pruebas;

public class ConsecutiveStringsCuandoLeoLoQueMePeta {
	public static String longestConsec(String[] strarr, int k) {
		String resultado = "";
		String mayorElemento = "";
		int numeroDeElementosVacios = 0;
		int numeroElementosNoVacios = strarr.length;
		int indicemenorElementoNoVacio = 0;
// eliminar duplicados
		for (int i = 0; i < strarr.length; i++) {
			for (int j = 0; j < strarr.length; j++) {
				if ((i != j) && (strarr[i]).equals(strarr[j])) {
					strarr[j] = "";
				}
			}
		}
// calculo numero de elementos vacios en el array despues de quitar duplicados		
		for (int i = 0; i < strarr.length; i++) {
			if (strarr[i].equals(""))
				numeroDeElementosVacios++;
		}
// filtro los valores validos de la K			
		if (k < 1 | k > (strarr.length - numeroDeElementosVacios)) {
			resultado = "";
		} else {
// obtener numero de elementos no vacios			
			numeroElementosNoVacios = strarr.length;
			for (int i = 0; i < strarr.length; i++) {
				if (strarr[i].equals(""))
					numeroElementosNoVacios--;
			}
// obtener mayor elemento (necesario para siguiente paso)
			for (int i = 0; i < strarr.length; i++) {
				if (strarr[i].length() > mayorElemento.length())
					mayorElemento = strarr[i];
			}
// obtener indice de menor elemento no vacio			
			String copiaMayorElemento = mayorElemento;
			for (int i = 0; i < strarr.length; i++) {
				if ((!strarr[i].equals("")) && (strarr[i].length() <= copiaMayorElemento.length())) {
					copiaMayorElemento = strarr[i];
					indicemenorElementoNoVacio = i;
				}
			}
// La magia de los bucles	
			while (numeroElementosNoVacios != k) {
				// calculo indice menor elemento no vacio
				copiaMayorElemento = mayorElemento;
				for (int i = 0; i < strarr.length; i++) {
					if ((!strarr[i].equals("")) && (strarr[i].length() <= copiaMayorElemento.length())) {
						copiaMayorElemento = strarr[i];
						indicemenorElementoNoVacio = i;
					}
				}
				// borro menor elemento no vacio
				strarr[indicemenorElementoNoVacio] = "";
				// actualizo numero de elementos no vacios
				numeroElementosNoVacios = strarr.length;
				for (int i = 0; i < strarr.length; i++) {
					if (strarr[i].equals(""))
						numeroElementosNoVacios--;
				}
				// componer cadena con matriz
				resultado = "";
				for (int i = 0; i < strarr.length; i++) {
					resultado = resultado.concat(strarr[i]);
				}
			}

		}

		return resultado;
	}

	public static void main(String[] args) {
		String[] pruebaStrings = new String[] { "it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz" };
		int k = 3;
		System.out.println("El resultado es \"" + longestConsec(pruebaStrings, k) + "\"");
	}

}
