import java.util.Scanner;

class Student {
    private String name;
    private int rollNo;
    private long phoneNumber;

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String inputName) {
        this.name = inputName;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
        }

}

public class encapsulationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of entries");
        int noOfStudents = sc.nextInt();

        Student s1 = new Student();
        System.out.println("Enter the student name");
        String name = sc.nextLine();
        s1.setName(name);
        System.out.println(s1.getName());

    }
}

