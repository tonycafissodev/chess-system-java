package boardgame;

public class Position{
    private int row;
    private int column;

    public Position (int row, int column){
        if (row < 0 || row > 7){
            throw new RuntimeException("Row value is invalid");
        }
        if (column < 0 || column > 7){
            throw new RuntimeException("Column value is invalid");
        }
        
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
}