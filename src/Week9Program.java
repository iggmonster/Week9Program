import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.function.Predicate;
/*
@author Keiffer Button
Lab: L01
Course: CS1131 Accelerated intro to programming
 */
public class Week9Program {
    public static void main(String[] args) {
        Idk obj = new Idk();
        ArrayList list1 = new ArrayList<>(Arrays.asList(new String[] {"Larry", "Curly", "Moe", "Shemp", "Curly Joe", "12345678910"}) );
                //System.out.println((new Idk<>(list1)));
        //System.out.println(new Idk(list1));
      List listsomething = obj.filter( list1, value ->  value.toString().length() == 3 );
        System.out.printf("filter(%s, value -> value.length() == 3) returns %s\n", list1 ,Idk.filter());
    }
}

class Idk <T>{
    public Idk() {

    }

    List<T> filter (List<T> values, Predicate<? super T> p ) {
        ArrayList<T> stuff = new ArrayList<>(values);
        ArrayList<String> big10 = null;
        List<T> newList = null;
        for (int i = 0; i < values.size(); i++) {
            System.out.println(i);
            if ( ((stuff.get(i)).toString()).length() > 10) {
                big10.add(String.valueOf(((stuff.get(i)).toString()).length()));
            }
            if (p.test(((List<T>)big10).get(i))){
                newList.add(((List<T>)big10).get(i));
            }
        }

        return newList;
    }
}