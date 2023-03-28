import java.util.Scanner;


public class Project_Jamilou_Attahirou
{
   public static void main(String[] args)
   {
      //Attributes
      int policyNumber = "";
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatu = "";
      height = 0.0;
      weight = 0.0;
      
      
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Plolicy object
      Policy p = new Policy();
      
      System.out.print("Please enter the Policy Number:");
      policyNumber = keybaord.nextLine();
      
      System.out.print("Please enter the Provider Name:");
      providerName = keybaord.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name:");
      firstName = keybaord.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name:");
      lastName = keybaord.nextLine();
      
      System.out.print("Please enter the Policyholder's Age:");
      age = keybaord.nextInt();
      
      System.out.print("Please enter the Policyholder's Smoking Statu:");
      smokingStatu = keybaord.nextLine();
      
      System.out.print("Please enter the Policyholder's height:");
      height = keybaord.nextDouble();
      
      System.out.print("Please enter the Policyholder's weight:");
      weight = keybaord.nextDouble();
      
      //Clear the buffer
      keyboard.nextLine();
      
      //OUTPUT
      System.out.println("Policy Number:" + p.getPolicyNumber());
      System.out.println("Provider Name:" + p.getProviderName());
      System.out.println("Policyholder's First Name:" + p.getFirstName());
      System.out.println("Policyholder's Last Name:" + p.getLastName());
      System.out.println("Policyholder's Age:" + p.getAge());
      System.out.println("Policyholder's Smoking Statu:" + p.getSmokingStatu());
      System.out.println("Policyholder's Height:" + p.getHeight());
      System.out.println("Policyholder's Weight:" + p.getWeight());
   }
}