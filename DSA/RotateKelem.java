package DSA;

public class RotateKelem {
    static void rev(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void  leftRot(int[] arr,int k){
        int n=arr.length;
        if(n==0){
            return;
        }
        k=k%n;
        if(k==0){
            return;
        }
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }
    public static void main(String[] args){
       int arr[]={1,2,3,4,5};
       int k=2;
       leftRot(arr,k);
         System.out.println("The array after left rotation is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
    }
}
}
