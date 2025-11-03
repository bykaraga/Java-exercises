package Collections;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
        * HasSet<E>
        LinkedHasSet<E>
        * TreeSet <E>
        */

 /*       // HASsET
// F(X) = X^2 *2 xmod7*sqrt(X)
        HashSet h = new HashSet();
        h.add("12 str");
        h.add(12);
        h.add(true);
h.add(null);
h.add(12.4);

h.remove(12);
        System.out.println(h.contains(12));

Iterator itr = h.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
        System.out.println();
h.forEach(item -> System.out.println(item +" "+"\n---------------"));

*/

 /*      // LinkedHasSet<E>
LinkedHashSet gunler = new LinkedHashSet();

gunler.add("Pazartesi");
gunler.add("Sali");
gunler.add("Carsamba");
gunler.add("Persembe");
gunler.add("Cuma");
gunler.add("Cumartesi");
gunler.add("Pazar");

        gunler.add("Pazartesi");  // tekrarlanan deger oldugu icin yazmadi

        gunler.forEach(item -> System.out.print(item + " | ")); */


                  /*                                   //TreeSet <E>


  TreeSet tree = new  TreeSet();
  tree.add(10);
  tree.add(1);
  tree.add(2);
  tree.add(6);

try{tree.add(null); }catch (NullPointerException e){
    System.out.println(e.getMessage());
}
  tree.forEach(item -> System.out.println(item + " \t|\t "+item));

*/





    }
}
