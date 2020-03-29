public class Permission {
     public static boolean managerExit=false;
     System.out.println("Enter Login Username or Enter 0 to go back");
               if(scn.hasNextInt()){
                 if(scn.nextInt()==0){break;}
                 else{System.out.println("Invalid Username");}
               }else if(scn.hasNext()){
                String x=scn.next();
                   System.out.println("Enter Password: ");
                   String y=scn.next();
                   
                   if(x.equals(Admin.userame)&&y.equals(Admin.password)){
                        Admin.AdminInfo();
                        ad.fees;
                        ad.examinfo;
                        ad.courseinfo;
                   }
                   else if(x.equals(Student.username)&&y.equals(Student.passord)){
                        Student.studentInfo();
                        st.result;
                        st.courseinfo;
                        st.examinfo;
                        st.feesSituation;
                   }
                   else if(x.equals(Faculty.username)&&y.equals(Faculty.password)){
                        Faculty.facultyInfo();
                        fc.courseinfo;
                        fc.examinfo;
                   else{
                       System.out.println("Wrong Informations. Please try again");
                   }
                }