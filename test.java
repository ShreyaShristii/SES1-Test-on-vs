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
       System.out.println("Let us find the missing element"+missing(arr));
       System.out.println("S"+twice(arr));
       
    }
    
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void twice(int[] arr){
        int r=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    r+=arr[i];
                }
            }
        }
    }
    public static void missing(int[] arr){
        int s=0;
        int es=0;
         
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        int missing=es-s+arr[r];
        System.out.println(missing);

    }

    
}