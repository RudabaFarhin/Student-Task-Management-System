import java.util.*;
public class Student extends User{
     public static String StudentName="A";
     public static int id="111";
     public static String mail="a@gmail.com";
     public static String role="student";
     public static int contact="01718888888";
     public static String username="a123";
     public static String password="123";
     
     Scanner sc=new Scanner(System.in);
     public double creditLimit(){
          System.out.println("Enter your cgpa");
          double cgpa=sc.nextDouble;
          if(cgpa<3.0){
               creditLimit=9.0;
          }
          else if (cgpa<3.5 && cgpa>3.0){
               creditLimit=12.0;
          }
          else {
               creditLimit=15.0;
          }
          return creditLimit;
     }
     public String[] wantedCourse(){
          System.out.println("How many course you want to take");
          int c=sc.nextInt();
          String[] course = new String[c];
          for (int i = 0; i < course.length; i++){
               course[i] =sc.nextLine();
          }
          return course;
     }
               
     
          
          