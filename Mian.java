import java.util.Arrays;

public class Mian{
    public static void main(String args[]){
        int arr[]={1,5,3,4,1,2};
        int n=arr.length;
        int r=0;
        //find repeating element
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                    System.out.println("the repeating element is: "+arr[i]);
                r+=i;
                break;
                }
                break;
            }
        }
        //find the missing element
       
        for(int i=0;i<arr.length;i++){
 int minIndex=i;
 for(int j=i+1;j<arr.length;j++){
if(arr[j]<arr[minIndex]){
    minIndex=j;
}
 }
 if(minIndex!=i){
    swap(arr,i,minIndex);
 }
        }
            System.out.println(Arrays.toString(arr));  
    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
// find missing element
public static int missingElement(int arr[],int n,int m){
    
    }
}
}
 