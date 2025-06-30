package OOP_pkg;

public class MainApplication {
    public static void main(String[] args) {

        Admin xAdmin = new Admin(189225, "Mundia", "xa1@LW42%3");
        User xUser = new User(444555, "Will");

        xAdmin.performOperation(new Update());

        xUser.performOperation(new View());
    }

}
