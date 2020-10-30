package day2;
class Employee{
	String name="army";
	int age=21;
	String city="kakinada";
	public void display() {
		System.out.println("The name is "+name+", age is "+age+", city is "+city);
	}
}
public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		obj1.display();
		Employee obj2=new Employee();
		obj2.display();
	}

}
