public class SystemManager {

    public Airport createAirport(final String n){
        Airport airport = new Airport(n);
        return airport;
    }

    public Airline createAirline(final String n){
        if(n.equals("Delta"))
            return Airline.DELTA;

        if(n.equals("Amer"))
            return Airline.AMERICAN;

        return Airline.FRONTIER;
    }

    public Flight createFlight(final String aname,final String orig,final String dest,final int year,final int month,final int day,final String id){

        return null;
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
