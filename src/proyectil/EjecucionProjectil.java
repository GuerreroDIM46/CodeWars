package proyectil;

import java.util.Scanner;

public class EjecucionProjectil {

	public static void main(String[] args) {
		
		Scanner entradaScanner = new Scanner(System.in);
		
		System.out.println("introduce altura inicial");
		double startingHeight = Double.parseDouble(entradaScanner.nextLine());

		System.out.println("introduce velocidad inicial");
		double startingVelocity = Double.parseDouble(entradaScanner.nextLine());
		
		System.out.println("introduce angulo de tiro");
		double initialAngle = Double.parseDouble(entradaScanner.nextLine());
		
		
		Projectile pruebaProjectile = new Projectile(100, 0, 0);
		System.out.println(pruebaProjectile.toString());
		System.out.println(pruebaProjectile.heightEq());
	}

}
