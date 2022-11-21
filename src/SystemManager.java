import java.util.ArrayList;

public class SystemManager {

    ArrayList<Airport> Airports;

    public Airport createAirport(final String n){
        if(n.equals("DEN")){
            return Airport.DEN;
        }
        else if(n.equals("DFW")){
            return Airport.DFW;
        }
        return Airport.LON;
    }

    public void createAirline(final String n){
        if(n.equals("DELTA"))
           for(Airport A : Airports){
               A.addToAirlines(Airline.DELTA);
           }

        else if(n.equals("AMER")){
            for(Airport A: Airports){
                A.addToAirlines(Airline.AMERICAN);
            }
        }
        else if(n.equals("FRONT")){
            for(Airport A: Airports){
                A.addToAirlines(Airline.FRONTIER);
            }
        }

    }

    public Flight createFlight(final String aname,final String orig,final String dest,final int year,final int month,final int day,final String id){

        return new Flight(aname, orig, dest, year, month, day, id);
    }

    public FlightSection createSection(final String air,final String flID,final int rows,final int cols,final SeatClass s){
        return null;
    }
    public void findAvailableFlights(final String orig,final String dest){

    }
    public void bookSeat(final String air,final String fl,final SeatClass s,final int row,final char col){

    }
    public void displaySystemDetails(){
        System.out.println();
    }

}//end of class
