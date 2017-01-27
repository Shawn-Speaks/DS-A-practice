package nyc.c4q.shawn;

/**
 * Created by shawnspeaks on 1/23/17.
 */
public class Recursion {

    public static void main(String[] args) {
//        int wow = count(11, 10);
//        System.out.println(wow);
//        System.out.println(changeXY("xxhixx"));
//        System.out.println(removeDuplicates("awwwwwhhhh  yyyyeeaaaahhhhhh"));


    }


    private static int count(int lowerBound, int upperBound){
        if(lowerBound == upperBound || lowerBound > upperBound){
            System.out.println(lowerBound);
            return 0;
        }
        System.out.println(lowerBound);
        return count(lowerBound+1, upperBound)+1;
    }

    private static String changeXY(String input){
        if(input.isEmpty()){
            return "";
        }
        if(input.charAt(0) == 'x'){
            input = "y" + input.substring(1, input.length());
        }
        return input.charAt(0) + "" + changeXY(input.substring(1, input.length()));
    }


    private static String removeDuplicates(String input){
        if (input.length() == 1 || input.isEmpty()){
            return input + "";
        }
        if(input.charAt(0) == input.charAt(1) && input.length()!= 1){
            input = input.substring(1, input.length());
            return removeDuplicates(input.substring(0, input.length()));
        }else
            return input.charAt(0) + removeDuplicates(input.substring(1, input.length())) + "";
    }



}
