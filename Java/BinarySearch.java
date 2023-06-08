package Java;
import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        int toSearch = 5;
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==toSearch){
                System.out.println("Found");
                break;
            }
            if(arr[mid]>toSearch){
                high = mid-1;
            }
            if(arr[mid]<toSearch){
                low = mid+1;
            }
        }
    }
}