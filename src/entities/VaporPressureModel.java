package entities;

import java.util.List;

public abstract class VaporPressureModel {
	//Attributes
	protected List<Double> parameters;
	//Constructor
	public VaporPressureModel(List<Double> parameters) {
		this.parameters = parameters;
	}
	//Get and Set
	public List<Double> getParameters() {
		return parameters;
	}
	public void setParameters(List<Double> parameters) {
		this.parameters = parameters;
	}
	//Methods
	public abstract Double temperature(double P);
	public abstract Double pressure(double T);
}
