/*dont forget class employeeinfo is called in main class of employye so never
include to other class.*/
package secondClass;


public class Employee 
{
    
    public static void main(String[] args)
    {
        EmployeeInfo e=new EmployeeInfo("anuj","shrestha",1222.22f);
        System.out.println("your full name is: "+e.getfullName());
        System.out.println("your salary is: "+e.showSalary());
        //always call function through object ie. e
        
    }
 }
    class EmployeeInfo
    {
        private String firstName;
        private String lastName;
        private float salary;
        public EmployeeInfo(){};
        public EmployeeInfo(String firstName,String lastName, float salary)
        {
            this.firstName= firstName;
            this.lastName=lastName;
            this.salary=salary;
        }
        public String getfirstName()//getter is used n should have upper case infun
        {
            return firstName;
        }
        public String setfirstName(String ln)//in set argument should be passed
        {
            return firstName=ln;//argument is given class value.
        }
        public String getlastName()
        {
            return lastName;
           
        }
        public String setlastName(String tn)
        {
            return lastName=tn;
        }
        
        public String getfullName()
        {
            return firstName+" "+lastName;
            
        } 
        public float getSalary()
               
        {
            return (salary);
        }
        public float setSalary(float s)
                {
                    
                    return salary=s;
                }
        
        public float incrementSalary()
        {
            return salary=salary*0.5f;//f pani rakhnu parcha for float in java
        }
        public float showSalary()
        {
           return salary;
        }
        
      }
            
        
   
     

