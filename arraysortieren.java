
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Random;
public class App {
    /*  sotieren die Zahlen eines Arrays */
    public static void main(String[] args) {
           
    
    ausgabe(parameter(6));
   }

    public static String parameter(int i) {
    
      int[] arr = new int[i];
      int min = 1;
      int max = 100;
      String liste= " ";
 for (int j = 0; j < arr.length; j++) {
     
 
    arr[j] = (int) (Math.random()*(max-min)) + min;
    liste=liste + " " + arr[j] ;
    // arr[1] = b;
    // arr[2] = c;
}

    ausgabe("die unsotierte liste ist: " + liste);

    arr=Arrays.stream(arr).sorted().toArray();
    String s = "" + arr[0];
for (int j = 1; j < arr.length; j++) 

{
    
    s = s + " <= " + arr[j];
}
return s;
     
    }

    public static void ausgabe(String outputStr) {
      System.out.println(outputStr);  
    }


}
