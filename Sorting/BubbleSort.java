package Sorting;

public class BubbleSort {

    Print ans = new Print();
    Swap swapping = new Swap();
    // Time Complexity :  O(n^2)
    public void bubbleSort(int A[]){
        for( int pass = A.length-1;pass>0;pass--){
            for(int i = 0; i < pass - 1; i++){
                if(A[i]>A[i+1]){
                    // swapping.swap(A,i, i+1);
                    int temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
        }
        ans.printArray(A);
    }


    // Time Complexcity : O(n) / Space Complexity : O(1);
    public void ImprovisedOne(int A[]) {
        int pass, i, temp, swapped = 1;
        for (pass = A.length - 1; pass >= 0 && swapped != 0; i--) {
            swapped = 0;
            for (i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {
                    temp = A[i];
                    A[i] = A[i + 1];
                    A[i + 1] = temp;
                    swapped = 1;
                }
            }
        }
        ans.printArray(A);
    }

    // Time Complexcity : O(n) / Space Complexity : O(1);
    public void improvisedTwo(int A[]){
        int n = A.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(A[j]>A[j+1]){
                    int temp = A[j];
                    A[j] =A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        

        ans.printArray(A);

    }
}
