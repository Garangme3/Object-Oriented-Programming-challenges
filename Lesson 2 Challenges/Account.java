package OOP_pkg;

import javax.sql.DataSource;

abstract public class Account {
    //Protected fields accessible by subclasses(Admin, User)
     protected int id;
     protected String name;
     //Private field to hold a reference to a Datasource implementation
     private DataSource myData;
    // Method to perform an operation (like delete, update, view) by passing in a DataSource strategy
     public void performOperation(DataSource _myData) throws InterruptedException {
         myData = _myData; //set the current data operation
         myData.execute();//Execute the data operation

     }
 }