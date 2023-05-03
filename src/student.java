
import java.util.Scanner;



public class student {
    private String Name;
    private int RollNo;
    private long PhoneNumber;

    public String getName(){
        return Name;
    }
    public int getRollNo(){
        return RollNo;
    }
    public long getPhoneNumber(){
        return PhoneNumber;
    }

    public void setName(String inputName) {
        this.Name = inputName;
    }

    public void setRollNo(int inputRollNo) {
        this.RollNo = inputRollNo;
    }

    public void setPhoneNumber(long inputPhoneNumber) {
        this.PhoneNumber = inputPhoneNumber;
    }
}
class Encapsulation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number of entries");
        int noOfStudents=sc.nextInt();
        int noOfRollNos=sc.nextInt();
        Student s1 =new Student();
        System.out.println("Enter the student name");
        String Name=sc.nextLine();
        s1.setName(Name);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());
        System.out.println(s1.getPhoneNumber());

    }

}



