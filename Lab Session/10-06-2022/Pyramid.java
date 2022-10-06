/*
 @Author- Shivam Singh
 @Date- 6/10/2022
 Question3:WAP to create ReversePyramid
 */
package Core_Java;

class Pyramid 
{
	public static void main(String[] args)
	{
		//row wise
		for(int i=1;i<=4;i++)
		{
			//columns wise
			for(int j=1;j<=7;j++)
			{
				if(j>=i && j<=8-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
