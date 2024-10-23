package Sorting;

public class SelectionSort {

    public void SelectionSort(int A[]) {
        Print ans = new Print();
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (A[j] < A[min]) {
                    min = j;
                }
                int temp = A[j];
                    A[j] =A[j+1];
                    A[j+1] = temp;
            }
        }
        ans.printArray(A);
    }

}
