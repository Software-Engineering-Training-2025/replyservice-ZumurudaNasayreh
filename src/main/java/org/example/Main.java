package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //           ((Way1))
        //This way :selected the typeInput by the user using numbers.
        // ((The required is Way1 or Way2))
        ReplyService say = new ReplyService();
        Scanner read = new Scanner(System.in);

        System.out.println("Choose num of type you prefer to reply to you:");
        System.out.println("1. FORMAL");
        System.out.println("2. FRIENDLY");
        System.out.println("3. CONCISE");

        int typeInputNum = read.nextInt();
        read.nextLine();

        String typeInput = "";
        if (typeInputNum == 1)
            typeInput = "FORMAL";
        else if (typeInputNum == 2)
            typeInput = "FRIENDLY";
        else if (typeInputNum == 3)
            typeInput = "CONCISE";
        else {
            System.out.println("Invalid choice, default choice is: 1 type.");
            typeInput = "CONCISE";
        }

        System.out.println("Now ask or talk about anything you want:" );
        String Message = read.nextLine().trim();

        String say1 = say.reply(Message, ReplyType.valueOf(typeInput));
        System.out.println("Result: " + say1);

        read.close();


        /*
        //                         ((way2))
        //Select the typeInput by the user use name of the inputtype .
        ReplyService say = new ReplyService();
        Scanner read = new Scanner(System.in);

        System.out.println("Choose the type you prefer to reply to you(Please write word not number ):");
        System.out.println("1.FORMAL");
        System.out.println("2.FRIENDLY");
        System.out.println("3.CONCISE");
        String typeInput = read.nextLine().trim().toUpperCase();
        if (typeInput.trim().isEmpty())
            typeInput="FORMAL";
        System.out.println("Now Ask or talk about anything you want:" );
        String Message = read.nextLine().trim();
        String say1 = say.reply(Message, ReplyType.valueOf(typeInput));
        System.out.println("Result: " + say1);

        read.close();
        */



        /*                       ((Way3))
        //If you want to test without input from the end user, enter it manually.
        ReplyService say=new ReplyService();
        String say1= say.reply("hi", ReplyType.CONCISE);
        System.out.println("Result:" + say1);
         */

    }
}
