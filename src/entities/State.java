package entities;

public class State {
	public Double t;
	public Double x;
	public Double y;
	
	public State() {}
	public State(Double t, Double x, Double y) {
		super();
		this.t = t;
		this.x = x;
		this.y = y;
	}
	public State(Double x, Double y) {
		super();
		this.x = x;
		this.y = y;
	}
	//Getters
	public Double getT() {
		return t;
	}
	public Double getX() {
		return x;
	}
	public Double getY() {
		return y;
	}
	//Methods
	@Override
	public String toString() {
		String toString = "x = "+String.format("%.3f", x)+" | y = "+String.format("%.3f", y)+" | T = "+String.format("%.3f", t)+"K";
		return toString;
	}
}
