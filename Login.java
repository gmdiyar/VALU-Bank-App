import java.util.Scanner;

public class Login {

    private String Username;
    private String Password;
    public int UID;


    public Login(String Username, String Password){
        this.Username = Username;
        this.Password = Password;
    }
    public void Login(){
        System.out.println("Hello, " + Username);
    }
    public static void main(String[] args){

        System.out.println("Enter Username: ");
        Scanner input = new Scanner(System.in);

        String Username = input.nextLine();
        Login one = new Login(Username, "password");
        one.Login(); 
    }
}
