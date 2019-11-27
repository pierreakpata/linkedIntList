/**
 * Class  Cell
 * @author AKPATA Kodjo Pierre
 */
public class Cell {

    private int data;
    private Cell nextCell;

    public Cell(int data, Cell nextCell){
        this.data=data;
        this.nextCell=nextCell;
    }

    public int getDataCell() {
        return data;
    }

    public Cell getNextCell() {
        return nextCell;
    }

    public void setDataCell(int data) {
        this.data = data;
    }

    public void setNextCell(Cell nextCell) {
        this.nextCell = nextCell;
    }
}
