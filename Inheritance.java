import java.util.Scanner;
class Account
{
Scanner member = new Scanner(System.in);
int acc_no;
String cust_name;
void enter()
{
System.out.println ("Enter Customer Name = ");
cust_name=member.nextLine();
System.out.println ("Enter Customer Account Number = ");
acc_no=member.nextInt();
}
}
class Saving_Acc extends Account
{
int savings;
void read()
{
enter();
System.out.println ("Enter Customer Savings = ");
savings=member.nextInt();
System.out.println ("Customer Name: "+cust_name);
System.out.println ("Account No: "+acc_no);
System.out.println ("Your Account Savings Amount=: "+savings);
}
}
class Acct_Details extends Saving_Acc
{
int withdrawals;
void display()
{
read();
System.out.println ("Input withdrawal Totals = ");
withdrawals=member.nextInt();
System.out.println ("Account Closing Balance =: "+(savings-withdrawals));
}
public static void main(String args[])
{
Acct_Details client = new Acct_Details();
client.display();
}
}
