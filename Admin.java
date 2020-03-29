public class Admin extends User{
      public static String AdminName="C";
     public static int id="333";
     public static String mail="c@gmail.com";
     public static String role="Admin";
     public static int contact="01818888888";
     public static String username="c123";
     public static String password="123";
     
     public static void AdminInfo() throws FileNotFoundException{
     Scanner scn=new Scanner(System.in);
     int x=0;
     String info[];
     while(x==1||x==0){
      System.out.println("Enter an option: ");
      System.out.println("1.View all user info\n2.Exit");
      
      if(scn.hasNextInt()){
      x=scn.nextInt();}
      else{x=0;System.out.println("Wrong input.Please enter again");}
      
      if(x>=1 && x<=2){
          if(x==1){
              File f=new File("D:\\studentmanagement\\src\\management\\database.txt");
              Scanner sc=new Scanner(f);
           while(sc.hasNextLine()){
             String s=sc.nextLine();
             info=s.split(",");
             System.out.println("AccountID: "+info[0]+". Name: "+info[2]+". Mail: "+info[3]+". Role: "+info[4]+". Contact: "+info[5]);
           }
          }       
        }else if(x==2){
        UserManagement.AdminExit=true;
        x=2;
        }
        else{
        System.out.println("Invalid Input");
        }      
     }
 }
}
