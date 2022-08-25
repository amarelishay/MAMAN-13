
/**
 * Square3x3.
 *ex 1 : 
 * the class represents a square  with a two-dimensional array of integers at the size of  3 × 3 .   
 * @author Elishay Amar ID:318840394
 */
public class Square3x3
{
    private int[][] _sqrArr = new int [3][3];
    private final int DEFAULT_VALUE=-1;
    private final int MAX_VALUE=9;
    /**
     * Constructor for objects of class Square3X3. Constructs and initializes a 2-dimensional
     * array of the size 3X3, with the values of –1 in each cell
     */
    public Square3x3() {
        for (int i=0;i<_sqrArr.length;i++){
            for (int j=0;j<_sqrArr[i].length;j++)
                _sqrArr[i][j]=DEFAULT_VALUE;
        }
    }

    /**
     * Constructs a 2-dimensional array of the size 3X3, whose values are taken from the given
     *array. If the given array’s size is bigger than 3X3, only the first 3X3 cells are taken. If the
     *given array is smaller, the rest of the cells are initialized to –1. 
     */

    public Square3x3(int[][]array) {
        for (int i=0;i<_sqrArr.length;i++){
            for (int j=0;j<_sqrArr[i].length;j++)
            {
                if (i>=array.length||j>=array[i].length)
                {
                    _sqrArr[i][j]=DEFAULT_VALUE;
                }
                else 
                    _sqrArr[i][j]=array[i][j];
            }
        }
    }

    /**
     * Copy constructor. Constructs a 2-dimensional array of the size 3X3, whose values are
     * taken from the array of the given Square3x3 object. 
     */
    public Square3x3(Square3x3 other){
        for (int i=0;i<_sqrArr.length;i++){
            for (int j=0;j<_sqrArr[i].length;j++)
            {
                _sqrArr[i][j]=other._sqrArr[i][j];   

            }
        }
    }

    /**
     * Returns the value in the (row, col) cell. If the row and/or col are out of the
    array bounds, returns –1. Legal values for row/col are 0,1,2. 
    @param row represents the row number
    @param col represents the col number
    @return the value in the (row, col) cell
     */
    public int getCell(int row,int col){
        if (row > _sqrArr.length||row<0)
            return DEFAULT_VALUE;
        if (col>_sqrArr[row].length || col <0 )
            return DEFAULT_VALUE;       
        int cell=_sqrArr[row][col];
        return cell;

    }

    /**
     * Sets the cell (row, col) in the array to the given value. If the row and/or col
     * are out of the array bounds – does nothing. Legal values for row/col are
     * 0,1,2. 
     */
    public void setXY(int row ,int col,int value){
        if (row >=0 && row <= _sqrArr.length && col >=0 && col<=_sqrArr[row].length)
            _sqrArr[row][col]=value;
    }

    /**
     * Returns a String representation of the array. 
     * @return a String representation of the array.
     */
    public String toString(){
        String sqr ="";
        for (int i=0 ; i<_sqrArr.length;i++)
        {
            for (int j=0;j<_sqrArr.length-1;j++){
                sqr+=_sqrArr[i][j]+"\t";
            }
            sqr+=_sqrArr[i][_sqrArr[i].length-1];
            sqr+="\n";
        }
        return sqr;
    }

    /**
     * A Boolean method called allThere .This method will check if 
     * the array of the class contains all the numbers from 1 to 9. 
     * It will return true if so, and otherwise false
     */
    public boolean allThere(){

        int count=1;

        for (int i=0;i<_sqrArr.length;i++)//In the loop, every cell in the array is searched for the count value. If it is found, tha loop updates it to count +1, and looks again ,when count equals to 9. This means all the numbers from 1 to 9 are present, and the method returns true
        {
            for (int j=0;j<_sqrArr.length;j++)
            {
                if (_sqrArr[i][j]==count)
                {         
                    j=_sqrArr.length;
                    i=-1;//restart the loop serch 
                    if (count==MAX_VALUE)
                        return true ;
                    else
                        count++;          
                }  
            }
        }    
        return false;
    }

    /**
     * The method gets a row number (from the values 2,1,0) and a Boolean array of size 10.
     * For any number between 9-1 that appears in the corresponding row in the two-dimensional array of the 
     * class the method will place a true value in the corresponding cell in the array of values.
     * The rest of the cells in the array will remain unchanged
     * @param row represent the row number
     * @param values represent the Boolean array of size 10
     */
    public void whosThereRow(int row,boolean [] values){
        if (row>=0&&row<_sqrArr.length)
        {
            for (int i=0;i<_sqrArr[row].length;i++){
                if (_sqrArr[row][i]>0&&_sqrArr[row][i]<=10)
                    values[_sqrArr[row][i]]=true;
            }
        }
    }

    /**
     * The method gets a col number (from the values 2,1,0) and a Boolean array of size 10.
     * For any number between 9-1 that appears in the corresponding col in the two-dimensional array of the 
     * class the method will place a true value in the corresponding cell in the array of values.
     * The rest of the cells in the array will remain unchanged
     * @param col represent the row number
     * @param values represent the Boolean array of size 10
     */
    public void whosThereCol(int col,boolean [] values){
        if (col >=0 && col <_sqrArr.length)
        {
            for (int i=0;i<_sqrArr.length;i++){
                if (_sqrArr[i][col]>0&&_sqrArr[i][col]<=10)
                    values[_sqrArr[i][col]]=true;
            }
        }
    }

}
