import.java.util*;
public class Faculty extends User{
     Scanner sc=new Scanner(System.in);
    public static String FacultyName="B";
     public static int id="222";
     public static String mail="b@gmail.com";
     public static String role="faculty";
     public static int contact="01719999999";
     public static String username="b123";
     public static String password="123";
     
     public String[] courseToTake(){
          System.out.println("How many course you want to take");
          int c=sc.nextInt();
          String[] course = new String[c];
          for (int i = 0; i < course.length; i++){
               course[i] =sc.nextLine();
          }
          return course;
     }
               
     public double examDate(String[] c){
          System.out.println("Enter exam date for courses");
          String[] date = new String[c.length];
               for (int j=0;j<c.length;j++){
                    c[i]=sc.nextDouble;
               }
               return date;
     }
          