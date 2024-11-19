class RelationalOperator {
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		boolean b = i <= j;

		System.out.println("i > j  = "+ b);
		RelationalOperator cal = new RelationalOperator();
		cal.calculate(i, j);
		calculate(3, 4);
	}

	public static void calculate(int i , int j){
		 int  sum  = i + j;

		 System.out.println("Sum (i + j ) : "+ sum );


	}
}