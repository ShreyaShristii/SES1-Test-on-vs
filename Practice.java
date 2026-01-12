// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Practice {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        System.out.print("\nSum of all Natural numbers till 8 is"+Sum(8));
        System.out.print("\nSum of all even numbers till 8 is\n "+Even(8));
        System.out.print("\nAll numbers till 8 are");
        All(8);
        System.out.print("\nAll numbers in reversed order \n");
        Reversed(8,1);
        System.out.print("\nFactorial of 8 \n"+Fact(8));
        System.out.print("\nSum of all digits of 348 "+Dsum(348));
        System.out.println("\nNumer of digits in 93825524 is "+Ndigit(93825524));
        System.out.println("\n Power(4,4) is "+Power(4,4));
        System.out.println("Reversed of 7842 is "+reverseD(7842,0));
        System.out.println(checkPalin(11131));
        int[] a={2,32,3,10,11,-232};
        int[] values={1,2,3,4,5,5,6,7,8,8,5};
        System.out.println("Sum of The given elements of array is: "+arraySum(a,0,0));
        System.out.println("Elements of the array are:");
        traverse(values,0);
        System.out.println("\nMax of all the elements in the array: "+max(values,0,1));
        System.out.println("Is the array sorted?"+sortCheck(a,0,false));
        System.out.println("Total occurences of the given element in the array is "+occur(values,5,0,0));
    }
    public static int Sum(int n){
        if(n==0) return 0;
        return n+Sum(n-1);
    }
    public static int Even(int n){
        if(n==0)return 0;
        if(n%2==0) {
           return n+Even(n-1);
        }
        return Even(n-1);
    }
    public static void All(int n){
        if(n==0) return ;
        System.out.println(n);
         All(n-1);
        //return All(n-1);
    }
    public static void Reversed(int n,int r){
        //int r=1;
        if(r==n+1)return ;
        System.out.println(r);
        Reversed(n,r+1);
    }
    public static int Fact(int n){
        if(n==0)return 1;
        return n*Fact(n-1);
    }
    public static int Dsum(int n){
        if(n==0)return 0;
        return Dsum(n/10)+n%10;
    }
    public static int Ndigit(int n){
        if(n<10)return 1;
        // while(n>=1){
        //     c++;
        //     n/=10;
        // }
        return Ndigit(n/10)+1;
    }
    public static int Power(int a,int n){
        if(n==0)return 1;
        return a*Power(a,n-1);
    }
    public static int reverseD(int n,int r){
        if(n==0) return r;
        int d=n%10;
        r=r*10+d;
        return reverseD(n/10,r);
    }
    public static boolean checkPalin(int n){
        if(n==reverseD(n,0)) return true;
        return false;
    }
    public static int arraySum(int[] a,int n,int s){
        if(n==a.length)return s;
        return a[n]+arraySum(a,++n,s); 
    }
       static void traverse(int[] a,int i){
        int n=a.length;
       // int i=0;
       if(i==n)return;
       System.out.print(a[i]+" ");
       traverse(a,i+1);
    }
    static int max(int[] a,int max,int i){
        int n=a.length;
        if(i==n)return max;
        if(a[i]>max){
            max=a[i];
        }
        return max(a,max,i+1);
        //return max;

    }
    static boolean sortCheck(int[] a,int c,boolean f){
        if(c==a.length-1) return true;
        if((a[c]>a[c+1]))return false;
        return sortCheck(a,c+1,f);
    }
    static int occur(int[] a,int target,int i,int c){
        if(i==a.length)return c;
        if(a[i]==target)c++;
        return occur(a,target,i+1,c);

    }
}