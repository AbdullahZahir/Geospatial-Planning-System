public class RoadTripRunner
{
    public static void main(String[] args)
    {
        // Create a new road trip and add stops
        RoadTrip rt = new RoadTrip();
        rt.addStop("San Francisco", 37.7833, -122.4167);
        rt.addStop("Los Angeles", 34.052235, -118.243683);
        rt.addStop("Las Vegas", 36.114647, -115.172813);

        // Print the list of stops
        System.out.println(rt);

        // Print total number of stops
        System.out.println("Stops: " + rt.getNumberOfStops());

        // Print total distance of the trip
        System.out.println("Total Miles: " + rt.getTripLength());
    }
}
