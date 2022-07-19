package Demo1;

public class ex1_space_decrement 
{
public static void main(String[] args) 

//  *
// **
//***
{
	int space=2;
	int star=1;
	for(int i=1;i<=3;i++)
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		space--;
		star++;
	}
}
}
//count no of space in first row and mention it in one variable
//count no of stars in first row and mention it in one variable
// count no of rows and give the condition to outer loop
// then for space give the condition to 1st inner for and print space
//then for column or to print star give the condition to 2nd inner for 
// then blank statement to move cursor in next row
// space is decrease row wise so --
// star increases so ++