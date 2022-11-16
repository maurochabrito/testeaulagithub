package entities.gamaPhiModels;

import java.util.ArrayList;
import java.util.List;

public class MargulesModel extends GamaModel {

	public MargulesModel(List<Double> parameters) {
		super(parameters);
	}
	//Method
	@Override
	public List<Double> estimationGama(Double x){
		List<Double> gama = new ArrayList<>();
		Double aux = new Double(null);
		aux = Math.pow(Math.E,(1-x)*(1-x)*(parameters.get(0)+2*(parameters.get(1)-parameters.get(0))*(x)));
		gama.add(aux);
		aux = Math.pow(Math.E,(x)*(x)*(parameters.get(1)+2*(parameters.get(0)-parameters.get(1))*(1-x)));
		gama.add(aux);
		return gama;
	}
}
