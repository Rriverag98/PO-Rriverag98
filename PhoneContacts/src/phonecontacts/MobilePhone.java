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
public class MobilePhone {
    private ArrayList <Contact> contacts;
    
    public MobilePhone (){
        contacts = new ArrayList<Contact>();
    }
    
    public boolean addContact (String name,int number){
        return addContact(new Contact(name,number));
    } 
    
    public boolean addContact (Contact contact){
        if (findContact(contact.getName())== -1) {
            contacts.add(contact);
            return true;
        }
        return false;
    } 
    
    //public Contact findContact(String name){
      //  for (Contact temp:contacts){
        //    if (temp.getName().equals(name))
          //      return temp;
       // }
      //  return null;
   // }
    
    public int findContact(String name){
        for (int i=0;i < contacts.size();i++){
            if (contacts.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    
    public boolean removeContact(Contact contact){
        int position = findContact(contact.getName());
        if (position == -1){
            return false;
        }
        contacts.remove(position);
        return true;
    }
    
    public boolean removeContact(String name,int number){
        return removeContact(new Contact(name,number));
    }
    
    public boolean removeContact(String name){
        return removeContact(new Contact(name,123));
    }
    
    public boolean updateContact(Contact contact){
         int position = findContact(contact.getName());
        if (position == -1){
            return false;
        }
        contacts.get(position).setName(contact.getName());
        contacts.get(position).setNumber(contact.getNumber());
        return true;
    }
    
        public boolean updateContact(String name,int number){
         return updateContact(new Contact (name,number));
    }
     
    public void listContacts(){
        for (Contact temp: contacts){
            System.out.println(temp.toString());
        }
    }

    public String queryContact(String name){
        int position = findContact(name);
        
        if (position == -1){
            return "Contact not found";
        }
        return contacts.get(position).toString();
        
    }
    
}

