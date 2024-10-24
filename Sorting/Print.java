package Sorting;

public class Print {

    public static void printNewline(){
                System.out.println();
    }

    public static void commentPrint(String Comment){
        
        System.out.println(Comment);
    }



    public  void printArray(int [] array) {
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    
        
    }
    
}
