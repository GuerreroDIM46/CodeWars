package ejercicios;

public class BitCounting {
	public static int countBits(int n) {
		int copiaDeN;
		int numeroDeUnos = 0;
		while (n >= 2) {
			copiaDeN = n;
			n = (n - (n % 2)) / 2;
			if ((copiaDeN % 2) == 1)
				numeroDeUnos = numeroDeUnos + 1;
		}
		if (n == 1)
			numeroDeUnos = numeroDeUnos + 1;

		return numeroDeUnos;
	}

	public static void main(String[] args) {
		int numeroDecimal = 15;
		System.out.println(countBits(numeroDecimal));
	}
}
