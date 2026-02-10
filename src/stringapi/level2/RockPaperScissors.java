package stringApi.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    // Method to generate computer choice randomly: 1-Rock, 2-Paper, 3-Scissors
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3) + 1;
        switch (choice) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Rock"; // fallback
        }
    }

    // Method to find winner of a single game
    public static String findWinner(String player, String computer) {
        player = player.toLowerCase();
        computer = computer.toLowerCase();

        if (player.equals(computer)) return "Draw";

        if ((player.equals("rock") && computer.equals("scissors")) ||
                (player.equals("paper") && computer.equals("rock")) ||
                (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // Method to calculate percentages and return as a 2D array
    public static String[][] calculateStats(int playerWins, int computerWins, int draws, int totalGames) {
        String[][] stats = new String[4][3];
        stats[0] = new String[]{"Player Wins", String.valueOf(playerWins), String.format("%.2f%%", (playerWins * 100.0 / totalGames))};
        stats[1] = new String[]{"Computer Wins", String.valueOf(computerWins), String.format("%.2f%%", (computerWins * 100.0 / totalGames))};
        stats[2] = new String[]{"Draws", String.valueOf(draws), String.format("%.2f%%", (draws * 100.0 / totalGames))};
        stats[3] = new String[]{"Total Games", String.valueOf(totalGames), "100%"};
        return stats;
    }

    // Method to display results of every game and stats
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("\nGame\tPlayer Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t\t" + gameResults[i][1] + "\t\t" + gameResults[i][2]);
        }

        System.out.println("\nStatistics:");
        System.out.println("Category\tCount\tPercentage");
        System.out.println("----------------------------------");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[][] gameResults = new String[n][3];

        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (Rock/Paper/Scissors): ");
            String playerChoice = sc.nextLine();

            String computerChoice = getComputerChoice();

            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
            else draws++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        String[][] stats = calculateStats(playerWins, computerWins, draws, n);

        displayResults(gameResults, stats);

        sc.close();
    }
}
