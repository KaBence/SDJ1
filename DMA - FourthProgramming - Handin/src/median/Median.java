package median;

import java.util.*;

public class Median {

    // Add your private fields here
    ArrayList<Integer> list =new ArrayList<>();
    public void add(int x) {

        // Implement your method to add x to the data structure
        list.add(x);
    }

    public int median() {

        // Implement your method to return the median of the numbers added so far
        Collections.sort(list);
        return list.get(list.size()/2);

        //We didn't even try the maze and we don't know if we can use collection.sort (probably not).
        //Thanks for all the help during the semester, good luck with your project. :)
    }
}
