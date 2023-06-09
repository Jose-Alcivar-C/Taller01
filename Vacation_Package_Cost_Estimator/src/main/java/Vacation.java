/**
* Vacation
*/
public class Vacation {

	/**
	* Destination
	*/
	private String Destination;
	
	/**
	* numberTravelers
	*/
	private int  numberTravelers;
	
	/**
	* daysDuration
	*/
	private int daysDuration;
	
	/**
	* optional
	*/
	private String optional;
	
	/**
	* Vacation
	*/
	public Vacation(String destination, int numberTravelers, int daysDuration){
		this.Destination = destination;
		this.numberTravelers = numberTravelers;
		this.daysDuration = daysDuration;
		this.optional = null;
	}
	
	/**
	* Vacation
	*/
	public Vacation(String destination, int numberTravelers, int daysDuration, String optional){
		this.Destination = destination;
		this.numberTravelers = numberTravelers;
		this.daysDuration = daysDuration;
		this.optional = optional;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public int getNumberTravelers() {
		return numberTravelers;
	}

	public void setNumberTravelers(int numberTravelers) {
		this.numberTravelers = numberTravelers;
	}

	public int getDaysDuration() {
		return daysDuration;
	}

	public void setDaysDuration(int daysDuration) {
		this.daysDuration = daysDuration;
	}
	

	public String getOptional() {
		return optional;
	}

	public void setOptional(String optional) {
		this.optional = optional;
	}

	@Override
	public String toString() {
		return "Vacation [Destination=" + Destination + ", numberTravelers=" + numberTravelers + ", daysDuration="
				+ daysDuration + ", getDestination()=" + getDestination() + ", getNumberTravelers()="
				+ getNumberTravelers() + ", getDaysDuration()=" + getDaysDuration() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
