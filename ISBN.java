import java.util.*;//IMPORTING UTIL PACKAGE
public class ISBN   {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER : ");
        int num = sc.nextInt();
        int p=num;
        int sum=0;
        for(int i=1;i<=10;i++)
        {
            int rem = num%10;
            sum = sum + (rem*i);
            num/=10;
        }
        if(sum%11 == 0)
        {
            System.out.println(p+" IS AN ISBN NUMBER");
        }
        else
        {
            System.out.println(p+" IS NOT AN ISBN NUMBER");
        }
    }
}