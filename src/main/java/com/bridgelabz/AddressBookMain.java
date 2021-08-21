package com.bridgelabz;
import java.util.ArrayList;
public class AddressBookMain {
    /*
     Declaring AddressBook Main Class
     Printing Welcome Message
     */
    public static void main(String[] args){
        System.out.println("Welcome To The AddressBook Program");
        ArrayList<Contacts> contactList = new ArrayList<>();
        Contacts newContact = new Contacts();
        newContact.setFirstName("Govardhan Reddy");
        newContact.setLastName("Bajjuri");
        newContact.setAddressCity("Kodad");
        newContact.setState("Telangana");
        newContact.setZip(508204);
        newContact.setPhoneNumber(966610767);
        newContact.setEmail("gopi1998@gmail.com");
    }
}

