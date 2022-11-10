package Lesson3;

import java.util.ArrayList;
import java.util.List;

public class Homework {
    private static char[] textGlobal;

    private static List<Integer> signIndexGlobal;

    public static void restore(String text) {
        ArrayList<Integer> signIndex = new ArrayList<>();
        char[] textChar = text.replace("  ", "").toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '_';
            } else if (textChar[i] == '?') {
                signIndex.add(1);
            }
        }
        textGlobal = textChar;
        signIndexGlobal = signIndex;

        repeatСombination(new int[signIndex.size()], 0, 10);
    }
    private static void repeatСombination(int [] comb, int index, int k){
        if(index == comb.length){
            chekComb(comb);
            return;
        }
        for(int i = 0; i < k; i++){
           comb[index] = i;
           repeatСombination(comb, index + 1, k);
        }
    }
    private static void chekComb(int [] comb){
        for(int i = 0; i < comb.length; i++){
            textGlobal[signIndexGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }
        String[] numbers  = String.valueOf(textGlobal).split("_");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a +b == c){
            System.out.printf("%d + %d = %d\n", a, b, c);
        }
    }
}
