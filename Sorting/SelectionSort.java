package Sorting;

public class SelectionSort {

    // DisAdv : Doesn't Scale well 
    // Time Complexity Best-Worst-Avg : O(n^2)

    public void selectionSort(int A[]) {
        Print ans = new Print();

        int min;
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
             min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min =j;
                    
                }
                int temp = A[min];
                    A[min] = A[i];
                    A[i] = temp;
            }
            
        }
        ans.printArray(A);
    }
}
