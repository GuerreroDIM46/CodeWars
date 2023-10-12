package proyectil;

import java.util.Scanner;

public class EjecucionProjectil {

	public static void main(String[] args) {
		
//		Scanner entradaScanner = new Scanner(System.in);
//		
//		System.out.println("introduce altura inicial");
//		double startingHeight = Double.parseDouble(entradaScanner.nextLine());
//
//		System.out.println("introduce velocidad inicial");
//		double startingVelocity = Double.parseDouble(entradaScanner.nextLine());
//		
//		System.out.println("introduce angulo de tiro");
//		double initialAngle = Double.parseDouble(entradaScanner.nextLine());
//		
		Projectile pruebaProjectile = new Projectile(15, 12, 80);		
//		Projectile pruebaProjectile = new Projectile(startingHeight, startingVelocity, initialAngle);
		System.out.println(pruebaProjectile.toString());
		System.out.println(pruebaProjectile.heightEq());
		System.out.println(pruebaProjectile.horizEq());
		System.out.println(pruebaProjectile.height(0.2));
		System.out.println(pruebaProjectile.horiz(0.2));
		for (int i = 0; i < pruebaProjectile.landing().length; i++) {
			System.out.print(pruebaProjectile.landing()[i] + "\t");
			
		}
	}

}
