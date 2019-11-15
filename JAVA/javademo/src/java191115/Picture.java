package java191115;

import java.util.Scanner;

//public class Picture {
//    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        int m=in.nextInt();
//        int n=in.nextInt();
//        printf(m,n);
//    }
//    public  static void printf(int a,int b){
//       int j=0;
//            for (int i=0;i<a;i++)
//            {   for (int c=0;c<j;c++){ System.out.print("2"); }
//                for ( j=0;j<b;j++)
//                {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//
//    }}
public class Picture {
    public static void main(String[] args) {
        //外层循环 每次打出一个*
        for (int i = 1; i <=5; i++) {
            //填充空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //内层循环 每次打印一个*
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

