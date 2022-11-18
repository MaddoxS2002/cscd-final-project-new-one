public enum SeatClass {

    economy(1,'A'), business(1, 'A'), first(1, 'A');

    private char col;
    private int row;
    private Seat s;

    SeatClass(int row, char col) {
        s = new Seat(row,col);
        /*this.col = col;
        this.row = row;*/
    }

    public int getRow(){
        return this.row;
    }



}// end of class
