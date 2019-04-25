package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Intermediate Eliza
        HashMap<String, String> table = new HashMap<String, String>();

        table.put("i", "you");
        table.put("me", "you");
        table.put("my", "your");
        table.put("am", "are");
        //table.put("i", "you");


        Scanner keyboard = new Scanner(System.in);
        //List answerArray = new ArrayList<String>();
        String answer;

        System.out.println("Good day. What is your problem?");
        while (true) {
            System.out.print("\nEnter your response here or Q to quit : ");
            answer = keyboard.nextLine().toLowerCase();
            if (answer.equals("q")) {
                break;
            } else {
                String[] answerArray = answer.split("\\s");

               // for (String i : answerArray) {
               //     System.out.println(i);
               // }

                for (int j = 0; j < answerArray.length; j++) {
                    String answerKey = answerArray[j];
                    if (table.get(answerKey) != null) {
                      //  System.out.println(table.get(answerKey));
                        answerArray[j] = table.get(answerKey);
                    }
                }
                for (String i : answerArray) {
                    System.out.print(i + " ");
                }
                if (answer.equalsIgnoreCase("I am feeling great") ){
                    break;
                }
            }
        }
        System.out.println("\n>>> BYE!!");// write your code here

   }
}
