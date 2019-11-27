import java.util.NoSuchElementException;

/**
 * Class  LinkedIntList
 * @author AKPATA Kodjo Pierre
 */
public class LinkedIntList implements IntList {

    private Cell first;

    /**
     * Constructor of classe
     */
    public LinkedIntList(){
        this.first=null;
    }


    /**
     * this method add a new element at the head of LinkedIntList
     * @param n
     */
    public void add(int n){
        Cell newData=new Cell(n,first);
        this.first=newData;
    }

    /**
     * this method add a new elemnent at the end of a LInkedIntList
     * @param n
     */
    public void addLast(int n){
        Cell newData=new Cell(n,null);
        IntListIterator iterator=this.iterator();
        Cell temp=first;
        while(temp.getNextCell()!=null){
            temp=temp.getNextCell();
        }
        temp.setNextCell(newData);
    }


    /**
     * this method found and return  a previous element of the position in the LinkedIntList
     * @param pos
     * @return a previous element of the position in the LinkedIntList
     */
    public Cell serachPreviousCellOfPosition(int pos){
        Cell temp=first;
        int i=1;
        while(i<(pos-1)){
            temp=temp.getNextCell();
            i++;
        }
        return temp;
    }

    /**
     * this method add a new element in the LinkedIntList at the position specify in argument
     * @param n
     * @param pos
     */
    public void add(int n, int pos){
        if(pos<=1){
            add(n);
        }else if(pos>length()){
            addLast(n);
        }else{
            Cell previousCell=serachPreviousCellOfPosition(pos);
            Cell newData=new Cell(n,previousCell.getNextCell());
            previousCell.setNextCell(newData);
        }
    }

    /**
     * this method remove the head of LinkedIntList
     */
    public void remove(){
        this.first=first.getNextCell();
    }

    /**
     * this method remove element which present at the position passing in argument
     * @param pos
     */
    public void remove(int pos) throws NoSuchElementException {
        if(pos<1 || pos>length()){
            throw new NoSuchElementException("Element not found");
        }
        else if(pos==1){
            remove();
        }
        else{
            Cell previousCell=serachPreviousCellOfPosition(pos);
            previousCell.setNextCell(previousCell.getNextCell().getNextCell());
        }
    }


    @Override
    public int getHead() {
        return first.getDataCell();
    }

    @Override
    public IntList getTail() {
        LinkedIntList tail=new LinkedIntList();
        tail.first=this.first.getNextCell();
        return tail;
    }

    @Override
    public boolean isEmpty() {
        if(first==null) return true;
        return false;
    }

    @Override
    public IntList cons(int n) {
        LinkedIntList newList=new LinkedIntList();
        Cell newData=new Cell(n,first);
        newList.first=newData;
        return newList;
    }

    @Override
    public int length() {
        if(isEmpty()){
            return 0;
        }
        return 1+getTail().length();
    }

    @Override
    public int sum() {
        if(isEmpty()) return 0;
        return first.getDataCell()+getTail().sum();
    }

    @Override
    public boolean equals(IntList list) {
        if(length()!=list.length()) return false;

        if(isEmpty() && list.isEmpty())
            return true;

        if(first.getDataCell()==list.getHead() && getTail().equals(list.getTail()))
            return true;

        return false;
    }

    public IntListIterator iterator(){
        return new IntListIterator(first);
    }

}
