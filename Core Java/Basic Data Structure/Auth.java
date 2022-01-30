import java.util.HashMap;
import java.util.Scanner;

public class Auth {
    public static void main(String[] args) {
        HashMap<String,Integer> user=new HashMap<String,Integer>();
        Scanner s= new Scanner(System.in);
        user.put("Ranjitraj",12345);

        int count=0;
        for (int i = 0; i <5; i++) {
            if(count==3){
                System.out.println("Contact Admin");
                break;
            }
            System.out.print("Enter your username:");
            String username=s.next();
            System.out.print("Enter your password:");
            int p=s.nextInt();
            if(user.containsKey(username)){
                if(user.get(username)==p){
                    System.out.println("Welcome! "+username);
                    break;
                }
                else{ count++; System.out.println("You have entered wrong credentials ,please enter the right credentials."); }
            }

        }

    }
}
