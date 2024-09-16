package CustomerAndAccount;

public class TestMain {
    public static void main(String[] args) {

        Customer customer1 = new Customer(185300,"Felipe", 'm');
        Account acc1 = new Account(185300, customer1);

        System.out.println(acc1);
        acc1.deposit(50.50); // deposit test
        System.out.println(acc1);
        acc1.withdraw(20);
        System.out.println(acc1); // withdraw test
        acc1.withdraw(100); // exception test

    }
}
