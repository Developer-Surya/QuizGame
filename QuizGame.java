import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Questions and answers
        String[][] questions = {
            {"What is the capital of France?", "1. Berlin", "2. Paris", "3. Rome", "4. Madrid", "2"},
            {"Which planet is known as the Red Planet?", "1. Earth", "2. Jupiter", "3. Mars", "4. Venus", "3"},
            {"Who wrote 'To Kill a Mockingbird'?", "1. Harper Lee", "2. J.K. Rowling", "3. Ernest Hemingway", "4. Mark Twain", "1"},
            {"What is the largest ocean on Earth?", "1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean", "4"},
            {"Which element has the chemical symbol 'O'?", "1. Gold", "2. Oxygen", "3. Silver", "4. Osmium", "2"}
        };
        
        int score = 0;
        
        // Quiz logic
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i][0]);
            for (int j = 1; j <= 4; j++) {
                System.out.println(questions[i][j]);
            }
            System.out.print("Enter the number of your answer: ");
            int playerAnswer = scanner.nextInt();
            
            if (Integer.toString(playerAnswer).equals(questions[i][5])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was " + questions[i][Integer.parseInt(questions[i][5])]);
            }
            System.out.println();
        }
        
        System.out.println("Your total score is: " + score + " out of " + questions.length);
        
        scanner.close();
    }
}
