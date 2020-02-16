import java.util.*;

public class Main {

    /*
    Java 8 Lambdas and Streams
    Write a method that returns the average of a list of integers
     */

    public static double getAverageValue ( List<Integer> list){
       return list.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);
    };

    public static void main(String[] args){

        // Creating and initializing an Array
        Integer[] array1 = new Integer[]{2,3,1};
        Integer[] array2 = {1,2,3};

        Arrays.sort(array1);

        System.out.println("array1: " + Arrays.toString(array1));

        // Interface List<E>
        // https://docs.oracle.com/javase/8/docs/api/java/util/List.html

        // The List interface provides two methods to efficiently
        // insert and remove multiple elements at an arbitrary point in the list.

        // Unlike sets, lists typically allow duplicate elements

        // The List interface provides a special iterator, called a ListIterator,
        // that allows element insertion and replacement, and bidirectional access
        // in addition to the normal operations that the Iterator interface provides

        // Since Java 7 you have type inference for generic instance creation,
        // so there is no need to duplicate generic parameters on the right hand side of the assignment

        List<Integer> list1 = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = Arrays.asList(array1);
        Map<Integer, Integer> m;

        System.out.println("list1: " + list1.toString());

        // Note that Java 8 added a new stream() method to the Collection interface.

        int averageValue1 = list1.stream()
                .reduce((a, v) -> a += v)
                .map(i -> i / list1.size())
                .orElse(0);


        double averageValue2 = list1.stream()
                .mapToInt(i -> i)
                .average()
                .orElse(0.0);


        System.out.println("averageValue: " + averageValue1);

        System.out.println(Main.getAverageValue(list1));
    }
}
