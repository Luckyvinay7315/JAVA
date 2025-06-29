import java.util.Scanner;
 public class BankAccount {
  private String name;
  private String accountNumber;
  private double balance;

  public BankAccount(String name, String accountNumber){
    this.name = name; 
    this.accountNumber = accountNumber;
    this.balance = 0.0;
  }
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;  
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Deposit amount must be postive.");
    }
  }
   public void withdraw(double amount) {
    if (amount > 0 && balance >= amount) {
      balance -= amount;  
      System.out.println("Deposited: $" + amount);
    } else {
      System.out.println("Insufficient fund or invalid amount.");
    }
  }
     void showBalance(){
      System.out.println("Balance: $" +balance);
  } 
      public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", "A101");
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    account.deposit(scanner.nextDouble());
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    account.withdraw(scanner.nextDouble());
                }
                case 3 -> account.showBalance();
                case 4 -> System.out.println("Thanks for using our banking system.");
                default -> System.out.println("Invalid choice");
            }
        } while (option != 4);
        scanner.close();
    }
}