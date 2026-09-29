package DSA;

public class Second {
    static int secSmall(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int small=Integer.MAX_VALUE;
        int secSmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                secSmall=small;
                small=arr[i];
            }
            else if(arr[i]<secSmall && arr[i]!=small){
                secSmall=arr[i];
            }
        }
        return secSmall;
    }
    static int secLarge(int[] arr){
        if(arr.length<2){
            return -1;
        }
        int large=Integer.MIN_VALUE;;
        int secLarge=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secLarge=large;
                large=arr[i];
            }
            else if(arr[i]>secLarge && arr[i]!=large){
                secLarge=arr[i];
            }
        }
        return secLarge;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,7,7,5};
        int res=secSmall(arr);
        System.out.println(res);
        int res1=secLarge(arr);
        System.out.println(res1);
    }
}
    
        
    

