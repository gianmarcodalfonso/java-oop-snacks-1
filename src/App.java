import org.lessons.java.snack_1.Student;
import org.lessons.java.snack_2.BankAccount;
import org.lessons.java.snack_3.StudentsList;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Snack 1 testing

        Student student_1 = new Student("Mario", "Rossi", 18);
        Student student_2 = new Student("Alfio", "Alfiere", 31);
        // System.out.println(student_1.getData());

        // Snack 2 testing

        // BankAccount account_1 = new BankAccount(04702);
        // account_1.deposit(12.67f);
        // account_1.withdraw(5.81f);
        // System.out.println(account_1.getBalance());

        // Snack 3 testing

        StudentsList uniList = new StudentsList();
        uniList.setNewStudent(student_1.getData());
        uniList.setNewStudent(student_2.getData());
        uniList.setNewStudent(student_1.getData());
        uniList.printStudents();
    }
}
