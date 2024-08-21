
import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        String[] questions = {
            "What is the capital of France?",
            "What is 2 + 2?",
            "What is the color of the sky?"
        };

        String[][] options = {
            {"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"},
            {"1. 3", "2. 4", "3. 5", "4. 6"},
            {"1. Blue", "2. Green", "3. Red", "4. Yellow"}
        };

        int[] correctAnswers = {3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == correctAnswers[i]) {
                score++;
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
