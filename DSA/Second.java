package DSA;

public class Second {
    static void findSecond(int[] arr){
        if(arr.length<2){
            return;
        }
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int seclarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secSmall=small;
                small=arr[i];
            }
            else if(arr[i]<secSmall && arr[i]!=small){
                secSmall=arr[i];
            }
            if(arr[i]>large){
                seclarge=large;
                large=arr[i];
            }
            else if(arr[i]>seclarge && arr[i]!= large){
                seclarge=arr[i];
            }
        }
        System.out.println("Second smallest: " + secSmall);
        System.out.println("second largest: "+seclarge);
        

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7,7,5};
       findSecond(arr);
      
    }
}
        