package entities.gamaPhiModels;

import java.util.ArrayList;
import java.util.List;

public class PhiModel {
	//attribute
	protected List<Double> parameters;
    //Constructor
	public PhiModel(List<Double> parameters) {
		this.parameters = parameters;
	}
	//Method
	public List<Double> estimationPhi(){
		List<Double> phi = new ArrayList<>();
		phi.add(1.0);
		phi.add(1.0);
		return phi;
	}
}
