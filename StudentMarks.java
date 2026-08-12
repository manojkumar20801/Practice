import java.util.Scanner;

class StudentMarks {
    static int m1, m2, m3;

    void getMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 marks: ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
    }

    int total() {
        return m1 + m2 + m3;
    }

    double average() {
        return total() / 3.0;
    }

    void grade() {
        double avg = average();

        if (avg >= 90)
            System.out.println("Grade A");
        else if (avg >= 75)
            System.out.println("Grade B");
        else if (avg >= 50)
            System.out.println("Grade C");
        else
            System.out.println("Grade D");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Enter Marks");
            System.out.println("2.Total");
            System.out.println("3.Average");
            System.out.println("4.Grade");
            System.out.println("5.Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: getMarks(); break;
                case 2: System.out.println("Total = " + total()); break;
                case 3: System.out.println("Average = " + average()); break;
                case 4: grade(); break;
                case 5: System.exit(0);
            }
        }
    }
}