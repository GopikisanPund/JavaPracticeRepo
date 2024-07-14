package Array;

public class PrintDuplicateno {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		int arr[]= {12,31,12,45,45,65,34,654,654};
		
		for(int i = 0;i<=arr.length-1;i++)
		{
			for(int j = i +1;j<=arr.length-1;j++)
			{
				if (arr[i]==arr[j])
				{
				System.out.println(arr[j]);	
				}
			}
		}

	}

}
