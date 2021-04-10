import java.util.*;
import java.util.concurrent.*;

public class Test {

    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        Thread thread = new Thread(() -> {
            System.out.println("nnnnn");
        });
        thread.setDaemon(false);
        thread.start();
        thread.setDaemon(true);



    }

    public static Iterator reverse(List list) {
        Collections.reverse(list);
        return list.iterator();
    }

    private static String replace(String s, String replacement) {

        String rev = new StringBuffer(replacement).reverse().toString();
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        Integer counter = 0;
        for (String s1 : arr) {
            if (s1.equals(replacement)) {
                counter++;
                if (counter %2 == 0) {
                    sb.append(rev);
                } else {
                    sb.append(replacement);
                }

            } else {
                sb.append(s1);
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
