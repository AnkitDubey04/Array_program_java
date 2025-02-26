public class Even_Number_Array {
     public static void main(String[] args) {
        int arr[] = {12,34,45,56,3,57};
        System.out.println(" even number in array...");
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                
            }
        }
     }
}
