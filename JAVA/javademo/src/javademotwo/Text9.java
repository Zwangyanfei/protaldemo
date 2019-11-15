package javademotwo;

public class Text9 {
    public static void main(String[] args){
       int score=53;
       int count=0;
       System.out.println("加分前成绩："+score);
       for (count=0;score<60;count++){
         score=score+1;
       }
        System.out.println("加分后成绩："+score+"\n"+
                           "加分次数："+count
        );
    }

}
