package proyectil;

public class Projectile {
	private double startingHeight;
	private double startingVelocity ;
	private double initialAngle;
	
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
	}
	
	public String heightEq() {
		String result = "holaquetal";
		result = "";
		return result;
				
	}

	@Override
	public String toString() {
		return "Projectile [startingHeight=" + startingHeight + ", startingVelocity=" + startingVelocity
				+ ", initialAngle=" + initialAngle + "]";
	}
	
	
}
