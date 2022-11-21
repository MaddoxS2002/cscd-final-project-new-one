import java.util.ArrayList;

public enum Airport {

    DEN("DEN"), DFW("DFW"), LON("LON");

    private String name;

    private final ArrayList<Airline> Airlines;

    Airport(final String name){
        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.Airlines = new ArrayList<>();
    }

    public void addToAirlines(final Airline A){
        this.Airlines.add(A);
    }

    public String getName(){
        return this.name;
    }

    public ArrayList<Airline> getAirlines(){
        return this.Airlines;
    }

}//end of class

/*public class Airport{
    private String name;

    Airport(final String name){
        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }


}*/