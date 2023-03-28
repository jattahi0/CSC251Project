public class Policy
{

   /**  ATTRIBUTES
      Policy Number
      Provider Name
      Policyholder’s First Name
      Policyholder’s Last Name
      Policyholder’s Age
      Policyholder’s Smoking Status (will be “smoker” or “non-smoker”)
      Policyholder’s Height (in inches)
      Policyholder’s Weight (in pounds)
   */

   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatu;
   private double height;
   private double weight;
   
   public double BMI;
   
   //no-arg constructor
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatu = "";
      height = 0.0;
      weight = 0.0; 
   }
   
   
   //constructor that accepts arguments 
   public Policy(int policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatu, double height, double weight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatu = smokingStatu;
      this.height = height;
      this.weight = weight; 
   }
   
   
   //Setter method
    public void setPolicyNumber(int policyNumber)
   {
    this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
    this.providerName = providerName;
   }

   public void setFirstName(String firstName)
   {
    this.firstName = firstName;
   }

   public void setLastName(String lastName)
   {
    this.lastName = lastName;
   }

   public void setAge(int age)
   {
    this.age = age;
   }

   public void setSmokingStatu(String smokingStatu)
   {
    this.smokingStatu = smokingStatu;
   }

   public void setHeight(double height)
   {
    this.height = height;
   }

   public void setWeight(double weight)
   {
    this.weight = weight;
   }


   //Getters method

   public int getPolicyNumber()
   {
    return policyNumber;
   }

   public String getProviderName()
   {
    return providerName;
   }

   public String getFirstName()
   {
    return firstName;
   }

   public String getLastName()
   {
    return lastName;
   }

   public int getAge()
   {
    return age;
   }

   public String getSmokingStatu()
   {
    return smokingStatu;
   }

   public double getHeight()
    {
     return height;
    }

   public double getWeight()
   {
     return weight;
   }


   //Method That calculate the BMI
   public double BMI(double height, double weight)
   {
       return (weight * 703) / (height * height);     
   }
   
   //Method that calculate and return the prrice of the issurance
   public double insurancePrice(int age, String smokingStatu, double BMI)
   {
      final double BASE_FEE = 600.0;
      double additionalFee = 0.0; 
      double finalFee = 0.0;
      
      if(BMI > 35)
      {
         additionalFee = (BMI - 35) * 20;
         
         if(smokingStatu == "smoker")
         {
            additionalFee += additionalFee + 100;
            
            if(age > 50)
            {
               additionalFee += additionalFee + 75;
            }
         }
      }
      else
      {
         finalFee = BASE_FEE;
      }
      
      finalFee = BASE_FEE + additionalFee;
      return finalFee;
      
   }



}