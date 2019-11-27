/**
 * Class  Main
 * @author AKPATA Kodjo Pierre
 */
public class Main {

    public static void printIntList(LinkedIntList l){
        IntListIterator iterator=l.iterator();
        System.out.print("[");
        while(iterator.hasNext()){
            System.out.print(iterator.next());
            if(iterator.hasNext()){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        /**
         * FIRST TEST
         */
        /*
        IntList myList = new LinkedIntList().cons(3).cons(2).cons(1);

        //Test de la longueur
        System.out.println(myList.length());

        //Affichage de myList
        printIntList((LinkedIntList) myList);

        //Test de la somme
        int result=myList.sum();
        System.out.println("\n"+result);

        //Test de la nouvelle somme de la liste créée
        IntList myLongerList= myList.cons(8);
        printIntList((LinkedIntList) myLongerList);
        result=myLongerList.sum();
        System.out.println("\n"+result);

        //Test de la somme de l'ancienne liste
        result=myList.sum();
        System.out.println(result);

        //Test d'égaliter
        IntList myList2= new LinkedIntList().cons(3).cons(2).cons(1);
        System.out.println(myList.equals(myList2));

         */

        /**
         * TEST OF ADD AND REMOVE METHODS
         */
       /*
        LinkedIntList list= (LinkedIntList) new LinkedIntList().cons(3).cons(2).cons(1);
        printIntList(list);
        list.add(0);
        printIntList(list);
        list.remove();
        printIntList(list);

        */

        /**
         * Test of the methods add(int n,int pos) and remove(pos)
         */
        LinkedIntList list2= (LinkedIntList) new LinkedIntList().cons(3).cons(2).cons(1);
        printIntList(list2);
        list2.add(7,1);
        printIntList(list2);
        list2.remove(1);
        printIntList(list2);
        list2.add(7,4);
        printIntList(list2);
        list2.remove(4);
        printIntList(list2);
        list2.add(7,2);
        printIntList(list2);
        list2.remove(2);
        printIntList(list2);
    }
}
