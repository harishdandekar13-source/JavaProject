
public class Student extends College_User {
    int Id;
    String name;
    String email;
    String phoneNo;

    public Student(int Id, String name, String email, String phoneNo) {
        this.Id = Id;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void displayRole() {
        System.out.println("Role : Student");
    }

    public void displayStudent() {
        System.out.println("Student name : " + name);
        System.out.println("Student Id : " + Id);
        System.out.println("Student email : " + email);
        System.out.println("Student phone No. : " + phoneNo);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Arnav","arnav123@gmail.com", "12345678");

        s.displayRole();
        s.displayStudent();
    }
}