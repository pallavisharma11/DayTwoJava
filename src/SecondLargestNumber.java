import java.util.Arrays;
public class SecondLargestNumber 
{
    public static void main(String[] args)
    {
        int[] a = {12,5,98,65,54};
        Arrays.sort(a);
       
        System.out.println(a[a.length - 2]);
       
    }
    
}
