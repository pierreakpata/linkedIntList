/**
 * Class  IntListIterator
 * @author AKPATA Kodjo Pierre
 */
public class IntListIterator implements IntIterator {

    private Cell currentCell;

    public IntListIterator(Cell currentCell){
        this.currentCell=currentCell;
    }

    @Override
    public int next() {
        int data = -1;
        if(hasNext()){
            data=currentCell.getDataCell();
            currentCell=currentCell.getNextCell();
        }
        return data;
    }

    @Override
    public boolean hasNext() {
        if(currentCell!=null) return true;
        return false;
    }
}
