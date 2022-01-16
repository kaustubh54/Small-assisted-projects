public class selectionSort {
	[Text Wrapping Break][Text Wrapping Break]   
		public static void main(String[] args) 
{
	[Text Wrapping Break][Text Wrapping Break] 
			int[] arr = {9,6,3,1,2,4,5};[Text Wrapping Break]  
					int length = arr.length;[Text Wrapping Break]  
							selectionSort(arr);[Text Wrapping Break]   
									System.out.println("The sorted elements are:");
							[Text Wrapping Break]
									
									for(int i:arr)
									{[Text Wrapping Break][Text Wrapping Break]      
											System.out.println(i);[Text Wrapping Break]  
													}
							[Text Wrapping Break] 
									}
[Text Wrapping Break][Text Wrapping Break]  
		public static void selectionSort(int[] arr)
{
	[Text Wrapping Break][Text Wrapping Break]   
			for(int i=0;i<arr.length-1;i++)
			{
				[Text Wrapping Break][Text Wrapping Break]      
						int index =i;[Text Wrapping Break]  
								for(int j=i+1;j<arr.length;j++)
								{
									[Text Wrapping Break]    
											if(arr[j]<arr[index])
											{
												[Text Wrapping Break][Text Wrapping Break]   
														index =j;[Text Wrapping Break] 
              }[Text Wrapping Break][Text Wrapping Break]  
         }
						[Text Wrapping Break]       
								int smallNumber = arr[index];[Text Wrapping Break]   
										arr[index]= arr[i];[Text Wrapping Break]    
												arr[i]= smallNumber;[Text Wrapping Break]   
														}[Text Wrapping Break][Text Wrapping Break] 
																}
[Text Wrapping Break]
		} 




 