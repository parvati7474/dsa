package DSA;
import java.util.*;
public class UnionofArray {
    static ArrayList<Integer> findUnion(int[] arr1,int[] arr2){
        ArrayList<Integer> union=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else{
                if(union.size()==0 || union.get(union.size()-1)!=arr2[j]){
                   union.add(arr2[j]);
                }
                j++;
            }
        }
        while(i<arr1.length){
            if(union.get(union.size()-1)!=arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while(j<arr2.length){
            if(union.get(union.size()-1)!=arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }
        return union;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={2,3,4,6,7};
        ArrayList<Integer> union=findUnion(arr1, arr2);
        System.out.println(union);
    }
}
