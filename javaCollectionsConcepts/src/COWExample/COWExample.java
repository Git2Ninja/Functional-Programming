package COWExample;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWExample {
    public static void main(String[] args) {
        List<String> cowList = new CopyOnWriteArrayList<>();

        // Adding elements
        cowList.add("A");
        cowList.add("B");
        cowList.add("C");

        // Creating a thread to modify the list
        Thread modifier = new Thread(() -> {
            try {
                Thread.sleep(100000); // Let the iterator start first
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Modifying list...");
            cowList.add("D");
            System.out.println(cowList);
        });

        // Iterating while another thread modifies the list
        Thread reader = new Thread(() -> {
            for (String item : cowList) {
                System.out.println("Reading: " + item);
                try {
                    Thread.sleep(200); // Slow down to allow concurrent modification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        reader.start();
        modifier.start();
        
       
    }
}
