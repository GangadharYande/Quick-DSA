package Sorting;

public class Insertion {

    public static void InsertionSort(int A[]){
        int n = A.length;
        int v;
        int j;
        for(int i =1;i<=n-1;i++){
            v=A[i];
            j=i;
            while (j > 0 && A[j - 1] > v){
                A[j]=A[j-1];
                j--;
            }
            A[j]=v;
        }
        Print.printArray(A);
    }
    
}
