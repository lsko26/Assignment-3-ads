import java.util.Iterator;
import java.util.Random;

public class Main {
    static String[] studentType = {"Undergraduate", "Graduate", "PhD"};
    static String[] firstNames = {"John", "Michael", "William", "David", "James", "Joseph", "Daniel", "Matthew", "Robert", "Thomas"};
    static String[] lastNames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez"};

    public static void main(String[] args) {


        BST<Integer, Integer> bst = new BST<>();

        bst.put(8, 1);
        bst.put(3, 2);
        bst.put(10, 3);
        bst.put(1, 4);
        bst.put(6, 5);
        bst.put(14, 6);
        bst.put(4, 7);
        bst.put(7, 8);
        bst.put(13, 9);
        bst.delete(13);

        for (var i : bst) {
            System.out.println(i);
        }
    }
}
