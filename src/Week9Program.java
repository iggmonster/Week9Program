import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.function.Predicate;

public class Week9Program {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>(Arrays.asList(new String[] {"Larry", "Curly", "Moe", "Shemp", "Curly Joe"}) );
        System.out.println(new Idk(list1));
    }
}

class Idk <T>{
    public Idk(ArrayList list1) {

    }

    List<T> filter (List<T> values, Predicate<? super T> p ){
        int i = 0;
        while (true){
            if (p[i].length < 10){

            }
        }
        return (List<T>) p;
    }
}