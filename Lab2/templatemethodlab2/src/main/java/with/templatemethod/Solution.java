package with.templatemethod;
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        ArrayList<String> stringsIn = new ArrayList<String>();
        ArrayList<String> stringsOut = new ArrayList<String>();

        // Complete the following test using Java and return your working code. Put your code in only this file. Given a random alpha-numeric string with no special characters, reformat the string without adding or removing any characters so that no alphabet characters are adjacent to any other alphabet characters and no numeric characters are adjacent to any other numeric characters, if possible, and return the modified string. If it is not possible to reformat the string in that way, then group all the alphabet characters at the beginning of the string and all numeric characters at the end of the string. In either case keep all alphabet characters in the same order relative to each other before and after the formatting and also keep all numeric characters in the same order releative to each other before and after the formatting.

        // Example input1: "aabb12cc345"
        // Example output1: "a1a2b3b4c5c"
        // Example input2: "a1aa"
        // Example output2: "aaa1"

        stringsIn.add("aabb12cc345");
        stringsIn.add("a1aa");

        stringsOut.add("a1a2b3b4c5c");
        stringsOut.add("aaa1");

        int numCorrect = 0;

        for (int i = 0; i < stringsIn.size(); i++) {
            String result = reformatString(stringsIn.get(i));
            if (result.equals(stringsOut.get(i))) {
                numCorrect++;
            }
        }

        System.out.println("Correct: " + numCorrect + " out of total: " + stringsIn.size());

        return;
    }

    private static String reformatString(String str) {
        if(str.length() <= 0 || str == null) return str;
        Queue<Character> characters = new LinkedList<>();
        Queue<Character> numbers = new LinkedList<>();

        for(int i = 0; i < str.length(); i++){
            char a = str.charAt(i);
            if(Character.isLetter(a)) characters.add(a);
            else if(Character.isDigit(a)) numbers.add(a);
        }
        if(Math.abs(characters.size() - numbers.size()) > 1){
            StringBuilder stringBuilder = new StringBuilder();
            while(!characters.isEmpty()) stringBuilder.append(characters.poll());
            while(!numbers.isEmpty()) stringBuilder.append(numbers.poll());
            return stringBuilder.toString();
        }
        if(characters.size() >= numbers.size()){
           return helperMethod(characters, numbers);
        }
        else {
            return helperMethod(numbers, characters);
        }
    }
    public static String helperMethod(Queue<Character> one, Queue<Character> two){
        StringBuilder stringBuilder = new StringBuilder();
        while(!one.isEmpty() && !two.isEmpty()){
            stringBuilder.append(one.poll());
            stringBuilder.append(two.poll());
        }

        if(!one.isEmpty()) stringBuilder.append(one.poll());
        return stringBuilder.toString();
    }

}

