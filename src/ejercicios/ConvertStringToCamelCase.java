package ejercicios;

public class ConvertStringToCamelCase {

	public static String camelCaseador(String s) {
		int i = 0;
		while (i < s.length()) {
			if (s.substring(i, i + 1).equals("-") || (s.substring(i, i + 1).equals("_"))) {
				s = s.substring(0, i) + s.substring(i + 1, i + 2).toUpperCase() + s.substring(i + 2);
				System.out.println(s);
			}
			i++;
			System.out.println(s);
		}

		return s;
	}

	public static void main(String[] args) {
		String textoInicial = "hola-que_tal";
		System.out.println(camelCaseador(textoInicial));

	}
}