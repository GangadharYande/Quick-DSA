import Sorting.BubbleSort;
import Sorting.Print;

public class Main {

    public static void main(String[] args) {

        Print printer = new Print();

      // Bubble Sort Starts Here   
        int[] testArray = { // Test case: Unsorted array
                99999, -500, 1024, 73, 0, -2345, 786, 34, 0, 99999, -500, 987, 234, -1234, 7890, 4567,
                3456, 0, -50000, 23456, 123456, 789, 1023, 67, 345, 123, -34567, 876543, 234, 0, 999, 87, 2345, -678,
                56, 4500, 350, -9999, 6789, -12345, 67890, 9876, 234567, 0, -98765, 6543, 876, -234567, 543, 1234,
                78900, 8900, -1, 99999, -100000, 345, 5678, 987, 2468, -789, 23, 45, 3456, 98, -345, 654, 0 };

        System.out.println("Unsorted array:");
        printer.printArray(testArray); 
        
        System.out.println("Normal Bubble \n");
        BubbleSort Normal = new BubbleSort();
        Normal.BubbleSort(testArray);

        System.out.println("Sorting the array using improvisedBubbleSort Book \n");

        BubbleSort improvisedOne = new BubbleSort();
        improvisedOne.ImprovisedOne(testArray);


        System.out.println("Sorting the array using improvised \n ");
        BubbleSort improvisedTwo = new BubbleSort();
        improvisedTwo.improvisedTwo(testArray);

        // Bubble Sort Ends here 

        // Selection Sort Starts here 


        

    }
}