
/**
 * Sudoku
 *ex02: 
 * This class will represent a board of Sudoku game with
 * A 3x3 two-dimensional array of Square3x3 objects
 * @author Elishay Amar ID 318840394 
 */
public class Sudoku
{
    private Square3x3 [][] _sudokuArr=new Square3x3[3][3];
    private final int LEN_OF_BORAD=9;
    /**
     * An empty constructor that will initialize the sudoku board so that it is composed of objects
     * Of the Square3x3 class which are all filled with values -1
     * (as created by the empty constructor of the Square3x3 class)
     */
    public Sudoku(){
        for (int i=0;i<_sudokuArr.length;i++)
        {
            for (int j=0;j<_sudokuArr[i].length;j++)
                _sudokuArr[i][j]=new Square3x3();
        }
    }

    /**
     * A constructor that receives as a parameter a 3x3 array of objects of the class "Square3x3", 
     * and will copy the values in these objects to the new 
     * sudoku board.
     * @param Array represents the 3x3 array of objects of the class "Square3x3"
     */
    public Sudoku(Square3x3 [][] Array){
        for (int i=0;i<_sudokuArr.length;i++)
        {
            for (int j=0;j<_sudokuArr[i].length;j++){

                _sudokuArr[i][j]=new Square3x3( Array[i][j]);
            }
        }

    }

    /**
     * A method that checks the integrity of the rows in the  sudoku board by going over each row of the board.
     * If the row from the game board is correct, the method will return 'True'
     * @param row represent the row number from the board that the method is checikg each run 
     * @return true if the row is correct

     */
    private  boolean checkEachRow(int row)
    {
        Square3x3  sqrForCheck =new Square3x3();
        int sqr=0;// this var is to chack in  the loop in wich part of the board we are

        for (int i=0;i<3;i++)
        {
            if (row >= 6 )//This means that the row is in the third part of the board
            {
                row-=6;
                sqr=2;
            }
            if(row>=3&&row<=6)//This means that the row is in the second part of the board
            {
                row-=3;
                sqr=1;
            }

            for (int j=0;j<3;j++)
                sqrForCheck.setXY(i, j, _sudokuArr[sqr][i].getCell(row,j));// create a squere from the data from the row

                }        return sqrForCheck.allThere();// check if the squere (=the row) is correct 
    }

    /**
     * A method that checks the integrity of the columns in the  sudoku board by going over each column of the board.
     * If the column from the game board is correct, the method will return 'True'
     * @param col  represent the  column number from the board that the method is checikg each run 
     * @return true if the row is correct

     */
    private  boolean checkEachColumn(int col)
    {
        Square3x3  sqrForCheck =new Square3x3();

        int sqr=0;// this var is to chack in  the loop in wich part of the board we are
        if (col >= 6 )//This means that the col is in the third part of the board
        {
            col-=6;
            sqr=2;

        }
        if(col>=3&&col<=6)//This means that the col is in the second part of the board
        {
            col-=3;
            sqr=1;

        }
        for (int i=0;i<3;i++)
        {

            for (int j=0;j<3;j++){
                sqrForCheck.setXY(i, j, _sudokuArr[i][sqr].getCell(j,col));// create a squere from the data from the column 

            }

        }
        return sqrForCheck.allThere(); // check if the squere (=the column) is correct 
    }

    /**
     * This method will check if the sudoku board is valid.
     * If so - return true. If the board is invalid - return false
     * @return true if the board is valid else return false
     */
    public boolean isValid(){
        for (int i=0;i<_sudokuArr.length;i++)
        {
            for (int j=0;j<_sudokuArr[i].length;j++)// check each squere
                if (_sudokuArr[i][j].allThere()==false)
                    return false;
        }
        for (int i=0 ;i<LEN_OF_BORAD;i++)// check each row and check each column
            if (checkEachRow(i)==false||checkEachColumn(i)==false)
                return false;

        return true;
    }

}
