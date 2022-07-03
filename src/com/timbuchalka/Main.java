package com.timbuchalka;

public class Main {
    public static void main(String[] args) {


        Bank bank = new Bank("National America Bank");

        if(bank.addBranch("Georgia")){
            System.out.println("Georgia branch created");
        }
        bank.addBranch("Georgia");

        bank.addCustomer("Georgia", "Tim", 50.05);
        bank.addCustomer("Georgia", "Betty", 175.34);
        bank.addCustomer("Georgia", "Mary", 220.12);

        bank.addBranch("California");
        bank.addCustomer("California", "Charlie", 160.12);

        bank.addCustomerTransaction("Georgia", "Tim", 44.2);
        bank.addCustomerTransaction("Georgia", "Tim", 12.44);
        bank.addCustomerTransaction("Georgia", "Betty", 1.65);

        bank.listCustomers("Georgia", true);
        bank.listCustomers("California", true);

        bank.addBranch("Florida");

        if(!bank.addCustomer("Florida", "Lucy", 5.53)) {
            System.out.println("Error Florida Branch does not exist");

        }
        if( !bank.addBranch("Georgia")) {
            System.out.println("Georgia branch already exists");
        }

    }
}