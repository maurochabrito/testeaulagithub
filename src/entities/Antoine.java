package entities;

import java.util.List;

public class Antoine extends VaporPressureModel{

	public Antoine(List<Double> parameters) {
		super(parameters);
	}
	//Get
	public List<Double> getParameters() {
		return this.parameters;
	}
	//Methods
	@Override
	public Double temperature(double P){
	    Double A = parameters.get(0);
	    Double B = parameters.get(1);
	    Double C = parameters.get(2);
	    Double T = B/(A-Math.log(P))-C;
	    return T;
	}
	@Override
	public Double pressure(double T) {
    Double A = parameters.get(0);
    Double B = parameters.get(1);
    Double C = parameters.get(2);
    Double P = Math.pow(Math.E,(A-B/(T+C)));
    return P;
	}
	@Override
	public String toString() {
	    Double A = parameters.get(0);
	    Double B = parameters.get(1);
	    Double C = parameters.get(2);
	    String toString = "A = "+A+" B = "+B+" C = "+C;
	    return toString;
	}
}
