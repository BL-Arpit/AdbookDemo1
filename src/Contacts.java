public class Contacts {
    String name;
    String  email;
    String address;

    public Contacts(String n1 , String e1 , String a1){
        this.name = n1;
        this.email = e1;
        this.address = a1;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
