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
        System.out.println("\nNumer of digits in 93825524 is "+Ndigit(93825524,0));
        System.out.println("\n Power(4,4) is "+Power(4,4));
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
    public static int Ndigit(int n,int c){
        if(n==0)return 0;
        while(n>=1){
            c++;
            n/=10;
        }
        return c;
    }
    public static int Power(int a,int n){
        if(n==0)return 1;
        while(n!=0){
            n-=1;
            return Power(a,n)*a;
        }return 1;
    }
}