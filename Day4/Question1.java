package Day4;
import java.util.*;
class Avenger{
	Scanner sc=new Scanner(System.in);
	String name,power,weapon,planet;
	int age;
	void getDetails() {
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter power");
		power=sc.nextLine();
		System.out.println("Enter weapon");
		weapon=sc.nextLine();
		System.out.println("Enter planet");
		planet=sc.nextLine();;
		System.out.println("Enter age");
		age=sc.nextInt();
	}
	void displayDetails() {
		System.out.println("The name is "+name+",age is "+age+", power is "+power+", weapon is "+weapon+", planet is "+planet);
	}
}
public class Question1 {
	public static void main(String[] args) {
		Avenger[] mem=new Avenger[5];
		for(int i=0;i<5;i++)
		{
			mem[i]=new Avenger();
			mem[i].getDetails();
		}
		for(int i=0;i<5;i++)
		{
			mem[i].displayDetails();
		}
		
	}

}
