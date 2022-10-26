import java.util.ArrayList;
import java.util.Arrays;
import java.util.Arrays;
//it worked only when i used Arrays instead of Arraylist
public class shufflearraylist {
    public static void main(String[] args) {
        Integer[] array={3,4,5,6,7};
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(array));
        java.util.Collections.shuffle(list);
        System.out.println(list);
    }
}
