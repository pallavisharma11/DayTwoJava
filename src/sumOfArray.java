
public class sumOfArray 
{
    static void sum(int[] b){
        int sum = 0;
        for(int i =0 ; i<b.length;i++){
            sum += b[i];
        }
        System.out.println("sum is : " +sum);
    }
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        sum(a);
    }
    
}
