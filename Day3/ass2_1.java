import java.util.*;
class Marks{
    Scanner sc=new Scanner(System.in);
    int m1,m2,m3,m4,m5,tot;
    float per;
    void cal()
    {
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        tot=m1+m2+m3+m4+m5;
        per=(float)(tot*100)/500;
        System.out.println(per);
        if(per>85) {
        	System.out.println("O grade");
        }
        else if(per>75) {
        	System.out.println("A grade");
        }
        else if(per>65) {
        	System.out.println("B grade");
        }
        else if(per>50) {
        	System.out.println("c grade");
        }
        else if(per>35) {
        	System.out.println("D grade");
        }
        else{
        	System.out.println("F grade");
        }
    }
}

public class ass2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks m=new Marks();
        m.cal();

	}

}