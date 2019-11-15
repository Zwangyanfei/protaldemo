package java191115;

import java.util.Scanner;

public class Zshu {
    public static  void  main(String[] args){

        Scanner in=new Scanner(System.in);
        System.out.println("请输入两个数进行加减乘除！");
        System.out.print("请输入第一个数a=");
        int a=in.nextInt();
        System.out.print("请输入第二个数b=");
        int b=in.nextInt();jcc(a,b);
    }
    public static void jcc(int x,int y ){
        int he=x+y;
        int ca=x-y;
        int cf=x*y;
        int chu=x/y;
        System.out.println("**********************");
        System.out.println("和a+b="+he);
        System.out.println("减a-b="+ca);
        System.out.println("乘a*b="+cf);
        System.out.println("除a/b="+chu);
        System.out.println("**********************");






    }
}
