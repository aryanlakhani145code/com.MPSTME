package com.company;
import java.util.*;
public class prime {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO CHECK FOR PRIME :");
        int num = sc.nextInt();
        int count=0;
        for(int i =1; i<=num;i++)
        {
           if (num%i ==0)
           {
               count++;
           }
        }
        if (count ==2)
        {
            System.out.println("ITS A PRIME NUMBER!");
        }
        else
        {
            System.out.println("ITS NOT A PRIME NUMBER!");
        }
    }
}
© 2022 GitHub, Inc.
