public class Index {
	//CHECKSTYLE: OFF 
	public static void main(String[] args) {
		
		Vacation vacation = new Vacation("Paris", 4, 4);
		
		int price = Calculator.calculateVacation(vacation);
		
		if(price == -1) {
			System.out.print(price);
		}
		
		else {
			System.out.print("\nTotal cost = $" + price);
		}

	}
	//CHECKSTYLE: ON
}
