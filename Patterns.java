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
        int row =0;
        while(row < rows){
            int col =0;
            while(col<row){
                System.out.print(row);
                col++;
            }
            row++;
            System.out.println();
        }
    }

    public static void odds(int start){
        for(int row = start; row >= 1 ; row -=2){
            for(int col = 0; col < row; col ++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    public static void eo(int maxE){
        String letter = "E";
        if(maxE%2 == 0){
            letter = "O";
        }
       //go up
        for (int row3 = 1; row3 <= maxE; row3++){
            for (int col3 = 0; col3 < row3; col3++){
               System.out.print(letter);
                // if (row3 %2 == 0){
                //     System.out.print(e);
                // }
                // else{
                //     System.out.print(o);
                // }
                // if (col3 < row3){
                //     row3 -=2;
                // }
            }
            if(letter.equals("E")){
                letter = "O";
            }
            else{
                letter = "E";
            }
            System.out.println();
        }

        //go down
          for (int row3 = 1; row3 <= maxE; row3++){
            for (int col3 = 0; col3 < row3; col3++){
               System.out.print(letter);
                // if (row3 %2 == 0){
                //     System.out.print(e);
                // }
                // else{
                //     System.out.print(o);
                // }
                // if (col3 < row3){
                //     row3 -=2;
                // }
            }
            if(letter.equals("E")){
                letter = "O";
            }
            else{
                letter = "E";
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
         //stars(7);
         //triangle(10);
         //odds(9);
         eo(3);
    }
}
