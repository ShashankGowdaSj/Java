import java.util.Scanner;

public class BankAccount {
    String acc_holder;
    double balance;


    public BankAccount(String name,double bal) {
 this.acc_holder=name;
 this.balance=bal;

    }
    void deposit(double dep_amount){
        balance=balance+dep_amount;
        System.out.println("Amount added now"+dep_amount);

    }
    void withdraw(double withdraw_amount){
        if(withdraw_amount>balance){
            System.out.println("Insufficient balance");
        } else if (withdraw_amount<balance) {
            balance= balance-withdraw_amount;
            System.out.println("Amount withdrawn:"+balance);

        }}
        void display_balance(){

            System.out.println("the balance is :"+balance);

        }

    static void main() {
        Scanner D1=new Scanner(System.in);
        Scanner D2= new Scanner(System.in);
        System.out.println("enter account holder detail:");
        String name = D1.nextLine();
        Double balance= D2.nextDouble();

        System.out.println("the Account_holder Name:"+name);
        System.out.println("the present balance is");
        BankAccount b1= new BankAccount(name,balance );
        b1.display_balance();
        System.out.println("enter the amount you are going to deposit");
        Double dep_amount= D2.nextDouble();
        b1.deposit(dep_amount);
        System.out.println("After deposit");
        b1.display_balance();
        System.out.println("mention the  withdraw amount:");
        double with_drawamount=D2.nextDouble();
        b1.withdraw(with_drawamount);
        b1.display_balance();



    }
    }

