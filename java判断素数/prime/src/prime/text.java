package prime;

import java.util.Scanner;

public class text {
		public static void main(String[] args)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("������һ������");
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
					System.out.println(s+"��������");
				}
				else
				{
					System.out.println(s+"������");
				}
			}else {
				System.out.println("�������ݲ��Ϸ�����");
			}
		}
}
