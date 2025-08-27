package br.com.mariojp.solid.ocp;

import java.util.Map;

public class DiscountCalculator {
   private final Map <CustomerType, DiscountPolicy> clients;
   
   public  DiscountCalculator() {
	this.clients = Map.of(
			CustomerType.REGULAR, new RegularPolicy(),
			CustomerType.PREMIUM, new Premium(),
			CustomerType.PARTNER, new PartnerPolicy()
			);
			
   }
   public double  apply(double amount, CustomerType type) {
	return clients.getOrDefault(type, a -> a).apply(amount);
   }
}
	
	


