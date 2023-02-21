import java.util.*;

public class p2 {
    public static void main(String[] args) {
        int i,n;
        try (Scanner sc = new Scanner(System.in)) {
          System.out.println("enter the size of the array: ");  
          n=sc.nextInt();
            int arr1[]=new int[n];
            for (i = 0; i <n; i++) {
               arr1[i]=sc.nextInt();
            }
            System.out.println("element of the array is: ");
            for (i = 0; i <n; i++) {
              System.out.println(arr1[i]);
            }
        }
          
    }
}
