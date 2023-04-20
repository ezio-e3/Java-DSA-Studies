import java.util.Arrays;

public class ArrayStudies {
    //declaring one-dimensional array
    int[] numbers = new int[10];
    //where size of array and variables are known already
    int[] otherNumbers = new int[]{1,2,3,4,5};
    //declaring a multidimensional array
    int[][] numberGrid = new int[3][3];
    int[][] numbersGrid = {{1,2},{3,4},{5,6},{7,8},{0,9}};

    public void printArrayElements(){
        for (int i = 0; i < otherNumbers.length; i++) {
            System.out.println(otherNumbers[i]);
        }
    }
    public void print2DArrays(){
        for (int i = 0; i < numbersGrid.length; i++){
            for (int j = 0; j < numbersGrid.length; j++){
                System.out.println();
            }
        }
    }



}
