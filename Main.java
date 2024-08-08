import java.util.Scanner;

public class Main {

    static int largest(int ashmi[]) //This function returns the largest element in the array

    {
        int max=0;
        for(int i=0;i<ashmi.length;i++)
        {
            if(ashmi[i]>max)
            {
                max=ashmi[i];
            }
        }
        return max;
    }
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        int[] ashmi=new int[5];
        for(int i=0;i<ashmi.length;i++)
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            ashmi[i]=a;
        }
        System.out.println(largest(ashmi));
        //for(int i=0;i<ashmi.length;i++)
        //{
        //    System.out.println(ashmi[i]);
        //}


    }
}