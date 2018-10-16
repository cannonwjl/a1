package prime;

import java.util.Scanner;

public class text {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("请输入一个数：");
			int s=scan.nextInt();
			if(s>0)
			{
				int i;
				for(i=2;i<s;i++)
				{
					if(s%i==0)
					{
						break;
					}
				}
				if(i<s)
				{
					System.out.println(s+"不是素数");
				}
				else
				{
					System.out.println(s+"是素数");
				}
			}else {
				System.out.println("输入数据不合法！！");
			}
		}
}
