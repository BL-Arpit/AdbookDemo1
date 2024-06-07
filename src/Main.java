import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to addressbook!");
        ArrayList<Contacts> addressbook = new ArrayList<Contacts>();

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        int op = 0;
        do {
            System.out.println("Enter 1 to create ");
            if (option == 1) {
                Contacts userContact = createNewContact();
                addressbook.add(userContact);
            }
            System.out.println(addressbook);
            System.out.println("To exit press 1");
            op = sc.nextInt();
        }while(op != 1);



    }

    public static Contacts createNewContact(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter USername");
        String s1 = s.next();
        System.out.println("Enter email");
        String s2 = s.next();
        System.out.println("Enter Address");
        String s3 = s.next();
        Contacts c1 = new Contacts(s1,s2,s3);
        return c1;
    }
}