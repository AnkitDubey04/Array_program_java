public class Smallest_Element{
    public static void main(String[] args) {
        int arr[] = {3,4,23,6,476};
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
             if (arr[i] < small) {
                 small = arr[i];

                
             }
            }
              System.out.print(small);
            
        }
    }