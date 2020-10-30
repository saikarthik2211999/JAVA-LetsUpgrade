package Day4;
import java.util.*;
class OddData{
	Scanner sc=new Scanner(System.in);
	int[] array=new int[5];
	void get() {
		for(int i=0;i<5;i++) {
			System.out.println("Enter number");
			array[i]=sc.nextInt();
		}
	}
	void print() {
		for(int i=0;i<5;i++) {
			System.out.println(array[i]);
		}
	}
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddData run=new OddData();
		run.get();
		run.print();

	}

}
