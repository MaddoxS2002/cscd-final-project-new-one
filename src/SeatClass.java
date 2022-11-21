public enum SeatClass {

    economy(1,"A"), business(1, "A"), first(1, "A");

    private String col;
    private int row;

    SeatClass(int row, String col) {
        this.col = col;
        this.row = row;
    }

    public int getRow(){
        return this.row;
    }



}// end of class
