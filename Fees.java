import java.util.*;
public class Fees{
     String courseCode = c;
     double courseCredit = cc;
     double feeAmount = f;
     double totalFee = ft;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter student id");
     int id=s.nextInt();
     Student st1=new creditLimit();
     st1.creditLimit();
     public void setFee(double cc){
          if (cc==1.5){
               feeAmount=9000;
          }
          else{
          feeAmount=18000;
          }
          System.out.println("Fee amount is "+f);
     }
     public double getFee(){
          return f;
     }
     public double totalFee(){
          int sum=0;
          for(int i=courseCount;i<0;i--){
               getFee();
               sum+=f;
          }
          System.out.println("Total Fee is "+sum);
     }
     
          
         
          
          
          
          
     
     