public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if(amount <= balance) {
            this.balance -= amount;
        }else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account account, int amount) {

        if(amount <= balance){
            account.balance += amount;
            this.balance -= amount;
        } else{
            System.out.println("Amout exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}

class AccountTester {
    public static void main(String[] args) {
        Account a1 = new Account("a101", "Tan Ah Teck", 88);
        System.out.println(a1);

        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);

        //Test getters
        Printer.printAccountInfos(a1);
        Printer.printAccountInfos(a2);

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);

        //test transfer()

        a1.transferTo(a2,100);
        Printer.printAccountInfos(a1);
        Printer.printAccountInfos(a2);
    }
}

class Printer {
    public static void printAccountInfos(Account acc) {

        System.out.println("ID: " + acc.getId());
        System.out.println("Name: " + acc.getName());
        System.out.println("Balance: " + acc.getBalance());
    }

}
