package nyc.c4q.shawn;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by shawnspeaks on 1/22/17.
 */
public class TwoDimenArray {

    public static void main(String[] args) {
        twoDarrayOfStuff(10,2);
    }

    private static String[][] twoDarrayOfStuff(int x, int y){
        String randomGrayStuff =   "░▒▓";
        String[][] myArray = new String[x][y];
        Random random = new Random();

        for(int i = 0; i < y; i++){
            for(int j = 0; j < x; j++){
                String s = "" + randomGrayStuff.charAt(random.nextInt(2));
                myArray[j][i] = s;
            }
        }

        for(int a = 0; a < y; a++){
            for(int b = 0; b < x; b++){
                System.out.print(myArray[b][a]);
            }
            System.out.println("");
        }


        return myArray;
    }

    public static class Chess {

        public static void main(String[] args) {
                chessBoardArray(8,8);
        }

        private static String[][] chessBoardArray(int width, int height) {
            String both = "# ";
            int alternator = -1;
            String[][] array = new String[width][height];
            for (int y = 0; y < height; y++) {
                alternator = alternator * -1;
                for (int x = 0; x < width; x++) {

                    String current = alternator > 0 ? both.charAt(0) + "" : both.charAt(1) + "";

                    array[x][y] = current;
                    alternator = alternator * -1;
                }
            }
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    System.out.print(array[j][i]);
                }
                System.out.println();
            }
            return array;
        }

    }


    public static class PairSum{

        public static void main(String[] args) {
            int[][] arrayOfArrays = pairSumArray(new int[]{-3,4,2,1,6,-1}, 3);
            for(int[] innerArray: arrayOfArrays ){
                System.out.println(Arrays.toString(innerArray));
            }

        }

        private static int[][] pairSumArray(int[] arrayToParse, int sum) {
            int[][] answerArray = new int[arrayToParse.length / 2][2];
            int answerArrayIdx = 0;
            for (int i = 0; i < arrayToParse.length; i++) {
                for (int j = i+1; j < arrayToParse.length; j++) {
                    int val1 = arrayToParse[i];
                    int val2 = arrayToParse[j];
                    int addedValue = val1 + val2;
                    if (addedValue == sum) {

                        if (answerArrayIdx == arrayToParse.length / 2) {
                            return answerArray;
                        }

                        int[] innerArray = new int[2];
                        innerArray[0] = val1;
                        innerArray[1] = val2;

                        answerArray[answerArrayIdx] = innerArray;
                        answerArrayIdx++;
                    }
                }
            }
            return answerArray;
        }

    }


}
