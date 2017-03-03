/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.*;
/**
 *
 * @author Rodrigo
 */
public class PhoneContacts {

    /**
     * @param args the command line arguments
     */
    public static Scanner scanner = new Scanner(System.in);
    public static MobilePhone myPhone = new MobilePhone();
    
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        
        printMenu();
        option = scanner.nextInt();
        while (option > 0 && option < 7){
            switch(option){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    listContact();
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    break;
        }
        
            System.out.println("Option?");
            option = scanner.nextInt();
            
        }
    }
    
    public static void printMenu(){
        System.out.println("Menú");
        System.out.println("0. Quit");
        System.out.println("1. Add Contact");
        System.out.println("2. Update Contacts");
        System.out.println("3. Delete Contact");
        System.out.println("4. Query Contact");
        System.out.println("5. List all Contacts");
        System.out.println("6. Print options");
        System.out.println("Option?");
    }
    
    public static void addContact(){
        Scanner read = new Scanner (System.in);
        String name;
        int number;
        System.out.println("Contact name:");
        name = read.nextLine();
        System.out.println("Cellphone number: ");
        number = read.nextInt();
        
        if(myPhone.addContact(name,number)){
            System.out.println("Contact succesfully added");
        }else{ 
        System.out.println("Contact already in list");
        }
    }
    
    public static void updateContact(){
        Scanner read = new Scanner (System.in);
        String name;
        int number;
        System.out.println("Contact name:");
        name = read.nextLine();
        System.out.println("Cellphone number: ");
        number = read.nextInt();
        
        if(myPhone.updateContact(name,number)){
            System.out.println("Contact succesfully updated");
        } 
        System.out.println("Contact doesn´t exist");
    }
    
    public static void deleteContact(){
        Scanner read = new Scanner (System.in);
        String name;
        System.out.println("Contact name:");
        name = read.nextLine();
        
        if(myPhone.removeContact(name)){
            System.out.println("Contact deleted");
        } 
    }
    
    public static void queryContact(){
        Scanner read = new Scanner (System.in);
        String name;
        System.out.println("Contact name: ");
        name = read.nextLine();
        myPhone.queryContact(name);
    }
    
     public static void listContact(){
        myPhone.listContacts();
    }
}
