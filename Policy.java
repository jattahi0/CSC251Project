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

   private String policyNumber;
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
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatu = "";
      height = 0.0;
      weight = 0.0; 
   }
   
   
   //constructor that accepts arguments 
   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatu, double height, double weight)
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
    public void setPolicyNumber(String policyNumber)
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

   public String getPolicyNumber()
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

   public String geLastNamet()
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

}