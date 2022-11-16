package entities;

import java.util.List;

public interface EquilibriumModel {
	//Methods
	public abstract List<Double> gama(Double x);
	public abstract List<Double> phi();
}
