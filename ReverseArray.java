package session4_assignment;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstArray = new int[]{1,2,3,4};
		int[] reversedArray = new int[firstArray.length];
		System.out.println("The reversed array elements are: ");
		for (int i = firstArray.length -1; i > 0; )
			
		{
			for(int j=0;j<= reversedArray.length-1;j++)
		    {
				reversedArray[j] = firstArray[i];
				System.out.println(reversedArray[j]);
		    	if(i>0)
		    	{
		    		i--;
		    	}
		    }

		}
	}

}
