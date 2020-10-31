/*Created by : Nishit Amin
  Created on 10/04/2017*/

import java.util.Scanner;

public class Hotel {

    public static void main(String[] args) {

        String Item1 = "Filet-O-Fish";
        double price = 2.0;
        String out1 = String.format("%s", Item1);
        String out2 = String.format("%33s", " ");
        out2 = out2.replaceAll(" ", ".");
        String out3 = String.format("$%.2f", price);
        System.out.println(out1 + out2 + out3);

        String Item2 = "Ham Sandwich";
        String out4 = String.format("%s", Item2);
        String out5 = String.format("%33s", " ");
        out5 = out5.replaceAll(" ", ".");
        String out6 = String.format("$%.2f", price);
        System.out.println(out4 + out5 + out6);

        String Item3 = "French fries";
        String out7 = String.format("%s", Item3);
        String out8 = String.format("%33s", " ");
        out8 = out8.replaceAll(" ", ".");
        String out9 = String.format("$%.2f", price);
        System.out.println(out7 + out8 + out9);

        String Item4 = "Cheeseburger";
        String out10 = String.format("%s", Item4);
        String out11 = String.format("%33s", " ");
        out11 = out11.replaceAll(" ", ".");
        String out12 = String.format("$%.2f", price);
        System.out.println(out10 + out11 + out12);

        String Item5 = "Chicken Salad";
        String out13 = String.format("%s", Item5);
        String out14 = String.format("%32s", " ");
        out14 = out14.replaceAll(" ", ".");
        String out15 = String.format("$%.2f", price);
        System.out.println(out13 + out14 + out15);

        String Item6 = "Soft Drinks";
        String out16 = String.format("%s", Item6);
        String out17 = String.format("%34s", " ");
        out17 = out17.replaceAll(" ", ".");
        String out18 = String.format("$%.2f", price);
        System.out.println(out16 + out17 + out18);

        String Item7 = "1% Milk";
        String out19 = String.format("%s", Item7);
        String out20 = String.format("%38s", " ");
        out20 = out20.replaceAll(" ", ".");
        String out21 = String.format("$%.2f", price);
        System.out.println(out19 + out20 + out21);

        String Item8 = "Premium Tea";
        String out22 = String.format("%s", Item8);
        String out23 = String.format("%34s", " ");
        out23 = out23.replaceAll(" ", ".");
        String out24 = String.format("$%.2f", price);
        System.out.println(out22 + out23 + out24);

        System.out.println("--------------------------------------------------");

        String order;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Hello, what would you like? ");
        order = Keyboard.nextLine();

        System.out.print("How many would you like? ");
        int quantity = Keyboard.nextInt();

        System.out.println("               **** Receipt ****");
        System.out.print("" + order + " X " + quantity);
        int padding = 42 - order.length() - ("" + quantity).length();
        String out25 = String.format("%" + padding + "s", " ");
        out25 = out25.replaceAll(" ", ".");
        String out26 = String.format("$%5.2f", price);
        System.out.println(out25 + out26);

        String Item9 = "Sub-total";
        double total = quantity * price; // To calculate the Sub-total
        String out27 = String.format("%s", Item9);
        String out28 = String.format("%36s", " ");
        out28 = out28.replaceAll(" ", ".");
        String out29 = String.format("$%5.2f", total);
        System.out.println(out27 + out28 + out29);

        String Item10 = "HST 13%";
        double HST = total * 0.13; // To calculate HST 13%
        String out30 = String.format("%s", Item10);
        String out31 = String.format("%38s", " ");
        out31 = out31.replaceAll(" ", ".");
        String out32 = String.format("$%5.2f", HST);
        System.out.println(out30 + out31 + out32);

        String Item11 = "Total";
        double Ftotal = total + HST; // To calculate Total
        String out33 = String.format("%s", Item11);
        String out34 = String.format("%40s", " ");
        out34 = out34.replaceAll(" ", ".");
        String out35 = String.format("$%5.2f", Ftotal);
        System.out.println(out33 + out34 + out35);

        System.out.println("                    Thank you!");
    }
}
