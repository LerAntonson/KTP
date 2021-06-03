/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;


    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }
 
    public boolean equals(Object other){ 
        if(other instanceof Location)
        {
            return ((((Location) other).xCoord==this.xCoord) && (((Location) other).yCoord==this.yCoord)) ? true : false;
        }
        return false; 
    }
    
    public int hashCode(){
        return 37*(37 + this.xCoord)+this.yCoord;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }
}