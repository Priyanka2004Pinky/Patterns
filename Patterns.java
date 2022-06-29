//import java.util.*;

/*  Output     -->  *****
					*****
					*****
					*****  */
/* class Patterns
	{
    public static void main(String[] args)
		{
			System.out.println("Enter number of Columns");
			Scanner sc = new Scanner(System.in);
			int Col = sc.nextInt();               //--> 5
			System.out.println("Enter number of Rows");
			int Row = sc.nextInt();              // --> 4

			for(int i=1; i<Col; i++)
			{
				for(int j=1; j<=Row; j++)
				{
					System.out.print("*");
				}
				System.out.println("*");         
			}
			System.out.println();
		}
	}	
*/
/*  Output     -->  *****
					*	*
					*	*
					*****  */
 
/* class Patterns
	{
    public static void main(String[] args)
		{
			System.out.println("Enter number of Columns");
			Scanner sc = new Scanner(System.in);
			int Col = sc.nextInt();               //--> 5
			System.out.println("Enter number of Rows");
			int Row = sc.nextInt();              // --> 4

			for(int i=1; i<=Col; i++)
			{
				for(int j=1; j<=Row; j++)
				{
					if( i==1 || j==1 || i==Col || j==Row)
					{
					System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println(" ");
			}
			System.out.println();
		}
	} 
 */

	/*  Output     -->  *
	 					**
						***
						**** 		
	*/

	/* class Patterns
	{
    public static void main(String[] args)
		{
			System.out.println(""Enter number"");
			Scanner sc = new Scanner(System.in);
			int m = sc.nextInt();               //--> 5
			
			for(int i=1; i<=m; i++)
			{
				for(int j=1; j<=i; j++)
				{
				System.out.print("*");
				}
				System.out.println(" ");
			}
		}
	}	*/

	/*  Output     -->  ****
	 					***
						**
						* 		
	*/

class Patterns
{
	public static void main(String[] args)
	{
		int Row = 4;

		for(int i=Row; i>=1; i--) 			//i=4      ----> i=3
		{
			for(int j=1; j<=Row; j++)		//j=1, 2, 3
			{
				System.out.print("*");  	// ****
			}                              // ***
			System.out.println(" ");
		}
	}
}
        