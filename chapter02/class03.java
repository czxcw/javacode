
//成员方法练习
public class class03
{
	public static void main(String[] args)
	{
        int[][] map = {{0,0,1},{1,1,3},{1,1,1}};
        MyTool tool = new MyTool();
        tool.printArr(map);
	}
}

//定义一个MyTool类
class MyTool
{
	public void printArr(int[][] map)
	{
         for(int i = 0; i < map.length; i++)
         {
             for(int j = 0; j < map[i].length; j++)
             {
                  System.out.print(map[i][j] + " ");
             }
                  System.out.println();
         }
	}
}