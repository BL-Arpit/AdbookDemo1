import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to addressbook!");
        ArrayList<Contacts> addressbook = new ArrayList<Contacts>();

        Scanner sc = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("Enter 1 to create " );
            System.out.println("Enter 2 to display ");
            System.out.println("Enter 3 to edit");
            System.out.println("Enter 4 to search by name");
            int option = sc.nextInt();
            switch (option) {
                case 1 -> {
                    Contacts userContact = createNewContact();
                    addressbook.add(userContact);
                }
                case 2 -> System.out.println(addressbook);

                case 3 -> editContact(addressbook);

                case 4 -> searchByName(addressbook);

                case 5 -> deleteByName(addressbook);
            }
            System.out.println("To exit press 1");
            op = sc.nextInt();
        }while(op != 1);



    }

    private static void deleteByName(ArrayList<Contacts> addressbook) {
        boolean flag = false;
        System.out.println("Enter the username you want to edit");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        for (int i = 0 ; i<addressbook.size() ; i++){
            Contacts c = addressbook.get(i);
            if(Objects.equals(c.name, name)){
               addressbook.remove(i);
               break;
            }
        }

        if (flag == false){
            System.out.println("Name not found");
        }
    }

    private static void searchByName(ArrayList<Contacts> addressbook) {
        boolean flag = false;
        System.out.println("Enter the username you want to edit");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        for (int i = 0 ; i<addressbook.size() ; i++){
            Contacts c = addressbook.get(i);
            if(Objects.equals(c.name, name)){
                System.out.println(c);
                flag = true;
            }
        }

        if (flag == false){
            System.out.println("Name not found");
        }
    }

    private static void editContact(ArrayList<Contacts> addressbook) {
        boolean flag = false;
        System.out.println("Enter the username you want to edit");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        for (int i = 0 ; i<addressbook.size() ; i++){
            Contacts c = addressbook.get(i);
            if(Objects.equals(c.name, name)){
                editContactDetails(c);
                flag = true;
            }
        }

        if (flag == false){
            System.out.println("Name not found");
        }
    }

    private static Contacts editContactDetails(Contacts c) {
        System.out.println("Press 1 to change name");
        System.out.println("Press 2 to change phone number");
        System.out.println("Press 3 to change email");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option){
            case 1 -> {
                System.out.println("enter new NAme");
                String name = sc.next();
                c.name = name;
            }
            case 2 -> {
                System.out.println("enter new Phone");
                String p = sc.next();
                c.address = p;
            }
            case 3 -> {
                System.out.println("enter new email");
                String email = sc.next();
                c.email = email;
            }


        }
        return c;
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