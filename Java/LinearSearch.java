package Java;
import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int toSearch = 4;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==toSearch){
                System.out.println("Found");
                break;
            }
        }
    }
}
