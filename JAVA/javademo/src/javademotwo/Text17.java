package javademotwo;

public class Text17 {
    public static void main(String[] args){
        int sum=0;
        int num=2;
        do {
            sum+=num;
            num=num+2;
        }while (num<51);
        System.out.println("50以内的偶数和为："+sum);
    }
}
