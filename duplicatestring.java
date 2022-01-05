import java.util.Scanner;
public class duplicatestring{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string:");
        String str = sc.next();
        int count=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length()-1;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            }
        System.out.println("Number of duplicates are:"+count);
    }
}