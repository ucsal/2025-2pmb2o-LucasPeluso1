package br.com.mariojp.solid.ocp;

public class Premium implements DiscountPolicy{

	@Override
	public double apply(double amount) {
		// TODO Auto-generated method stub
		return amount * 0.90;
	}

}
