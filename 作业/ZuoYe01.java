
//��д��A01�����巽��max,ʵ����ĳ��double��������ֵ,������
public class ZuoYe01
{
	public static void main(String[] args)
	{
         A01 a = new A01();
         double[] arr01 = {1.1, 2.5, 5.4, 8.9};
         Double res = a.max(arr01);
         if(res != null)
         System.out.println("max = " + res);
         else
         System.out.println("arr����������");


         A02 b = new A02();
         char[] arr02 = {'w', 'o', 'd', 'e', 'l', 'x'};
         char ch = 'o';
         //����ֱ�Ӵ����ַ�,Ҳ���Դ���һ���ַ�����,���ݱ�����
         System.out.println("���� = " + b.find(arr02, ch));
         Book c = new Book("��¥��", 154);
         c.updatePrice();
         c.info();
         c.updatePrice();
         c.info();
         Book d = new Book("��Ƥ��", 123.4);
         d.updatePrice();
         d.info();
         Book e = new Book("ëѡ", 54.6);
         e.updatePrice();
         e.info();
         /*
           ʹ�ù�������this�ĺô���
           1.������ʹ��ʼ�����ӷ���
           2.thisʹÿ�ε��÷���ʱ���ô��ݶ������,����෽��
           3.����Ͷ���֮����������,����˴���ɶ���
         */
        /* double b01 = 156;
         double b02 = 124;
         double b03 = 54.1;*/
         A03 f = new A03();
         double[] data = {1.5, 1.6, 4.5, 7.8};
         System.out.println("���Ƶ������飺");
         double[] data01 = f.copyArr(data);
         f.printArr(data01);
         //Բ��
         Circle round = new Circle(3);
         System.out.println("round �� circumference = " + round.circumference());
         System.out.println("round �� area = " + round.area());
         //������Cale
         Cale j = new Cale(8, 4);
         j.accumulate();
         j.business();
         Cale j01 = new Cale(8, 0);
         j01.sum();
         j01.business();
     }    
}
// ���ݵ�����һ��Ҫƥ��
class A01
{
	public Double max(double[] arr)//���ص���һ����
	{
		if(arr != null && arr.length > 0)
		{
			double max01 = 0;
			for(int i = 1; i < arr.length; i++)
			{
	            if(arr[i] > arr[i - 1])
	                max01 = arr[i];
	            else
	                max01 = arr[i - 1];     
			}
			return max01;
	    }
	    else
	    {
	    	return null;
	    }
	}
}
//��д��A02,���巽��find,ʵ�ֲ���ĳ�ַ��������Ԫ��,����������(�±�),��δ�ҵ�,����-1;
class A02
{
	public int find(char[] arr, char ch)
	{
		if(arr != null && arr.length > 0)
		{
			for(int i = 0; i < arr.length; i++)
			{
				if(arr[i] == ch)
					return i;
			}
			return -1;
	    }
	    else
		return -1;
		/*
           public int find(String findstr, String[] strs)
           {
	            for(int i = 0; i < strs.length; i++)
	            {
	                if(findstr.equals(strs[i]))
	                {
	                     return i;
	                }
	            }
	            return -1;
           }
		*/
	}
}
//��д��Book,���巽��updatePrice,ʵ�ָ���ĳ����ļ۸�,���۸����150,�͸�Ϊ150;���۸����100,�͸�Ϊ100.
/*class Book
{
	public double updatePrice(double book)
	{
          if(book > 150)
          return 150;
          else if(book > 100)
          return 100;
               else
               	return book;
	}
}*/
class Book
{
	String name;
	double price;
	//������
	public Book(String name, double price)
	{
         this.name = name;
         this.price = price;
	}
	public void updatePrice()
	{
		//��������û��price�ֲ�����,this���Բ�д.
		if(this.price > 150){
			this.price = 150;
		}
		else if(this.price > 100){
			this.price = 100;
		}
	}
	//��ʾ�鼮�����
	public void info()
	{
		System.out.println("������� = " + this.name + "\t" + "��ļ۸� = " + this.price);
	}
}
//��д��A03,ʵ������ĸ��ƹ���copyArr,���������,����һ��������,Ԫ�غ;�����һ��
class A03
{
	public double[] copyArr(double[] oldarr)
	{
          double[] newarr = new double[oldarr.length];
          for(int i = 0; i < oldarr.length; i++)
          {
                 newarr[i] = oldarr[i];
          }
          return newarr;
	}
	//��ӡ����
	public void printArr(double[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
             System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
//����һ��Բ��Circle,�������ԣ��뾶,�ṩ��ʾԲ�ܳ��ķ���,�ṩ��ʾԲ����ķ���
class Circle
{
	double radius;
	public Circle(double radius)
	{
         this.radius = radius;
	}
	public double circumference()
	{
		return 2 * Math.PI * this.radius;
	}
	public double area()
	{
         return Math.PI * this.radius * this.radius;
	}
}
//����һ��Cale������,�����ж�������������ʾ����������,�����ĸ�����ʵ�����,��,�˷�,����
//����Ϊ0ʱ,��ʾ
class Cale
{
	double data1;
	double data2;
	public Cale(double data1, double data2)
	{
         this.data1 = data1;
         this.data2 = data2;
	}
	public void sum()
	{
		double sum = this.data1 + this.data2;
		System.out.println("sum = " + sum);
	}
	public void difference()
	{
		double difference = this.data1 - this.data2;
		System.out.println("difference = " + difference);
	}
	public void accumulate()
	{
		double accumulate = this.data1 * this.data2;
		System.out.println("accumulate = " + accumulate);
	}
	public void business()
	{
		double business;
		if(this.data2 == 0){
			System.out.println("��������Ϊ0");
		}
		else{
            business = this.data1 / this.data2;
            System.out.println("business = " + business);
		}

	}
}