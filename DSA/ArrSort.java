package DSA;

public class ArrSort {
    static boolean isSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;

}
public static void main(String[] args) {
    int arr[]={12,13,14,15,16};
  boolean ans=  isSort(arr);
 System.out.println(ans);
}
}