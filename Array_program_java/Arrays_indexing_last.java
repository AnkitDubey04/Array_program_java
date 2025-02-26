public class Arrays_indexing_last {

   static int aar[] = new int[10];
     static int currentposition = -1;
 
      public static void addLast(int newvalue){

    if (currentposition < aar.length-1) {
        currentposition++;
          aar[currentposition] = newvalue;
    }
       }
      public static void printAll(){
    for (int i = 0; i<=currentposition; i++) {
        System.out.print(  aar[i]+ " ");
    }
 }
     public static void main(String[] args) {
       addLast(12);
       addLast(23);
       addLast(34);
       addLast(45);
       addLast(5);
       printAll(); 
     }
      
}

