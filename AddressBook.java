package com.addressbook;

import java.util.Scanner;

public class AddressBook {
   public static void main(String[] args )
   {
       System.out.println("welcome to address book ");
       Scanner sc = new Scanner(System.in);
       System.out.println("enter firstname");
       String fname = sc.next();
       System.out.println("enter lastname");
       String lname = sc.next();
       System.out.println("enter address");
       String adr = sc.next();
       System.out.println("enter state");
       String state = sc.next();
       System.out.println("enter city");
       String city = sc.next();
       System.out.println("enter zip");
       String zip = sc.next();
       System.out.println("enter phonenum");
       String phno = sc.next();
   }
}
