
public class Task6 {
	private String name, address;
	  private int year, salary;
	  public Task6(String n, int y, int sal, String add){
	    name = n;
	    year = y;
	    salary = sal;
	    address = add;
	  }
	  public String getName(){
	    return name;
	  }
	  public int getYear(){
	    return year;
	  }
	  public int getSalary(){
	    return salary;
	  }
	  public String getAddress(){
	    return address;
	  }
	}

	class Emp{
	  public static void main(String[] args){
	    Task6 Employee1 = new Task6("Robert", 1994, 500000, "64C- WallsStreet");
	    Task6 Employee2 = new Task6("Sam", 2000, 740000, "68d- WallsStreet");
	    Task6 Employee3 = new Task6("John", 1999, 600000, "26B- WallsStreet");
	    System.out.println("Name\tYear of joining\tSalary\tAddress");
	    System.out.println(Employee1.getName()+"\t"+Employee1.getYear()+"\t\t\t"+Employee1.getSalary()+"\t"+Employee1.getAddress());  
	    System.out.println(Employee2.getName()+"\t\t"+Employee2.getYear()+"\t\t\t"+Employee2.getSalary()+"\t"+Employee2.getAddress());  
	    System.out.println(Employee3.getName()+"\t"+Employee3.getYear()+"\t\t\t"+Employee3.getSalary()+"\t"+Employee3.getAddress());  
	  }

}
