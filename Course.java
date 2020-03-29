import java.util.*;
public class Course{
     Scanner sc=new Scanner(System.in)
     
     System.out.println("Enter your role");
     String role=sc.nextLine;
     if (role==faculty){
     System.out.println("Enter faculty id");
     int id=s.nextInt();
     Faculty f=new courseToTake();
     f.courseToTake();
     }
     if (role==student){
     System.out.println("Enter student id");
     int id=s.nextInt();
     Student st=new wantedCourse();
     st.wantedCourse();
     }
     if (role==admin){
     System.out.println("What do you want to see?");
     String s=sc.nextLine();
     if (s==fees){
     System.out.println("Enter student id");
     int id=s.nextInt();
     Fees f=new totalFee();
     f.totalFee();
     }
     else if (s==courseOfStudent){
     System.out.println("Enter student id");
     int id=s.nextInt();
     Student st=new wantedCourse();
     st.wantedCourse();
     }
     else {
     System.out.println("Enter faculty id");
     int id=s.nextInt();
     Faculty f=new courseToTake();
     f.courseToTake();
     }
     }
}
          
                             