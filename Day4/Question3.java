package Day4;
import java.util.Scanner;
class Sum{
	Scanner sc=new Scanner(System.in);
	int[] array=new int[5];
	void get() {
		for(int i=0;i<5;i++) {
			System.out.println("Enter number");
			array[i]=sc.nextInt();
		}
	}
	void print() {
		int sum=0;
		for(int i=0;i<5;i++) {
			sum=sum+array[i];
		}
		System.out.println("The values are :");
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
		System.out.println("The sum is "+sum);
	}
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum run=new Sum();
		run.get();
		run.print();
	}

}
