package array;

public class Test {

    public static void main(String... agrs){
        System.out.println("Loop Using Enhanced for loop:");
        int[][] contents = { { 88, 66, 79 }, { 56, 25, 39 }, { 58, 47, 69 } };

        for (int[] eachRow : contents) {
            for (int j : eachRow) {
                System.out.print(j + "\t");
            }
            System.out.println("");
        }
      ///////////////////////////////////////////////////////////////////////////
        char[][] arrays = {{'g','j'},{'h','k'},{'i','l'}};
        for(char[] xx : arrays){
            for(char yy: xx){
                System.out.print(yy);
            }
            System.out.println(" ");
        }

    }

}

