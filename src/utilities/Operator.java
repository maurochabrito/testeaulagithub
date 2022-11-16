package utilities;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	public static List<Double> intersec(List<Double> x1, List<Double> x2, List<Double> y1, List<Double> y2) {
		List<Double> intersection = new ArrayList();
		for(int i = 1; i<y1.size(); i++) {
			if ((y1.get(i)-y2.get(i))*(y1.get(i-1)-y2.get(i-1))<0) {
				double m1, m2, b1, b2, x, y;
				m1 = (y1.get(i)-y1.get(i-1))/(x1.get(i)-x1.get(i-1));
				m2 = (y2.get(i)-y2.get(i-1))/(x2.get(i)-x2.get(i-1));
				b1 = (y1.get(i)+y1.get(i-1)-m1*(x1.get(i)+x1.get(i-1)))*0.5;
				b2 = (y2.get(i)+y2.get(i-1)-m2*(x2.get(i)+x2.get(i-1)))*0.5;
				x = (b2-b1)/(m1-m2);
				y = m1*x+b1;
				intersection.add(x);
				intersection.add(y);
			}
		}
		return intersection;
	}
	public static List<Double> horizontalLine(int points, double y){
		List<Double> horizontalLine = new ArrayList();
		for(int i=0; i<points; i++) {
			horizontalLine.add(y);
		}
		return horizontalLine;
	}
	public static List<Double> domain(String type, int points, double xi, double xf){
		return null;
	}
	public static List<Double> domain(int points, double xi, double xf){
		double dx = (xf-xi)/(points-1);
		List<Double> domain = new ArrayList();
		for (int i = 0; i<points; i++) {
			domain.add(xi+(i)*dx);
		}
		return domain;
	}
}
