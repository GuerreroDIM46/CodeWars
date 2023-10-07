package ejercicios;

public class RegexValidatePINCode {

	public static boolean validatePin(String pin) {
		boolean resultado = false;

		if (pin.length() == 4 || pin.length() == 6) {
			resultado = true;
			for (int i = 0; i < pin.length(); i++) {
				if ((pin.substring(i, i + 1).equals("0") || pin.substring(i, i + 1).equals("1"))
						|| (pin.substring(i, i + 1).equals("2")) || (pin.substring(i, i + 1).equals("3"))
						|| (pin.substring(i, i + 1).equals("4")) || (pin.substring(i, i + 1).equals("5"))
						|| (pin.substring(i, i + 1).equals("6")) || (pin.substring(i, i + 1).equals("7"))
						|| (pin.substring(i, i + 1).equals("8")) || (pin.substring(i, i + 1).equals("9"))) {
					resultado = true;
				} else {
					resultado = false;
					break;
				}

			}
		}
		return resultado;
	}

	public static void main(String[] args) {
		String pin = "344140";
		System.out.println(validatePin(pin));

	}
}
