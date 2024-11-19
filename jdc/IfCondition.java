import java.util.*;
public class IfCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter Your mark : " );
		int mark = sc.nextInt();
		if(mark <= 100 && mark >= 80 ) {
			System.out.println("Great : A");

		}else if(mark < 80 && mark >= 60) {

			System.out.println("Great : B");

		}else if(mark < 60 && mark >= 40) {

			System.out.println("Great : C");

		}else{
			System.out.println("Great : D");
		}
	}
}