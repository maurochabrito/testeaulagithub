package entities;

import java.util.ArrayList;
import java.util.List;

import utilities.Operator;

public class RefluxDistillation extends Distillation {
    //Constructor
	public RefluxDistillation(Double z, double xd, double xb, ELV brain) {
		super(z, xd, xb, brain);
		// TODO Auto-generated constructor stub
	}
	public List<Double> strippingLine(Double q, Double refluxRatio, List<Double> xDomain) {
		List<Double> yCounterDomain = new ArrayList();
		List<Double> x = Operator.domain(101, 0, 1);
		List<Double> yQ = this.qLine(q, x);
		List<Double> yR = this.rectifyingLine(q, refluxRatio, x);
		Double yq = Operator.intersec(x, x, yQ, yR).get(1);
		Double xq = Operator.intersec(x, x, yQ, yR).get(0);
		Double m = (yq-xb)/(xq-xb);
		Double b = yq-xq*m;
		for (Double element: xDomain) {
			Double y = m*element -b;
			yCounterDomain.add(y);
		}
		return yCounterDomain;
	}
	public List<Double> rectifyingLine(Double q, Double refluxRatio, List<Double> xDomain) {
		List<Double> yCounterDomain = new ArrayList();
		Double R = refluxRatio*this.minimumRefluxRation(q);
		for (Double element: xDomain) {
			Double y = (R/(R+1))*element -xd/(R+1);
			yCounterDomain.add(y);
		}
		return yCounterDomain;
	}
	public Double minimumRefluxRation(Double q) {
		List<Double> xQ = Operator.domain(101, 0, 1);
		List<Double> yQ = this.qLine(q, xQ);
		List<Double> y1 = this.brain.ELVDiagramXY().get(1);
		List<Double> x1 = this.brain.ELVDiagramXY().get(0);
		Double yq = Operator.intersec(xQ, x1, yQ, y1).get(1);
		Double xq = Operator.intersec(xQ, x1, yQ, y1).get(0);
		double m, minimumRefluxRation;
		m = (xd-yq)/(xd-xq);
		minimumRefluxRation = m/(1-m);
		return minimumRefluxRation;
	}
	public List<Double> qLine(Double q, List<Double> xDomain) {
		List<Double> yCounterDomain = new ArrayList();
		for (Double element: xDomain) {
			Double y = (q/(q-1))*element -z/(q-1);
			yCounterDomain.add(y);
		}
		return yCounterDomain;
	}


}
