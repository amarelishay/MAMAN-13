public class StudentEx13Tester
{
    public static void main(String[] args) {
        System.out.println("Using Square3x3 default constructor...");
        Square3x3 sq1 = new Square3x3();

        System.out.println("Using Square3x3 second constructor...");
        int[][] arrForSecondConstructor = {{1, 2, 6}, {4, 8, 3}, {7, 5, 9}};
        Square3x3 sq2 = new Square3x3(arrForSecondConstructor);
        System.out.println(sq1);
        System.out.println(sq2);
        System.out.println(sq2.allThere());
        boolean [] checkwhos = new boolean [] {false,false,false,false,false,false,false,false,false,false};
        Square3x3 sq3 =new Square3x3(new int [][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        sq3.whosThereCol(2, checkwhos);
        Square3x3 sq4 =new Square3x3(new int [][]{{8,2,7},{9,6,5},{3,4,1}});
        Square3x3 sq5=new Square3x3(new int [][]{{1,5,4},{3,2,7},{6,8,9}});
        Square3x3 sq6 =new Square3x3(new int [][]{{3,9,6},{1,4,8},{7,5,2}});
        Square3x3 sq7 =new Square3x3(new int [][]{{5,9,3},{4,7,2},{6,1,8}});
        Square3x3 sq8 =new Square3x3(new int [][]{{4,6,8},{5,1,3},{9,7,2}});
        Square3x3 sq12 =new Square3x3(new int [][]{{9,1,4},{8,2,3},{5,6,7}});
        Square3x3 sq9 =new Square3x3(new int [][]{{2,7,1},{6,8,9},{4,3,5}});
        Square3x3 sq10 =new Square3x3(new int [][]{{7,8,6},{1,5,4},{2,3,9}});
        Square3x3 sq11 =new Square3x3(new int [][]{{2,3,5},{7,9,6},{8,4,1}});
        Square3x3 [][] _arrtest=new Square3x3[3][3];
        _arrtest[0][0]=sq4;
        _arrtest[0][1]=sq5;
        _arrtest[0][2]=sq6;
        _arrtest[1][0]=sq7;
        _arrtest[1][1]=sq8;
        _arrtest[1][2]=sq9;
        _arrtest[2][0]=sq10;
        _arrtest[2][1]=sq11;
        _arrtest[2][2]=sq12;

        Sudoku s1=new Sudoku(_arrtest);
        System.out.println(s1.isValid());

        int [][] test = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        Square3x3 sq13 =new Square3x3(test);
        System.out.println(sq13);
        System.out.println(new Square3x3(sq13));
        System.out.println(sq13.getCell(0, 2));
        sq13.setXY(0,2,8);
        System.out.println(sq13);
        System.out.println(sq13.getCell(0, 4));
        System.out.println(new Square3x3(new int [][]{{1,3,2},{7,9,6},{8,4,5}}) .allThere());
        boolean [] check1= {false,false,false,false,false,false,false,false,false,false};
        sq13.whosThereRow(2,check1);
        for (int i=0;i<check1.length;i++)
        System.out.print(check1[i]+" ");
        System.out.println();
        boolean [] check2= {false,false,false,false,false,false,false,false,false,false};
        sq13.whosThereCol(1, check2);
        for (int i=0;i<check1.length;i++)
        System.out.print(check2[i]+" ");
        System.out.println();

    }

    }
}