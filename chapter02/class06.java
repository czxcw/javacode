//��ӡ�ַ���ϰ
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
	//����>> �������ӡ�ַ�
	public void printCharacter(int rows, char ch)
	{
		//��ӡһ������(��Ҫ����������)
		//����������ӡ�ַ�����(����������������)1. i; 2. 2*i-1
		//��ӡ�ո�,�������������ӣ��ո��ڼ��٣����ɣ�������-��ǰ����
		//��ͼ���ڲ�ȫΪ�ո�,��һ�к����һ��ȫ��ӡ��ÿ�е���βȫ��ӡ
		//�����ͼ�γ�Ϊ����,��������ı�ÿ�е��ַ���ӡ����
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
		//����ı�Ϊ���Σ�ֻ�ʺ�����Ϊ����
		//�����Ϊ����������,�ϰ벿�ֲ��ı�,��ӡ�ַ�����Ϊ ������/2 + 1
		// �°벿�֣���ӡ�ո����Ϊ ��ǰ���� - ���������� + 1��
		// �°벿�֣���ӡ�ַ�����Ϊ �������� * 2 + 3 -����ǰ���� - ����������*2
		// �°벿�֣�ȫ��ӡ
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