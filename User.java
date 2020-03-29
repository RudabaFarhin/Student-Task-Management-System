public class User{
    int userID;
    
    Scanner scn=new Scanner(System.in);
    public static void head(){
    public String name,n_copy;
    public int id,i_copy;
    public String mail,m_copy;
    public String role,r_copy;
    public int contact,c_copy;
    private String password,p_copy;
    private String username,un_copy;
 
    boolean flag=true;
    
    public String getName(){
          return name;
     }
     public int getId(){
     return id;
     }
     public String mail(){
          return mail;
     }
     public String role(){
          return role;
     }
     public int contact(){
          return contact;
     }
     
     public void setName(String n){
          name=n;
     }
     public void setId(String i){
          id=i;
     }
     public void setMail(String m){
          mail=m;
     }
     public void setRole(String r){
          role=r;
     }
     public void setContact(String c){
          contact=c;
     }
  
    public void addUser(){
    userID=UserManagement.UserID;
    System.out.print("Please, Enter your name: ");
    name=scn.nextLine();
    n_copy=name;   
    while(true){
     System.out.print("Enter id: ");
      if(scn.hasNextInt()){
      id=scn.nextInt();
       i_copy=id;
    }
  System.out.print("Enter your mail: ");
    mail=scn.nextLine();
    m_copy=mail;
    System.out.print("Enter your role: ");
       role=scn.nextLine();
       r_copy=role;
     System.out.print("Enter your contact: ");
       contact=scn.nextInt();
       c_copy=contact; 
    }
    }
    while(true){
    System.out.println("Enter password: ");
    String x=scn.next();
    System.out.print("Re-enter your password: ");
    String y=scn.next();
    if(x.equals(y)){
    password=x;
    p_copy=password;
    System.out.println("Enter username: ");
    String z=scn.next();
    usename=z;
    un_copy=username;
    
  public void deleteUser(String n,int i,String m,String r,int c,String un){
       name=n;
       id=i;
       mail=m;
       role=r;
       contact=c;
       username=un;
       }
}
    public void editUser(String un,String p){
       
    System.out.println("\nPlease select the option you want to update:\n1.Name 2.ID  3.Mail 4.Contact  5.Password  6.Username \n7.Go Back \nPlease select any option from 1 to 7:");
            int u=1;
            while(true){
          if(scn.hasNextInt()&&u<=7&&u>=1){
          u=scn.nextInt();
          break;
          }else{
          System.out.println("Invalid Input.Please enter again");
          String x=scn.next();
          }
            }
            String c=scn.nextLine();
            
            if(u==1){
                
                System.out.println("Enter Name:");
                name=scn.nextLine();
              
                ReadingWriting.replacer(n_copy, name, userID);
                n_copy=name;
                break;
                
            }else if(u==2){
                System.out.println("Enter ID:");
                id=scn.nextint();
                break;
            }else if(u==3){
                System.out.println("Enter mail:");
                mail=scn.nextLine();
                break;
            }
            else if (u==4){
                 System.out.println("Enter contact:");
                 contact=nextLine();
            }else if(u==5){
                System.out.println("Enter old password ");
                String a=scn.next();
                if(a.equals(password)){
                while(true){
                System.out.println("Enter password: ");
                String x=scn.next();
                System.out.print("Re-enter your password: ");
                String y=scn.next();
                if(x.equals(y)){
                password=x;}
               
                break;
                }
                }else{   
                    System.out.println("The password do not match try again");
                }
                else if(u==6){
                System.out.println("Enter username:");
                username=scn.nextLine();
                break;
            }else if(u==7){
            break;
            }
 public void searchUser(String n,int i,String m,String r,int c){
       name=n;
       id=i;
       mail=m;
       role=r;
       contact=c
       }
}
