import java.util.Scanner;
public class lowertriangular {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows:");
        int rows=sc.nextInt();
        System.out.println("Enter columns: ");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter elements of matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        if(rows!= cols){
            System.out.println("Matrix should be square matrix");
        }
        else{
            System.out.println("Lower Triangular Matrix: ");
            for(int i =0;i<rows;i++){
                for(int j = 0;j<cols;j++){
                    if(j>i){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print(arr[i][j]+" ");
                    }
                }
                System.out.println();
            }
        }


    }
}