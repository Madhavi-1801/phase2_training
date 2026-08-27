package practise;

import java.util.*;
class Printer {
    String name;
    Printer(String name) {
        this.name = name;
    }
    void printTask(String file) {
        System.out.println(name + " is printing: " + file);
    }
}
public class printer_main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Printer> q = new LinkedList<>();
        Printer p1 = new Printer("Printer1");
        Printer p2 = new Printer("Printer2");
        Printer p3 = new Printer("Printer3");
        Printer p4 = new Printer("Printer4");
        Printer p5 = new Printer("Printer5");
        boolean[] selected = new boolean[6];
        System.out.println("Select printer order (1-5)");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter printer : ");
            int n = sc.nextInt();
            if (n < 1 || n > 5) {
                System.out.println("Invalid printer! Enter 1-5.");
                i--;
                continue;
            }
            if (selected[n]) {
                System.out.println("Printer already selected! Choose another printer.");
                i--;
                continue;
            }
            selected[n] = true;
            switch (n) {
                case 1:
                    q.offer(p1);
                    break;
                case 2:
                    q.offer(p2);
                    break;
                case 3:
                    q.offer(p3);
                    break;
                case 4:
                    q.offer(p4);
                    break;
                case 5:
                    q.offer(p5);
                    break;
            }
        }
        sc.nextLine();
        while (!q.isEmpty()) {
            Printer printer = q.poll();
            System.out.print("Enter document for " + printer.name + ": ");
            String file = sc.nextLine();
            printer.printTask(file);
        }
        sc.close();
    }
}
