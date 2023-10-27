package proyectil;



public class Projectile {
	private double startingHeight = 0;
	private double startingVelocity = 0;
	private double initialAngle = 0;
	private double startingVelocityX;
	private double startingVelocityY;

	public void setStartingHeight(double startingHeight) {
		if (0 <= startingHeight && startingHeight < 200) {
			this.startingHeight = startingHeight;
		}
	}

	public void setStartingVelocity(double startingVelocity) {
		if ((0 < startingVelocity && startingVelocity < 200)) {
			this.startingVelocity = startingVelocity;
		}
	}

	public void setInitialAngle(double initialAngle) {
		if ((0 < initialAngle && initialAngle < 90)) {
			this.initialAngle = initialAngle;
		}

	}

	public Projectile(double startingHeight, double startingVelocity, double initialAngle) {
		setStartingHeight(startingHeight);
		setStartingVelocity(startingVelocity);
		setInitialAngle(initialAngle);
		startingVelocityX = startingVelocity * Math.cos(Math.toRadians(initialAngle));
		startingVelocityY = startingVelocity * Math.sin(Math.toRadians(initialAngle));

	}

	public String heightEq() {
		String result = "holaquetal";
		String startingHeightString = "";
		if (startingHeight > 0)
			startingHeightString = " + " + String.valueOf(startingHeight);
		result = "h(t) = -16.0t^2 + " + round3Dec(startingVelocityY) + "t" + startingHeightString;
		return result;
	}

	public String horizEq() {
		String result = "holaquetal";
		result = "x(t) = " + round3Dec(startingVelocityX) + "t";
		return result;
	}

	public double height(double t) {

		double result = round3Dec(-16 * Math.pow(t, 2) + t * startingVelocityY + startingHeight);
		return result;
	}

	public double horiz(double t) {
		double result;
		result = round3Dec(t * startingVelocityX);
		return result;
	}

	public double[] landing() {
		double x, y, t;
		y = 0;
		t = ((-startingVelocityY) - Math.sqrt((Math.pow(startingVelocityY, 2) - (4 * (-16) * startingHeight))))
				/ (2 * (-16));
		x = round3Dec(startingVelocityX * t);
		t = round3Dec(t);
		double[] result = new double[] { x, y, t };
		return result;

	}

	public double round3Dec(double n) {
		double result = Math.round(n * 1000d) / 1000d;
		return result;
	}

}
