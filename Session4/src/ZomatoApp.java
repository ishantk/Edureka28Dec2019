// Food Ordering App
// applyPromoCode :)

public class ZomatoApp {

	// PromoCode	-> Benefit	Condition		
	// 201 			-> 20% 		if, amount >=200 amount <500
	// 301 			-> 30% 		if, amount >=500 amount <1000
	// 501			-> 50% 		if, amount >=1000
	
	static void applyPromoCode(double amount, int promoCode) {
		
		if(amount>=200 && amount<500) {
			if(promoCode == 201) {
				System.out.println(">> Flat 20% Discount Applicable");
				amount = amount - 0.2*amount;
				System.out.println(">> Please Pay: \u20b9"+amount);
			}else {
				System.out.println(">> You must use Promo Code 201 to avail discount"); // suggesting a correct promo code as well
			}
		}else if(amount>=500 && amount<1000) {
			if(promoCode == 301) {
				System.out.println(">> Flat 30% Discount Applicable");
				amount = amount - 0.3*amount;
				System.out.println(">> Please Pay: \u20b9"+amount);
			}else {
				System.out.println(">> You must use Promo Code 301 to avail discount"); // suggesting a correct promo code as well
			}
		}else if(amount>=1000) {
			if(promoCode == 501) {
				System.out.println(">> Flat 50% Discount Applicable");
				amount = amount - 0.5*amount;
				System.out.println(">> Please Pay: \u20b9"+amount);
			}else {
				System.out.println(">> You must use Promo Code 501 to avail discount"); // suggesting a correct promo code as well
			}
		}else {
			System.out.println(">> Sorry !! No Discounts. Add more food items worth \u20b9"+(200-amount)+" to avail discounts !!");
			System.out.println(">> Please Pay: \u20b9"+amount);
		}
		
	}
	
	public static void main(String[] args) {
		
		ZomatoApp.applyPromoCode(800, 301);

	}

}
