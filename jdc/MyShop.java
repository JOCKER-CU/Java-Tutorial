class MyShop {
	public static int total(int qty , int price , int a){
		int t = qty * price;

		System.out.println("Your Total is : " + t);
		System.out.println("Your cash is : " + (a - t));
		return t;

	
} 

	public static void main(String[] args) {
		
		int menuNum = 2;
		int quantity = 5;
		int cash = 8000;

		int x = 0;
		System.out.println("1. Apple => 1500 kyats");
		System.out.println("2. Orange => 1000 kyats");
		System.out.println("3. Ice Coffee => 3500 kyats");

		if(menuNum == 1){
			
			x = total(quantity, 1500 , cash);

		}else if(menuNum == 2){

			x =total(quantity , 1000 , cash);

		}else if(menuNum == 3){

			x = total(quantity, 3000 , cash);

			
		}
		System.out.println("hell" + x);

	}
	}