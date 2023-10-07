package ejercicios;



public class DRoot {
	
	public static void main(String[] args) {
		System.out.println(digital_root(99577));
	}

	  public static int digital_root(int n) {
	  
	
	  	int suma = 0;
	  	
	  	while (n >= 10) {
	  		suma = 0;	
	  		while (n >= 10) {
	  			suma = suma + n % 10;
	  			n = ((n - (n % 10)) / 10);
	  		}
	  		n = n + suma;
	  	}

			return n;
	  }
	}

