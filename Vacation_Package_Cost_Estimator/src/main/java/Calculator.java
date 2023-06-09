import java.util.Map;
import java.util.HashMap;

/**
* Calculator
*/
public class Calculator {

	/**
	* calculate Vacation
	*/
	public static int calculateVacation(Vacation vacation) {
		
		Map<String, Integer> popularPlaces = new HashMap<String, Integer>();
		popularPlaces.put("Paris", 500);
		popularPlaces.put("New York City", 600);
		
		Map<String, Integer> optionalAddOns = new HashMap<String, Integer>();
		optionalAddOns.put("All-Inclusive", 200);
		optionalAddOns.put("Adventure Activities", 150);
		optionalAddOns.put("Spa and Wellness", 100);
		
		int baseCost = 1000;
		
		System.out.print("------Travel details------\n");
		
		System.out.print("Destination: " + vacation.getDestination() + "    numberTravelers: " + vacation.getNumberTravelers()
		+ "    DaysDuration: " + vacation.getDaysDuration() + "\n\n");
		
		//if the group is more than 80 people
		if( vacation.getNumberTravelers() >= 80 ) {
			
			System.out.print("The vacation package is not available for groups of 80 or more people\n");
			
			return -1;
			
		}
		
		else {
			
			if( !(vacation.getDestination() instanceof String) ) {
				System.out.print("Destination must be a string");
				return -1;
			}
			
			if( !((Object)vacation.getNumberTravelers() instanceof Integer) ) {
				System.out.print("NumberTravelers must be a int");
				return -1;
			}
			
			if( !((Object)vacation.getDaysDuration() instanceof Integer) ) {
				System.out.print("DaysDuration must be a int");
				return -1;
			}
			
			System.out.print("Base price = $1000\n\n");
			
			//If the destination is a popular tourist spot
			if( popularPlaces.containsKey(vacation.getDestination()) ) {
				baseCost = baseCost + popularPlaces.get(vacation.getDestination());
				System.out.print("Popular Tourist Spot (+$" + 
						popularPlaces.get(vacation.getDestination()) + ") = $" + baseCost + "\n");
			}
			
			//if the number of travelers is more than 4, but less than 10
			if( ( vacation.getNumberTravelers() >= 4 ) && ( vacation.getNumberTravelers() < 10 )) {
				baseCost = (int)((float)baseCost*0.9);
				System.out.print("Travelers (more or equal to 4 but less than 10) (10% discount) = $" + baseCost + "\n");
			}
			
			//If the number of travelers is more than 10
			if( vacation.getNumberTravelers() >= 10 ) {
				baseCost = (int)((float)baseCost*0.8);
				System.out.print("Travelers (more than 10) (20% discount) = $" + baseCost + "\n");
			}
			
			//If the duration of the vacation is less than 7 days
			if( vacation.getDaysDuration() < 7 ) {
				baseCost = baseCost + 200;
				System.out.print("Vacation duration (less than 7 days) (+$200) = $" + baseCost + "\n");
			}
			
			//If the duration of the vacation is more than 30 days or the number of passengers is 2
			if( ( vacation.getDaysDuration() >= 30 ) || ( vacation.getNumberTravelers() == 2 ) ) {
				baseCost = baseCost - 200;
				System.out.print("2 travelers or vacations of 30 or more days (-$200) = $" + baseCost + "\n");
			}
			
			if(vacation.getOptional() != null) {
				
				if( optionalAddOns.containsKey(vacation.getOptional()) ) {
					int add = optionalAddOns.get( vacation.getOptional() );
					int cost = vacation.getNumberTravelers() * add;
					baseCost = baseCost + cost;
					
					System.out.print(vacation.getOptional() + " package (+$" + add + " per traveler) = $" + baseCost + "\n");
				}
			}
			
			return baseCost;
			
		}
	}

}
