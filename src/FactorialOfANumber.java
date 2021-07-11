import java.util.Scanner;
public class FactorialOfANumber
{
    //Scanner sc = new Scanner(System.in);
    static int Factorial(int m ){
        //int n = sc.nextInt();
        if(m==1){
            return 1;
        }
        else {
            return m*Factorial(m-1);
        }
    }
    public static void main(String[] args){
        FactorialOfANumber obj = new FactorialOfANumber();
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(Factorial(n));
    }
    
}
