public class Patterns{
    //Precondition: rows is needed to start at 0
    //Postcondition: Creates a triangle of stars
    public static void stars(int rows){
        String star = "*";
        int num = 0;
        while (num < rows){
             System.out.println(star);
            num ++;
            star += "**";
        }
    }

    //Precondition: rows is needed to start at zero
    //Postcondition: Creates a triangle of nubers adding 1 to every row
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

    //Precondition: Needs start to start at 0
    //Postcondition: Creats a upside down triangle starting at 9 and going down 2 each row
    public static void odds(int start){
        for(int row = start; row >= 1 ; row -=2){
            for(int col = 0; col < row; col ++){
                System.out.print(row);
            }
            System.out.println();
        }
    }

    //Precondition: start is needed to start at 0
    //Postcondition: Creates two triangles one up and one down and looping through o and e every row
    public static void eo(int maxE){
        String letter = "E";
        if(maxE%2 == 0){
            letter = "O";
        }
       //go up
        for (int row3 = 1; row3 <= maxE; row3++){
            for (int col3 = 0; col3 < row3; col3++){
               System.out.print(letter);
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
          for (int row3 = maxE - 1; row3 > 0; row3--){
            for (int col3 = 0; col3 < row3; col3++){
               System.out.print(letter);
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

    //Precondition: rows has to start at 0
    //Postcondition: Should create a upside down pyramid starting at 1 and going up every row
    public static void pyramid(int rows){
        String pyr = "";
        int num2 = 9;
    }
    public static void main(String[] args){
         stars(7);
         triangle(10);
         odds(9);
         eo(6);
         pyramid(9);
    }
}
