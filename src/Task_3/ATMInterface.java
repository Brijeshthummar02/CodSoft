package Task_3;

public class ATMInterface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.00); // Starting with INR 1000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}

// OUTPUT

//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 1
//Enter amount to withdraw: 450
//Withdrawal successful.
//
//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 3
//Current balance: ₹550.00


//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 1
//Enter amount to withdraw: 1001
//Insufficient balance or invalid amount.
//
//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 2
//Enter amount to deposit: 100000
//Deposit successful.
//
//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 1
//Enter amount to withdraw: 2332
//Withdrawal successful.
//
//--- ATM MENU ---
//1. Withdraw
//2. Deposit
//3. Check Balance
//4. Exit
//Choose an option: 3
//Current balance: ₹98668.00

