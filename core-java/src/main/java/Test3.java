import java.util.*;

public class Test3 {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(Integer.MAX_VALUE);
        int[] a1 = {1,4,6,8};
        int[] a2 = {2,3,7,9};
        int[] a3 ={4,6,7,9};

        List<String> a = new ArrayList<>(Arrays.asList("a", "b", "c"));
        a.add("t");
       /*
        // Infinite Loop
        for (int i = 0; i < a.size(); i++) {
            a.add(String.valueOf(i));
        }

        // java.util.ConcurrentModificationException
        for (String s : a){
            a.add("x");
        }*/

        Iterator it = a.iterator();

        while (it.hasNext()) {
            it.remove();
        }
    }

}
