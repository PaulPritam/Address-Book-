package com.addressbook;

import java.util.Scanner;

public class AddressBook {
    public static void contactDetails()
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
        String state = input.next();
        System.out.println("Enter city");
        String city = input.next();
        System.out.println("Enter zip");
        String zip = input.next();
        System.out.println("Enter phonenum");
        String phno = input.next();
        System.out.println("Details entered are: \n" +fname + "\n" +lname+ "\n" +adr+ "\n"+state+ "\n" +city+ "\n" +zip+ "\n" +phno);
    }
   public static void main(String[] args )
   {
        contactDetails();
   }
}
