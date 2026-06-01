/*
 * This class stores information about a location on Earth.  Locations are
 * specified using latitude and longitude.  The class includes a method for
 * computing the distance between two locations.
 *
 * This implementation is based off of the example from Stuart Reges at 
 * the University of Washington.
 */

public class GeoLocation
{
    // Earth radius in miles
    public static final double RADIUS = 3963.1676;

    // Instance variables for location
    private double latitude;
    private double longitude;
    private String name;
    
    // Constructor with name, latitude and longitude
    public GeoLocation(String locationName, double lat, double lon)
    {
        name = locationName;
        latitude = lat;
        longitude = lon;
    }

    // Returns the name of the location
    public String getName()
    {
        return name;
    }

    // Returns the latitude
    public double getLatitude()
    {
        return latitude;
    }

    // Returns the longitude
    public double getLongitude()
    {
        return longitude;
    }

    // Returns a formatted string representation of the location
    public String toString()
    {
        return name + " (" + latitude + ", " + longitude + ")";
    }

    // Calculates the distance from this location to another location
    public double distanceFrom(GeoLocation other)
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);

        double theCos = Math.sin(lat1) * Math.sin(lat2) +
                        Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);

        return arcLength * RADIUS;
    }
}
