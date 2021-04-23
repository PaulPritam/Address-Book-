package com.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<AddressBook2> addressBookList = new ArrayList<>();
    public AddressBook(){}
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;


    AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<AddressBook> contactList = new ArrayList<>();

    public void addContact(Scanner scan)
    {
        System.out.println("welcome to address book ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter firstname");
        String fname = input.next();
        System.out.println("Enter lastname");
        String lname = input.next();
        System.out.println("Enter address");
        String adr = input.next();
        System.out.println("Enter state");
        String states = input.next();
        System.out.println("Enter city");
        String city = input.next();
        System.out.println("Enter zip");
        String zip = input.next();
        System.out.println("Enter phonenum");
        String phno = input.next();
        System.out.println("enter email");
        String emailid = input.next();

        AddressBook contact = new AddressBook(fname,lname,adr,states,city,zip,phno,emailid);
        contactList.add(contact);
    }
    public void editContact(Scanner scan) {
        System.out.println("Enter contact name to edit ");
        String contactName = scan.next();
        boolean found = false;
        for (AddressBook person : contactList) {
            System.out.println(person.toString());
            if (contactName.equalsIgnoreCase(person.firstName)) {
                found=true;

                System.out.println("Enter choice to edit\n"
                        + "1.Edit last name\n"
                        + "2. Edit email\n"
                        + "3.Edit Mobile No.\n"
                        + "4.Edit State\n"
                        + "5.Edit city\n"
                        + "6.Edit zip code\n"
                        + "7.Edit address\n");
                int choice2 = scan.nextInt();
                scan.nextLine();
                switch (choice2) {
                    case 1: {
                        System.out.println("Enter Last Name \n");
                        String last = scan.nextLine();
                        person.setLastName(last);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter email");
                        String email = scan.nextLine();
                        person.setEmail(email);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter Mobile no");
                        String mobileNo = scan.next();
                        scan.nextLine();
                        person.setPhoneNumber(mobileNo);
                        break;
                    }
                    case 4: {
                        System.out.println("Enter State");
                        String state = scan.nextLine();
                        person.setState(state);
                        break;
                    }
                    case 5: {
                        System.out.println("Enter city");
                        String city = scan.nextLine();
                        person.setCity(city);
                        break;
                    }
                    case 6: {
                        System.out.println("Enter zip code");
                        String zip = scan.next();
                        scan.nextLine();
                        person.setZip(zip);
                        break;
                    }
                    case 7: {
                        System.out.println("Enter Address");
                        String address = scan.nextLine();
                        person.setCity(address);
                        break;
                    }
                    default:System.out.println("exit");
                }

            }
            if (found)
                break;
        }
        if (!found)
            System.out.println("No such contact");
    }
    public void deleteContact(Scanner scan)
    {
        System.out.println("Enter the first name to delete");
        String name = scan.next();
        for (int i = 0; i <contactList.size(); i++) {
            String personName = contactList.get(i).firstName;
            if (name.equals(personName))
            {
                contactList.remove(i);
                System.out.println("The details of that person were deleted ");
                break;
            }
            else
                System.out.println("Enter a valid name");

        }
    }
    public void displayAddressBook()
    {
        System.out.println("AddressBook Names are : ");

        for (AddressBook2 addressBookList : addressBookList) {
            System.out.println(addressBookList);
        }
    }
    public void addAddressBook(Scanner scan)
    {
        System.out.println("Enter AddressBook Name");
        String bookName = scan.next();
        AddressBook2 addressbook = new AddressBook2(bookName);
        addressBookList.add(addressbook);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Adressbook");
        AddressBook book = new AddressBook();
        Scanner scan = new Scanner(System.in);
        boolean loop = true;

        while(loop) {
            System.out.println("Enter an option");
            System.out.println("Options are\n"
                    + "1.Add contact\n"
                    + "2.Edit contact\n"
                    + "3.Delete contact\n"
                    + "4.Add Addressbook\n"
                    + "5.Exit\n"
                    + "0.Display\n");

            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    book.addContact(scan);
                    break;
                case 2:
                    book.editContact(scan);
                    break;
                case 3:
                    book.deleteContact(scan);
                    break;
                case 4:
                    book.addAddressBook(scan);
                    break;
                case 5:
                    loop = false;
                    break;
                case 0:
                    book.displayAddressBook();
                    break;
                
            }
        }
    }
}

