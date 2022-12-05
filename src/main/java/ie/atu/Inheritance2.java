package ie.atu;

public class Inheritance2 {

    public static void main(String[] args) {

        Person person1 = new Person("Cillian", "Barna", "083690");
        Customer customer1 = new Customer("Gavin", "Moycullen", "085420", "11111", true);

        System.out.println("Here are the person's details: \n" + person1.toString());
        System.out.println("Here are customer's details: \n" + customer1.toString());
    }
}
