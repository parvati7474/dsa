package DSA;

public class FindMiss {
    static int findMiss(int[] arr,int n){
     int xor=0;
     for(int i=1;i<=n;i++){
        xor=xor^i;
     }
     for(int i=0;i<arr.length;i++){
        xor=xor^arr[i];
     }
     return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5};
        int n=5;
        int miss=findMiss(arr, n);
        System.out.println(miss);
    }
}
