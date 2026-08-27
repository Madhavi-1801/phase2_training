package practise;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    static Stack<String> undoStack = new Stack<>();
    static Stack<String> redoStack = new Stack<>();

    static String text = "";


    static void type(String newText) {
        undoStack.push(text);
        text += newText;
        redoStack.clear();
    }


    static void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        redoStack.push(text);
        text = undoStack.pop();
    }

    static void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        undoStack.push(text);
        text = redoStack.pop();
    }

    static void display() {
        System.out.println("Current Text: " + text);
    } 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== TEXT EDITOR =====");
            System.out.println("1. Type");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Display");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter text: ");
                    String newText = sc.nextLine();
                    type(newText);
                    display();
                    break;

                case 2:
                    undo();
                    display();
                    break;

                case 3:
                    redo();
                    display();
                    break;

                case 4:
                    display();
                    break;

                case 5:
                    System.out.println("Exiting Text Editor...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}