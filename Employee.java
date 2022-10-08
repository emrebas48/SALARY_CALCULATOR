

public class Employee{
  private String name;
  private float salary;
  private float workHours;
  private int hireYear;

  public Employee(String name, float salary, float workHours, int hireYear){
    this.name=name;
    this.salary=salary;
    this.workHours=workHours;
    this.hireYear=hireYear;
  }

  public String getName(){
    return this.name;
  }
  public float getSalary(){
    return this.salary;
  }
  public float getWorkHours(){
    return this.workHours;
  }
  public int getHireYear(){
    return this.hireYear;
  }

  public void setName(String name){
    this.name=name;
  }
  public void setSalary(float salary){
    this.salary=salary;
  }
  public void setWorkHours(float workHours){
    this.workHours=workHours;
  }
  public void setHireYear(int hireYear){
    this.hireYear=hireYear;
  }
  

  public float tax(){  
    float total=getSalary()+bonus();  // tax for monthly salary + bonus 
    if(total>=1000){
      return (total*3/100);
    }
    return 0;
  }

  public float bonus(){
    float workHours=getWorkHours();
    if(workHours>40){ 
      return ((workHours-40)*30*4);  // bonus for 1 month 
    }
    return 0;
    }

  public float raiseSalary(){   // Net Salary
    int hireYear=getHireYear();
    float salary=getSalary();
    int workYear= 2021-hireYear;
    if(workYear<10){
      salary=salary + salary*5/100 +bonus() - tax();
      return salary;
    }
    else if(workYear>9 && workYear<20){
      salary=salary + salary*10/100 +bonus() - tax();
      return salary;
    }
    else{
      salary=salary + salary*15/100 +bonus() - tax();
      return salary;  
    }
  }

  @Override
  public String toString(){
    return "Name:"+name+"  "+"Salary:"+salary+"  "+"Work Hours:"+workHours+"  "+"Hire Year:"+hireYear+"  "+"Bonus:"+bonus()+"  "+"Tax:"+tax()+"  "+"Salary increase:"+(raiseSalary()-salary-bonus()+tax())+"  "+"Net Salary:"+raiseSalary()+"  "+"Gross Salary:"+(raiseSalary()+tax());
  }

  
  
  
}