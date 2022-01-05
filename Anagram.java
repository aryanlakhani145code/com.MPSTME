import java.util.*;
public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST STRING : ");
        String str1=sc.nextLine();
        System.out.println("ENTER SECOND STRING : ");
        String str2=sc.nextLine();

        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

       
        if (str1.length() != str2.length()) {
            System.out.println("Both the strings are not anagram");
        }
        else {
            
            char[] s1 = str1.toCharArray();
            char[] s2 = str2.toCharArray();

            Arrays.sort(s1);
            Arrays.sort(s2);

            
            if(Arrays.equals(s1, s2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
    }
}