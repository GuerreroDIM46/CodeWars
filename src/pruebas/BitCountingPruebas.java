package pruebas;
public class BitCountingPruebas {
	public static void main(String[] args) {
		int numeroDecimal = 15;
		System.out.println(binaryConversor(numeroDecimal));
		System.out.println(countBits(numeroDecimal));
	}
	public static int countBits(int n) {
		int bitCoun = 0;
		String numeroEnBinario = binaryConversor(n);
		for (int i = 0; i < numeroEnBinario.length(); i++) {
			if (numeroEnBinario.substring(i, i + 1).equals("1")) {
				bitCoun = bitCoun + 1;
			}
		}
		return bitCoun;
	}
	public static String binaryConversor(int numeroDecimal) {
		int copiaNumeroDecimal;
		String numeroEnBinario = "";
		if (numeroDecimal == 0)
			numeroEnBinario = "0";
		else if (numeroDecimal == 1)
			numeroEnBinario = "1";
		else {
			copiaNumeroDecimal = numeroDecimal;
			numeroDecimal = (numeroDecimal - (numeroDecimal % 2)) / 2;
			numeroEnBinario = binaryConversor(numeroDecimal)
					.concat(Integer.toString(copiaNumeroDecimal % 2));
		}
		return numeroEnBinario;
	}
}
