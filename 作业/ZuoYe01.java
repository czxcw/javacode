
//编写类A01，定义方法max,实现求某个double数组的最大值,并返回
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
         System.out.println("arr的输入有误");


         A02 b = new A02();
         char[] arr02 = {'w', 'o', 'd', 'e', 'l', 'x'};
         char ch = 'o';
         //可以直接传递字符,也可以创建一个字符变量,传递变量名
         System.out.println("索引 = " + b.find(arr02, ch));
         Book c = new Book("红楼梦", 154);
         c.updatePrice();
         c.info();
         c.updatePrice();
         c.info();
         Book d = new Book("羊皮卷", 123.4);
         d.updatePrice();
         d.info();
         Book e = new Book("毛选", 54.6);
         e.updatePrice();
         e.info();
         /*
           使用构造器和this的好处：
           1.构造器使初始化更加方便
           2.this使每次调用方法时不用传递对象参数,更简洁方便
           3.对象和对象之间区别清晰,提高了代码可读性
         */
        /* double b01 = 156;
         double b02 = 124;
         double b03 = 54.1;*/
         A03 f = new A03();
         double[] data = {1.5, 1.6, 4.5, 7.8};
         System.out.println("复制的新数组：");
         double[] data01 = f.copyArr(data);
         f.printArr(data01);
         //圆类
         Circle round = new Circle(3);
         System.out.println("round 的 circumference = " + round.circumference());
         System.out.println("round 的 area = " + round.area());
         //计算类Cale
         Cale j = new Cale(8, 4);
         j.accumulate();
         j.business();
         Cale j01 = new Cale(8, 0);
         j01.sum();
         j01.business();
     }    
}
// 数据的类型一定要匹配
class A01
{
	public Double max(double[] arr)//返回的是一个类
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
//编写类A02,定义方法find,实现查找某字符串数组的元素,并返回索引(下标),若未找到,返回-1;
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
//编写类Book,定义方法updatePrice,实现更改某本书的价格,若价格大于150,就改为150;若价格大于100,就改为100.
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
	//构造器
	public Book(String name, double price)
	{
         this.name = name;
         this.price = price;
	}
	public void updatePrice()
	{
		//若方法中没有price局部变量,this可以不写.
		if(this.price > 150){
			this.price = 150;
		}
		else if(this.price > 100){
			this.price = 100;
		}
	}
	//显示书籍的情况
	public void info()
	{
		System.out.println("书的名字 = " + this.name + "\t" + "书的价格 = " + this.price);
	}
}
//编写类A03,实现数组的复制功能copyArr,输入旧数组,返回一个新数组,元素和旧素组一样
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
	//打印数组
	public void printArr(double[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
             System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
//定义一个圆类Circle,定义属性：半径,提供显示圆周长的方法,提供显示圆面积的方法
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
//创建一个Cale计算类,在其中定义两个变量表示两个操作数,定义四个方法实现求和,差,乘法,除法
//除数为0时,提示
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
			System.out.println("除数不能为0");
		}
		else{
            business = this.data1 / this.data2;
            System.out.println("business = " + business);
		}

	}
}