public class Patterns{

    public static void stars(int rows){
        String star = "*";
        int num = 0;
        while (num <rows){
             System.out.println(star);
            num ++;
            star += "**";
        }
    }
    public static void main(String[] args){
         stars(7);
    }
}
