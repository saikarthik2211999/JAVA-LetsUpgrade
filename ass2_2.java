import java.util.Scanner;
class Details{
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	int dob=sc.nextInt();
	int mob=sc.nextInt();
	int yob=sc.nextInt();
	int sal=sc.nextInt();
	int tax;
	void print()
	{
		if(sal>=500000) tax=(20*sal)/100;
		else if(sal>=400000) tax=(15*sal)/100;
		else if(sal>=300000) tax=(10*sal)/100;
		else if(sal>=200000) tax=(5*sal)/100;
		System.out.print("the name is "+name+",age is ");
		int age;
		if(mob<10) age=2020-yob;
		else if(dob>=12 && mob==10) age=2020-yob;
		else age=2020-yob-1;
		System.out.print(age);
		System.out.print(",tax is ");
		System.out.print(tax);		
	}
	
}
public class ass2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Details exe=new Details();
		exe.print();
	}

}
