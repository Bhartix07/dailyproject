import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Questions
        String[] questions = {
            "1) Which language is used for Android development?",
            "2) Who invented Java programming?",
            "3) Which keyword is used to inherit a class in Java?",
            "4) Which company owns Java now?",
            "5) Which of these is not a Java feature?"
        };

        // Options
        String[][] options = {
            {"a) Python", "b) Java", "c) C++", "d) Swift"},
            {"a) Bjarne Stroustrup", "b) James Gosling", "c) Dennis Ritchie", "d) Guido van Rossum"},
            {"a) this", "b) super", "c) extends", "d) implements"},
            {"a) Oracle", "b) Microsoft", "c) Sun Microsystems", "d) IBM"},
            {"a) Object-Oriented", "b) Platform Independent", "c) Slow Execution", "d) Robust"}
        };

        // Correct answers
        char[] answers = {'b', 'b', 'c', 'a', 'c'};

        int score = 0;

        System.out.println("===== Welcome to the Java Quiz Game =====\n");

        // Loop through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        // Final Score
        System.out.println("===== Quiz Over! =====");
        System.out.println("Your Score: " + score + " / " + questions.length);

        if (score == questions.length) {
            System.out.println("🎉 Excellent! You got all correct!");
        } else if (score >= 3) {
            System.out.println("👍 Good job! Keep practicing.");
        } else {
            System.out.println("😢 Better luck next time!");
        }

        sc.close();
    }
}
