package javademo;


import java.util.Scanner;

public class Xunhuan {
    private static Xunhuan out;

    public static void main(String[] args){
//        int sum=0;
//        for (int i=1;i<101;i+=2){
//            sum=sum+i;
//        }
//        System.out.println(sum);
//        int suml=1;
//        for (int q=1;q<6;q++){
//            suml*=q;
//
//        }System.out.println(suml);
        Scanner in=new Scanner(System.in);
        int tian =in.nextInt();
          if(tian%7==1){
              System.out.println("今天星期一");
          }
          else if (tian%7==2){
              System.out.println("今天星期2");
          }
          else if (tian%7==3){
              System.out.println("今天星期3");
          }
          else if (tian%7==4){
              System.out.println("今天星期4");
          }
          else if (tian%7==5){
              System.out.println("今天星期5");
          }
          else if (tian%7==6){
              System.out.println("今天星期6");
          }
          else if(tian%7==0){
              System.out.println("今天星期7");
          }








    }

}
