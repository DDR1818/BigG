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

    public static void triangle(int rows){
        int row = 0;
        String text = "";
         while (row < rows){
             row ++;
             int row2 = 0;
            while(row2 < rows){
                System.out.print(row);
            }
        }
    }
    public static void main(String[] args){
         stars(7);
         triangle(9);
    }
}
