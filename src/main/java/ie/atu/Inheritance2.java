package ie.atu;

import java.util.Scanner;
public class Inheritance2 {

    public static void main(String[] args) {


        Person person1 = new Person("Cillian", "Barna", "083690");
        Customer customer1 = new Customer("Gavin", "Moycullen", "085420", "11111", true);
        PreferredCustomer customer2 = new PreferredCustomer();

        customer2.setName("Dan");
        customer2.setAddress("Salthill");
        customer2.setNumber("085666");
        customer2.setCustomerNumber("22222");
        customer2.setMailingList(false);

        System.out.println("How much have you spent: ");
        Scanner input = new Scanner(System.in);
        float moneySpent = input.nextFloat();

        if(moneySpent < 500){customer2.setZeroPercent(true);}
        if(moneySpent >= 500 && moneySpent < 1000){customer2.setFivePercent(true);}
        if(moneySpent >= 1000 && moneySpent < 1500){customer2.setSixPercent(true);}
        if(moneySpent >= 1500 && moneySpent < 2000){customer2.setSevenPercent(true);}
        if(moneySpent >= 2000){customer2.setTenPercent(true);}

        System.out.println("Here are the person's details: \n" + person1.toString());
        System.out.println("Here are customer's details: \n" + customer1.toString());
        System.out.println("Here are the preferred customer's details: \n" + customer2.toString());
    }
}
