/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankbranches;
import java.util.ArrayList;
/**
 *
 * @author Rodrigo
 */

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            System.out.println("Branch: " + branchName + " Succesfully created.");
            return true;
        }
        System.out.println(branchName + " Already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch temp = findBranch(branchName);
        if (temp != null) {
           if (temp.findCustomer(customerName) == null ) {
               temp.addCustomer(customerName, initialAmount);
               System.out.println("Customer: " + customerName + " registered. Initial amount: " + initialAmount);
               return true;
           } else {
               System.out.println(customerName + " already registered in branch " + branchName);
               return false;
           }
       } else {
            System.out.println("Branch: " + branchName + " doesn´t exist.");
            return false;
       }
    }

    public boolean addTransaction(String branchName, String customerName, double amount) {
        Branch temp = findBranch(branchName);
        if (temp != null) {
            Customer tempc = temp.findCustomer(customerName);
            if (tempc != null) {
                tempc.addTransaction(amount);
                System.out.println(amount );
                return true;
            } else {
                System.out.println("Customer " + customerName + " not found");
                return false;
            }
        } else {
            System.out.println("Branch: " + branchName + " not found.");
            return false;
        }

    }
    
    public Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean printCustomers(String branchName, boolean listTransactions) {
        Branch temp = findBranch(branchName);
        if (temp != null) {
            System.out.println("Customer info: "+temp.getName());
            ArrayList<Customer> branchCustomers = temp.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer currentCustomer = branchCustomers.get(i);
                System.out.println("Name: " + currentCustomer.getName());
                if (listTransactions) {
                    System.out.println("Transactions:");
                    ArrayList<Double> transactions = currentCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("No.: " + (j+1) + ": " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }
}