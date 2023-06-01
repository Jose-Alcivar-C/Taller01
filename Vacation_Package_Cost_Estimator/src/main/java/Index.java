
public class Index {

	
	public static void main(String[] args) {
		
		Vacation vacation = new Vacation("Ecuador", 10, 20);
		System.out.print("-----El precio de su viaje es----\n");
		
		System.out.print(Calculator.calculateVacation(vacation));

	}

}
