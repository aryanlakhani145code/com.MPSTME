package com.company;
import java.util.Scanner;
public class Armstrong 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        int t=n;
        int x=n;
        int arm=0;
        int rem;
        int len=0;
        int mul=1;

        while(t>0)
        {
            t=t/10;
            len=len+1;
        }
        while(x>0)
        {
            rem=x%10;
            for(int i=1;i<=len;i++)
            {
                mul = mul*rem;
            }
            arm = arm+mul;
            x=x/10;
        }
        if(arm==n)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("is not armstrong");
        }
    }
}