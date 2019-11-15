package javademotwo;

public class text13 {
    public static void main(String[] args){
        int score=94;
        String sex="女";
        if (score>80){
            if (sex=="女"){
             System.out.println("进入女组决赛");
            }else {
                System.out.println("进入男子组决赛");
            }
        }else {
            System.out.println("未进入决赛");
        }



    }
}
