package air;


public class Flight {
	City source;
	City destination;
	int distance;

	public Flight(City s, City d, int dist) {
		source = s;
		destination = d;
		distance = dist;
	}

	public City getSource() {
		return source;
	}

	public City getDestination() {
		return destination;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "{" + "\n\t\t\"ports\":  [\"" + source.getCode() + "\" , \""
				+ destination.getCode() + "\"] ," + "\n\t\t\"distance\": "
				+ distance + "\n\t}";
	}

}
