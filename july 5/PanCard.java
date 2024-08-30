class PanCard{
static String applicationType;
static String categoryOrCaste;
static String lastName;
static String firstNmae;
static String dataOfBirth;

public static void creation(String applnType,String category,String lName,String fName,String dob){
applicationType=applnType;
categoryOrCaste=category;
lastName=lName;
firstNmae=fName;
dataOfBirth=dob;


}
public static void getTheInfo(){
System.out.println("Application Type: "+applicationType);
System.out.println("Category: "+categoryOrCaste);
System.out.println("Last Name: "+lastName);
System.out.println("First Name: "+firstNmae);
System.out.println("Date of Birth: "+dataOfBirth);
}
}