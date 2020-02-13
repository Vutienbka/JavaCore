package FinalTest;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManage {
    public ArrayList<Contact>  initialFirstContact(ArrayList<Contact> contactList){
        Contact c1 = new Contact("0123572646","Friends","VU HUY THANH", "MALE","HA NOI",
                "20/06/1988","huythanh@gmail.com");
        contactList.add(c1);
        Contact c2 = new Contact("0345789925","Friends","VU HUY NAM","MALE","HA NOI",
                "20/06/1988","huynam@gmail.com");
        contactList.add(c2);
        Contact c3 = new Contact("0345789978","Employee","VU HUY SANG","MALE","HA NAM",
                "20/06/1988","huynam@gmail.com");
        contactList.add(c3);
        return contactList;
    }
    public void showContact(ArrayList<Contact> contactList) {
        String phoneNumber = "PhoneNumber";
        String group = "Group";
        String name = "Name";
        String gender = "Gender";
        String address = "Address";
        String dateOfBirth = "Date Of Birth";
        String email = "Email";
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", phoneNumber, group, name, gender, address, dateOfBirth,email);
        for (Contact contact : contactList) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n", contact.getPhoneNumber(), contact.getGroup(), contact.getName(), contact.getGender(),
                    contact.getAddress(),contact.getDateOfBirth(),contact.getEmail());
        }
    }

    public ArrayList<Contact> addNewContact(ArrayList<Contact> contactList){
        Contact newContact = new Contact();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone Number:");
        newContact.setPhoneNumber(scanner.nextLine());
        System.out.println("Input group Contact:");
        newContact.setGroup(scanner.nextLine());
        System.out.println("Input name:");
        newContact.setName(scanner.nextLine());
        System.out.println("Input Gender:");
        newContact.setGender(scanner.nextLine());
        System.out.println("Input Address:");
        newContact.setAddress(scanner.nextLine());
        System.out.println("Input Date Of Birth B:");
        newContact.setDateOfBirth(scanner.nextLine());
        System.out.println("Input Email:");
        newContact.setEmail(scanner.nextLine());
        contactList.add(newContact);
        return contactList;
    }

    public ArrayList<Contact> updateContact(ArrayList<Contact> contactList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number of contact that you want to update: ");
        String phoneNumber = scanner.nextLine();
        for(Contact contact : contactList){
            if(phoneNumber.equals(contact.getPhoneNumber())){
                System.out.println("Input New phone Number:");
                contact.setPhoneNumber(scanner.nextLine());
                System.out.println("Input New group Contact:");
                contact.setGroup(scanner.nextLine());
                System.out.println("Input New name:");
                contact.setName(scanner.nextLine());
                System.out.println("Input New Gender:");
                contact.setGender(scanner.nextLine());
                System.out.println("Input New Address:");
                contact.setAddress(scanner.nextLine());
                System.out.println("Input New Date Of Birth B:");
                contact.setDateOfBirth(scanner.nextLine());
                System.out.println("Input New Email:");
                contact.setEmail(scanner.nextLine());
            }
        }
        return contactList;
    }

    public ArrayList<Contact> deleteContact(ArrayList<Contact> contactList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number of contact that you want to delete: ");
        String phoneNumber = scanner.nextLine();
        for(Contact contact : contactList){
            if(phoneNumber.equals(contact.getPhoneNumber())){
              contactList.remove(contact);
            }
        }
        return contactList;
    }

    public ArrayList<Contact> searchContact(ArrayList<Contact> contactList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input phone number of contact that you want to find: ");
        String phoneNumber = scanner.nextLine();
        for(Contact contact : contactList){
            if(phoneNumber.equals(contact.getPhoneNumber())){
                showContact(contactList);
            }
        }
        return contactList;
    }

}
