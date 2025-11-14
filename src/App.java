import org.lessons.java.snack_1.Student;
import org.lessons.java.snack_2.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Snack 1

        // Student student_1 = new Student("Mario", "Rossi", 18);
        // System.out.println(student_1.getData());

        // Snack 2

        BankAccount account_1 = new BankAccount(04702);
        account_1.deposit(12.67f);
        account_1.withdraw(5.81f);
        System.out.println(account_1.getBalance());

    }
}
