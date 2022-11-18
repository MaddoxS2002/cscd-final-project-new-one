public enum Airline {

    DELTA("Delta"), AMERICAN("Amer"), FRONTIER("Front");

    private String name;
    private int flightId;

    private Airline(final String name){

    }

    private Airline(final String name, final int flightId){

    }

}
