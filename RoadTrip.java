import java.util.ArrayList;

public class RoadTrip
{
    // Add instance variable to store the list of GeoLocations
    private ArrayList<GeoLocation> stops;


    // Constructor initializes the ArrayList
    public RoadTrip() {
        stops = new ArrayList<GeoLocation>();
    }


    // Creates a GeoLocation and adds it to the list
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation newStop = new GeoLocation(name, latitude, longitude);
        stops.add(newStop);
        
    }

    // Returns the number of locations in the trip
    public int getNumberOfStops()
    {
        return stops.size();
    }

    // Returns the total distance of the trip
    public double getTripLength()
    {
        double distance = 0;
        for (int i=1; i<stops.size();i++) {
           distance += stops.get(i).distanceFrom(stops.get(i-1));
        }
        return distance;
    }

    // Returns a numbered list of all stops
    public String toString()
    {
        String finalList = "";
        for (int i=0; i<stops.size(); i++) {
            finalList += i+1;
            finalList += ". ";
            finalList += stops.get(i).getName();
            finalList += " (";
            finalList += stops.get(i).getLatitude(); 
            finalList += ", ";
            finalList += stops.get(i).getLongitude();
            finalList += ")";
            finalList += "\n";
        }
        return finalList;
        
    }
}
