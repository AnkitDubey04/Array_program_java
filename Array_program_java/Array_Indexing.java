 public class Array_Indexing{

    static int [] arr = new int[10];
    static int currentposition=-1; 
    
    public static void newarr(int value){
         if (currentposition <arr.length-1) {
            currentposition++;
            for (int i =currentposition; i >0; i--) {
                arr[i] = arr[i-1];
                
            }
             arr[0] = value;
         }
        }
      public static void printAll(){
         
          for (int i = 0; i <= currentposition; i++) {
            System.out.println(arr[i]);
          }
        }
 public static void main(String[] args) {
    Array_Indexing.newarr(1);
    Array_Indexing.newarr(2);
    Array_Indexing.newarr(3); 
    Array_Indexing.newarr(4);
    printAll();
 }
 }