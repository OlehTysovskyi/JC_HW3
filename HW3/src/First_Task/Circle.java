package First_Task;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle (double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}
	
	public double Square() {
		double sq = Math.PI*(this.diameter/2)*(this.diameter/2);
		return sq;
	}
	
	public double Lenghten() {
		double ln = 2*Math.PI*this.radius;
		return ln;
	}
}
