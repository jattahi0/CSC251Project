import java.util.Scanner;


public class Project_Jamilou_Attahirou
{
   public static void main(String[] args)
   {
      //Attributes
      int policyNumber = 0;
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatu = "";
      double height = 0.0;
      double weight = 0.0;
      
      
      //Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Plolicy object
      Policy p = new Policy();
      
      
      //Getting User's Input
      
      System.out.print("Please enter the Policy Number:");
      policyNumber = keyboard.nextInt();
      p.setPolicyNumber(policyNumber);
      
      //Clear the buffer
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name:");
      providerName = keyboard.nextLine();
      p.setProviderName(providerName);
      
      System.out.print("Please enter the Policyholder's First Name:");
      firstName = keyboard.nextLine();
      p.setFirstName(firstName);
      
      System.out.print("Please enter the Policyholder's Last Name:");
      lastName = keyboard.nextLine();
      p.setLastName(lastName);
      
      System.out.print("Please enter the Policyholder's Age:");
      age = keyboard.nextInt();
      p.setAge(age);
      
      //Clear the buffer
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Statu:");
      smokingStatu = keyboard.nextLine();
      p.setSmokingStatu(smokingStatu);
      
      System.out.print("Please enter the Policyholder's height:");
      height = keyboard.nextDouble();
      p.setHeight(height);
      
      System.out.print("Please enter the Policyholder's weight:");
      weight = keyboard.nextDouble();
      p.setWeight(weight);
      
            
      //Clear the buffer
      keyboard.nextLine();
      
      
      //OUTPUT
      System.out.println();
      System.out.println();
      System.out.println("Policy Number: " + p.getPolicyNumber());
      System.out.println("Provider Name: " + p.getProviderName());
      System.out.println("Policyholder's First Name: " + p.getFirstName());
      System.out.println("Policyholder's Last Name: " + p.getLastName());
      System.out.println("Policyholder's Age: " + p.getAge());
      System.out.println("Policyholder's Smoking Statu: " + p.getSmokingStatu());
      System.out.println("Policyholder's Height: " + p.getHeight());
      System.out.println("Policyholder's Weight: " + p.getWeight());
      System.out.println("Policyholder's BMI: " + p.BMI(height, weight));
      System.out.println("Policy Price: " + p.insurancePrice(age, smokingStatu, p.BMI(height, weight)));
   }
}