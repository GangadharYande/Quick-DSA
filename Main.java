import Sorting.BubbleSort;
import Sorting.Insertion;
import Sorting.Print;
import Sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {

        Print printer = new Print();

      // Bubble Sort Starts Here   
        int[] testArray = { // Test case: Unsorted array
                99999, -500, 1024, 73, 0, -2345, 786, 34, 0, 99999, -500, 987, 234, -1234, 7890, 4567,
                3456, 0, -50000, 23456, 123456, 789, 1023, 67, 345, 123, -34567, 876543, 234, 0, 999, 87, 2345, -678,
                56, 4500, 350, -9999, 6789, -12345, 67890, 9876, 234567, 0, -98765, 6543, 876, -234567, 543, 1234,
                78900, 8900, -1, 99999, -100000, 345, 5678, 987, 2468, -789, 23, 45, 3456, 98, -345, 654, 0 };
        
        
        int[] SimpleTestCase = {5, 4, 3, 2, 1};
        
        Print.commentPrint("Unsorted array: TestCase");
        printer.printArray(testArray); 
        Print.printNewline();
        Print.commentPrint("Normal Bubble:");
        System.out.println();
        BubbleSort Normal = new BubbleSort();
        Normal.bubbleSort(testArray);
        Print.printNewline();
        Print.commentPrint("ImprovisedBubbleSort1:");
        Print.printNewline();
        BubbleSort improvisedOne = new BubbleSort();
        Print.printNewline();
        improvisedOne.ImprovisedOne(testArray);
        Print.printNewline();
        Print.commentPrint("ImprovisedBubbleSort2:");
        BubbleSort improvisedTwo = new BubbleSort();
        improvisedTwo.improvisedTwo(testArray);

        // Selection Sort Starts here 
        
        Print.printNewline();
        Print.commentPrint("Selection Sort");
        SelectionSort.selectionSort(testArray);

        // Insertion Sort  Starts here

        Print.printNewline();
        Print.commentPrint("Insertion Sort"); 
        Print.commentPrint("Before Sort Simple testCase");
        Print.printArray(SimpleTestCase);
        Insertion.InsertionSort(SimpleTestCase);
        Print.printNewline();
        Print.commentPrint("After Sort largeTestCase");
        Insertion.InsertionSort(testArray);
        Print.printNewline();



        
      

    }
}