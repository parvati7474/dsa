package DSA;

public class LeftRotate {
    static void leftRotate(int[] arr){
        if(arr.length==0){
            return;
        }
    int first=arr[0];
    for(int i=0;i<arr.length-1;i++){
        arr[i]=arr[i+1];

    }
    arr[arr.length-1]=first;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        leftRotate(arr);
        System.out.println("The array after left rotation is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
