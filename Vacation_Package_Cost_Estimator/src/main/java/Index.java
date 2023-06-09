/**
* Index
*/
public class Index {

	/**
	* main
	*/
	public static void main(String[] args) {
		
		Vacation vacation = new Vacation("Paris", 5, 4, "Adventure Activities");
		
		int price = Calculator.calculateVacation(vacation);
		
		if(price == -1) {
			System.out.print(price);
		}
		
		else {
			System.out.print("\nTotal cost = $" + price);
		}

	}
	
}
