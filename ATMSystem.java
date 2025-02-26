import java.util.Scanner;
class BankAccount
{
private double balance;
public BankAccount(double initialBalance)
{
if (initialBalance < 0)
{
System.out.println("Initial balance cannot be negative. Setting balance to Rs.0.0");
this.balance = 0.0;
}
else
{
this.balance = initialBalance;
}
}
public void deposit(double amount)
{
if (amount > 0)
{
balance += amount;
System.out.println("Rs." + amount + " deposited successfully.");
}
else
{  
System.out.println("Invalid deposit amount! Please enter a positive value.");
}
}
public boolean withdraw(double amount)
{
if (amount > balance)
{
System.out.println("Insufficient balance! Transaction failed.");
return false;
}
else if
(amount <= 0)
{
System.out.println("Invalid withdrawal amount! Please enter a positive value.");
return false;
}
else
{
balance -= amount;
System.out.println("Rs." + amount + " withdrawn successfully.");
return true;
}
}
public double getBalance()
{
return balance;
}
}
class ATM
{
private BankAccount userAccount;
public ATM(BankAccount account)
{
this.userAccount = account;
}
public void showMenu()
{
Scanner scanner = new Scanner(System.in);
while (true)
{
System.out.println("\n ATM Menu ");
System.out.println("1. Check Balance");
System.out.println("2. Deposit Money");
System.out.println("3. Withdraw Money");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int choice = scanner.nextInt();
switch (choice)
{
case 1:
System.out.println("Your balance: Rs." + userAccount.getBalance());
break;
case 2:
System.out.print("Enter amount to deposit: ");
double depositAmount = scanner.nextDouble();
userAccount.deposit(depositAmount);
break;
case 3:
System.out.print("Enter amount to withdraw: ");
double withdrawAmount = scanner.nextDouble();
userAccount.withdraw(withdrawAmount);
break;
case 4:
System.out.println("Thank you for using the ATM. Have a great day!");
scanner.close();
return;
default:
System.out.println("Invalid option! Please try again.");
}
}
}
}
public class ATMSystem 
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter initial account balance: ");
double initialBalance = scanner.nextDouble();
BankAccount userAccount = new BankAccount(initialBalance);
ATM atm = new ATM(userAccount);
atm.showMenu();
}
}
