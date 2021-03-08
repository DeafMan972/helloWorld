import java.util.*;

public class Hello{

    String prenom;
    String question;
    
    public static String gretings(String prenom){ 
        return " Bonjour, "+prenom;
    }

    public static void Presentation(){
          Scanner sc = new Scanner(System.in);
          System.out.println("Comment tu t'appelles?");
          String prenom = sc.nextLine();
          sc.close();
          System.out.println(gretings(prenom));
    }
    public static void main(String [] args){
        Presentation();
    }
}