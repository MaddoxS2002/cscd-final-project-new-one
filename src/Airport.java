/*public enum Airport {

    DEN("DEN"), DFW("DFW"), LON("LON");

    private String name;

    Airport(final String name){
        if(name == null|| name.isEmpty()){
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

}//end of class
*/
public class Airport{

    private String name;

    public Airport(String name){
        this.name = name;
    }

}