package entities.gamaPhiModels;

import java.util.ArrayList;
import java.util.List;

import entities.EquilibriumModel;

public class GamaPhiApproach implements EquilibriumModel {
	protected GamaModel gamaModel;
	protected PhiModel phiModel;
	//Constructors
	public GamaPhiApproach() {
		this.gamaModel = null;
		this.phiModel = null;
	}
    public GamaPhiApproach(GamaModel gamaModel, PhiModel phiModel) {
		this.gamaModel = gamaModel;
		this.phiModel = phiModel;
	}
	//Methods
	@Override
	public List<Double> gama(Double x) {
		// TODO Auto-generated method stub
		List<Double> gama = new ArrayList<>();
		if (gamaModel == null) {
			gama.add(1.);
			gama.add(1.);
		} else {
			gama = gamaModel.estimationGama(x = new Double(null));
		}
		return gama;
	}
	@Override
	public List<Double> phi() {
		// TODO Auto-generated method stub
		List<Double> phi = new ArrayList<>();
		if (phiModel == null) {
			phi.add(1.);
			phi.add(1.);
		}else {
			phi = phiModel.estimationPhi();
		}
		return phi;
	}
}
