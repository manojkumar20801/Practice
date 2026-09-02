class Rev1
{
	public static void main(String[] args)
	{
		char arr[]={'c','d','a','b','z','e'};
		
		int left = 0;
        int right = arr.length - 1;
		
		 while (left < right) 
		 {
           
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            
            left++;
            right--;
         }
		 
		 /*for(i=0;i<arr.length-1;i++)
		 {
			 System.out.print(arr[i]);
		 }*/
		 System.out.println(java.util.Arrays.toString(arr));
	}
}