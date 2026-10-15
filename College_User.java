class userDetails{
    
    int userId;
    String userName;
    String email;
    String phoneNo;

    userDetails(int userId,String userName,String email,String phoneNo){
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    
    void displayStudent(){
        System.out.println("Username : " + userName);
        System.out.println("UserId : " + userId);
        System.out.println("Email : " + email);
        System.out.println("Phone No : " + phoneNo);
    
}
}

public class College_User {

    public static void main(String[] args) {
        userDetails c = new userDetails(123,"Harish","harish123@gmail.com","95512333");
        c.displayStudent();
    }
}
