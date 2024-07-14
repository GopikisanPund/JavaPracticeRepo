package DesignPattern;

public class HelloSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 5;
		for(int i = 0;i< no;i++)
		{
			for(int j = 0;j< no;j++)
			{
				if(i==0||i==no-1||j==0||j==no-1)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
