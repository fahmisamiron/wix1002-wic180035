package week3;

import java.util.Random;

public class L03Q04 {
    public static void main(String []args) {
        Random g = new Random();
        int player1_num1, player1_num2, player2_num1, player2_num2, player1_sum, player2_sum;
        player1_num1 = g.nextInt(6) + 1;
        player1_num2 = g.nextInt(6) + 1;
        player2_num1 = g.nextInt(6) + 1;
        player2_num2 = g.nextInt(6) + 1;
        
        player1_sum = player1_num1 + player1_num2;
        player2_sum = player2_num1 + player2_num2;
        
        if (player1_sum > player2_sum) {
            System.out.println("Player 1 wins.");
        } else if (player1_sum < player2_sum) {
            System.out.println("Player 2 wins.");
        } else {
            System.out.println("Draw.");
        }
    }
}
