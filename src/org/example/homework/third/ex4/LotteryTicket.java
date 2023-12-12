package org.example.homework.third.ex4;

public class LotteryTicket {
    private static int counterTickets = 0;
    private static int winningAmounts = 0;
    public LotteryTicket() {
        counterTickets++;
    }

    public static int getWinningAmounts() {
        return winningAmounts;
    }

    public void checkLuck() {
        if (counterTickets % 100 == 0) {
            winningAmounts += 5_000;
        } else if (counterTickets % 10 == 0) {
            winningAmounts += 100;
        }

    }



}
