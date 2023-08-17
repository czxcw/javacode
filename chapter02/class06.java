//打印字符练习
public class class06
{
    public static void main(String[] args)
    {
         PrintCharacter pc = new PrintCharacter();
         //pc.printCharacter(9, '#');
         pc.print(9,'*');

    }	
}
class PrintCharacter
{
	//方法>> 按需求打印字符
	public void printCharacter(int rows, char ch)
	{
		//打印一个矩形(需要行数与列数)
		//根据行数打印字符个数(让列数跟着行数走)1. i; 2. 2*i-1
		//打印空格,随着行数的增加，空格在减少，规律：总行数-当前行数
		//让图形内部全为空格,第一行和最后一行全打印，每行的首尾全打印
		//让这个图形成为梯形,根据需求改变每行的字符打印个数
		for(int i = 1; i <= rows; i++)
		{
			 for(int space = 1; space <= rows - i; space++)
			 {
                System.out.print(" ");
			 }
             for(int j = 1; j <= 2 * i + 3; j++)
             {
             	if(j == 1 || j == 2 * i + 3 || i == rows || i == 1)
             	{
             	   System.out.print(ch);
                }
                else
                {
                	System.out.print(" ");
                }
             }
             System.out.println();
		}
	}
	public void print(int rows, char ch)
	{
		//将其改变为菱形，只适合行数为奇数
		//将其分为上下两部分,上半部分不改变,打印字符行数为 总行数/2 + 1
		// 下半部分，打印空格个数为 当前行数 - （半数行数 + 1）
		// 下半部分，打印字符个数为 半数行数 * 2 + 3 -（当前行数 - 半数行数）*2
		// 下半部分，全打印
		for(int i = 1; i <= rows; i++)
		{
			 int b = rows / 2 + 1;
			 if(i <= b)
			 {
				 for(int space = 1; space <= b - i; space++)
				 {
	                System.out.print(" ");
				 }
	             for(int j = 1; j <= 2 * i + 3; j++)
	             {
	             	if(j == 1 || j == 2 * i + 3 || i == 1)
	             	{
	             	   System.out.print(ch);
	                }
	                else
	                {
	                	System.out.print(" ");
	                }
	             }
	             System.out.println();
	          }
	          else
	          {
	          	  for(int space = 1; space <= i - b; space++)
	          	  {
                     System.out.print(" ");
	          	  }
	          	  for(int j = 1; j <= 4 * b - 2 * i + 3; j++)
	              {
		             	if(j == 1 || j == 4 * b - 2 * i + 3 || i == rows)
		             	{
		             	   System.out.print(ch); 
		                }
		                else
		                {
		                	System.out.print(" ");
		                }
	              }
	             System.out.println();
	          }
		}

	}
}