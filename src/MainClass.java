import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        AtmOperation op = new AtmOperationImpl();

        int atmnumber = 12345;
        int atmpin= 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Welcome TO ATM");
        System.out.print("Enter ATM Number : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter Pin : ");
        int atmPin= in.nextInt();
        if ((atmnumber==atmNumber)&&(atmpin==atmPin)){
           while (true){
               System.out.println("1. View Available Balance \n 2. Withdraw Amount \n 3. Deposit Amount \n 4. View MiniStatement \n 5. Exit");
               System.out.println("Enter Choice : ");
               int ch=in.nextInt();
               if (ch==1)
               {
                   op.viewBalance();
               }
               else if (ch==2)
               {
                   System.out.println("Enter Amount to Withdraw :");
                   double withdrawAmount = in.nextDouble();
                   op.withdrawAmount(withdrawAmount);
               }
               else if (ch==3)
               {
                   System.out.println("Enter Amount to Deposit : ");
                   double depositAmount = in.nextDouble();
                   op.depositAmount(depositAmount);
               }
               else if (ch==4)
               {
                   op.viewMiniStatement();

               }
               else if (ch==5)
               {
                   System.out.println("Collect Your Card\n Thanks!!!");
                   System.exit(0);
               }
               else
               {
                   System.out.println("Enter Correct Choice");
               }
           }

        }else{
            System.out.println("Incorrect ATM Number or Pin");
            System.exit(0);
        }
    }
}