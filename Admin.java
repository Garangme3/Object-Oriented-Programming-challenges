package OOP_pkg;

public class Admin extends Account {
    // A private string specified only with the Admin

    private String AuthPassword;
    //Constructor to initialize Admin with ID, name and password
    public Admin(int _id, String _name, String _password){

        id = _id;
        name = _name;
        AuthPassword = _password;

    }

}
