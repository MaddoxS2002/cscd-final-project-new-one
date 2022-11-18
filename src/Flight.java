import java.util.ArrayList;

public class Flight{

    private ArrayList<SeatClass> sections; //only one section of a particular seat class eg only 1 business or econ class
    private int numOfSec = 0;//number of sections
    /*
    public Flight(String section,final SeatClass sc){
        if(numOfSec > 3 || numOfSec < 0)
            throw new IllegalArgumentException("Invalid parameter in flight constructor");


        this.numOfSec++;
    }
    */
    public Flight(int numOfSec){
        for(int i = 0; i < numOfSec; i++){
            //this.sections.add()
        }
    }
}
