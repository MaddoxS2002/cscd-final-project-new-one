import java.util.ArrayList;

public class Flight{

    //private ArrayList<SeatClass> sections; //only one section of a particular seat class eg only 1 business or econ class
    //private int numOfSec = 0;//number of sections
    private String seatClassName;
    private String aname;
    private String orig;
    private String dest;
    private int day;
    private int month;
    private int year;
    private String id;


    /*
    public Flight(String section,final SeatClass sc){
        if(numOfSec > 3 || numOfSec < 0)
            throw new IllegalArgumentException("Invalid parameter in flight constructor");


        this.numOfSec++;
    }
    */
    public Flight(final String aname, final String orig, final String dest, final int year, final int month,
                  final int day, final String id)
    {
        this.aname = aname;
        this.orig = orig;
        this.dest = dest;
        this.year = year;
        this.month = month;
        this.day = day;
        this.id = id;
    }

}//end of class
