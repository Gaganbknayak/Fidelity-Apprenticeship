package Question7;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        String rev = "";
        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i] + " ";
        }
        System.out.println("Reversed Sentence: " + rev);
    }
}
