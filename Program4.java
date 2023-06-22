
public class Program4 {
	 
		static void divide(int[] multiple,int[] input)
		{
			System.out.print("{");
			for(int i=0;i<multiple.length;i++)
			{
				int count=0;
				for(int j=0;j<input.length;j++)
				{
					if(multiple[i]>input[j] && input[j]!=1 && input[j]>=multiple[i])
					{
						if(multiple[i]%input[j]==0)
						{
						count++;
						}
					}
					else if(multiple[i]<input[j])
					{
						if(input[j]%multiple[i]==0)
						{
							count++;
						}
					}
					else if(multiple[i]==input[j])
					{
						count++;
					}
					
				}
				System.out.print(multiple[i]+":"+count);
				if(multiple[i]<multiple.length)
				{
					System.out.print(",");
				}
				count=0;
			}
			System.out.print("}");
		}

		public static void main(String[] args) {
			int[] multiple= {1,2,3,4,5,6,7,8,9};
			int[] input= {1,2,8,9,12,46,76,82,15,20,30};
			divide(multiple,input);

		}

	}



