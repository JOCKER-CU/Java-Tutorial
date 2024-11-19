import java.util.Scanner;
class SwitchStatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch(num){

		case 10: yourNum(num);break;
		case 20: yourNum(num);break;
		case 30: yourNum(num);break;
		case 40: yourNum(num);break;
		case 50: yourNum(num);break;
		case 60: yourNum(num);break;
		case 70: yourNum(num);break;
		case 80: yourNum(num);break;
		case 90: yourNum(num);break;
		case 100: yourNum(num);break;
		default: System.out.println("Not Included!");
		}

	}
	public static void yourNum(int x){
		System.out.println(x);
	}
}      