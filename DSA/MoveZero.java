package DSA;

public class MoveZero {
    static void moveZero(int[] arr){
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                i=j;
                break;
            }
        }
        if(i==-1){
            return;
        }
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        moveZero(arr);
        System.out.println("The array after moving zeros to the end is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
