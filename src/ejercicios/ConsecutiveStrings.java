package ejercicios;

public class ConsecutiveStrings {
	
	public static String longestConsec(String[] strarr, int k) {
		String resultado = "";
		int[] strarrLenght = new int[strarr.length];
		int mayorSuma = 0;
		int indiceMayorSuma = 0;
		
		if ((k >= 0) & (k <= strarr.length)) {
			for (int i = 0; i < strarrLenght.length; i++)
				strarrLenght[i] = strarr[i].length();
			int[] sumStrarrLenght = new int[strarr.length];
			for (int i = 0; i < sumStrarrLenght.length; i++)
				sumStrarrLenght[i] = 0;
			for (int i = 0; i <= (sumStrarrLenght.length - k); i++) {
				int j = 0;
				while (j != k) {
					sumStrarrLenght[i] = sumStrarrLenght[i] + strarrLenght[i + j];
					j++;
				}
			}
			for (int i = 0; i < sumStrarrLenght.length; i++) {
				if (sumStrarrLenght[i] > mayorSuma) {
					mayorSuma = sumStrarrLenght[i];
					indiceMayorSuma = i;
				}
			}
			int j = 0;
			while (j != k) {
				resultado = resultado.concat(strarr[indiceMayorSuma + j]);
				j++;
			}
		}

		return resultado;
	}
	
	public static void main(String[] args) {
		String[] pruebaStrings = new String[] { "zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail" };
		int k = -1;
		System.out.println("El resultado es \"" + longestConsec(pruebaStrings, k) + "\"");
	}
	
	public static void verArr(int[] strArr ) {
		System.out.println("\n");
		for (int i = 0; i < strArr.length; i++) System.out.print(strArr[i] + "\t");
		System.out.println("\n");
	}
}
