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
	public double getInitialAngle() {
		return initialAngle;
	}
	public double getStartingHeight() {
		return startingHeight;
	}
	public double getStartingVelocity() {
		return startingVelocity;
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
		if (startingHeight > 0) startingHeightString = " + " + String.valueOf(startingHeight);
		result = "h(t) = -16.0t^2 + " + Math.round(startingVelocityY*1000.0)/1000.0 + "t" + startingHeightString;
		return result;
	}
	
	public String horizEq() {
		String result = "holaquetal";
		result = "x(t) = " + Math.round(startingVelocityX*1000.0)/1000.0 +"t";
		return result;
	}
	
	public double height (double t) {
		
		double result = Math.round((- 16 * Math.pow(t, 2) + t * startingVelocityY + startingHeight)*1000.0)/1000.0;
		return result;
	}
	
	public double horiz(double t) {
		double result;
		result = Math.round(t * startingVelocityX * 1000) / 1000.0 ;
		return result;
	}
	
	public double[] landing() {
		double x, y, t;
		y = 0;
		t = ((-startingVelocityY) - Math.sqrt((Math.pow(startingVelocityY, 2) - (4 * (-16) * startingHeight)))) / (2 * (-16));
		x = Math.round(startingVelocityX * t * 1000.0) / 1000.0;
		t = Math.round(t *1000.0) / 1000.0;
		double[] result = new double[] {x, y, t};
		return result;
		
	}
	
	@Override
	public String toString() {
		return "Projectile [startingHeight=" + startingHeight + ", startingVelocityX="
				+ startingVelocityX + ", startingVelocityY=" + startingVelocityY + "]";
	}


	
	
	
}
