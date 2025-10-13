import java.util.*;
public class test{
    public static void main(String args[]){
        int[] arr={1,2,3,2,6,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int m=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[m]){
                    m=j;
                }
                if(m!=i){
                    swap(arr,i,m);
                }
            }
        }
       System.out.println(Arrays.toString(arr)); 
       System.out.println("Let us find the missing element");
       
    }
    
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    
}